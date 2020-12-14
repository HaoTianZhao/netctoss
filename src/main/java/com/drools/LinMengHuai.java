/*
 * Software License Declaration.
 *
 * zhilingsd.com, Co,. Ltd.
 * Copyright © 2016 All Rights Reserved.
 *
 * Copyright Notice
 * This documents is provided to zhilingsd contracting agent or authorized programmer only.
 * This source code is written and edited by zhilingsd Co,.Ltd Inc specially for financial
 * business contracting agent or authorized cooperative company, in order to help them to
 * install, programme or central control in certain project by themselves independently.
 *
 * Disclaimer
 * If this source code is needed by the one neither contracting agent nor authorized programmer
 * during the use of the code, should contact to zhilingsd Co,. Ltd Inc, and get the confirmation
 * and agreement of three departments managers  - Research Department, Marketing Department and
 * Production Department.Otherwise zhilingsd will charge the fee according to the programme itself.
 *
 * Any one,including contracting agent and authorized programmer,cannot share this code to
 * the third party without the agreement of zhilingsd. If Any problem cannot be solved in the
 * procedure of programming should be feedback to zhilingsd Co,. Ltd Inc in time, Thank you!
 */
package com.drools;

import com.barista.entity.Bill;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.Message;
import org.kie.api.builder.Results;
import org.kie.api.builder.model.KieBaseModel;
import org.kie.api.builder.model.KieModuleModel;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaotianhao
 * @version 1.0
 * @className LinMengHuai.java
 * @date 2020/11/30 20:08
 */
public class LinMengHuai {

    private static Map<String, KieContainer> kieContainerMap = new HashMap<>();

    public static void main(String[] args) {
        System.setProperty("drools.dateformat", "yyyy-MM-dd HH:mm:ss");

        Long engineId = 1L;

        KieServices kieServices = KieServices.get();
        KieModuleModel kieModuleModel = kieServices.newKieModuleModel();
        KieBaseModel kieBaseModel = kieModuleModel.newKieBaseModel(buildKBaseName(engineId));
        kieBaseModel.setDefault(true);
        kieBaseModel.addPackage(MessageFormat.format("drools.rules.rulesHello", String.valueOf(engineId)));
        kieBaseModel.newKieSessionModel(buildKSessionName(engineId));

        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();

        String fullPath = MessageFormat.format("src/main/resources/aaa.drl", String.valueOf(engineId), String.valueOf(engineId));
//        String fullPath = MessageFormat.format("src/main/resources/rules/drools/rules/rulesHello/test.drl", String.valueOf(engineId), String.valueOf(engineId));
        kieFileSystem.write(fullPath, getFileContent());

        kieFileSystem.writeKModuleXML(kieModuleModel.toXML());

        KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem).buildAll();
        Results results = kieBuilder.getResults();
        if (results.hasMessages(Message.Level.ERROR)) {
            System.out.println(results.getMessages());
            throw new IllegalStateException("rule error");
        }

        KieContainer kieContainer = kieServices.newKieContainer(kieServices.getRepository().getDefaultReleaseId());
        kieContainerMap.put(buildKContainerName(engineId), kieContainer);

        KieSession kieSession = kieContainerMap.get(buildKContainerName(engineId)).getKieBase().newKieSession();
        Bill bill = new Bill();
        bill.setDate(new Date());
        bill.setPayState("已还款");
        bill.setCost(new BigDecimal(30.0));
        System.out.println("输出代码中的引用对象" + bill);
        FactHandle insert = kieSession.insert(bill);
        kieSession.delete(insert);
        kieSession.insert(bill);

        int count = kieSession.fireAllRules();
        System.out.println("执行规则数:" + count);
        System.out.println("执行完规则后的cost值" + bill.getCost().toString());
        kieSession.dispose();
    }

    public static String getHeader() {
        return "package drools.rules\n" +
                "import com.zhilingsd.qi.business.storage.mysql.model.QiCommonRuleScoreRules\n" +
                "import java.math.BigDecimal;\n" +
                "import java.util.Arrays;\n" +
                "import java.util.Date;\n" +
                "import java.util.HashSet;\n" +
                "import java.util.Set;\n" +
                "import java.math.BigDecimal\n";
    }

    /**
     * 构造KContainerName
     *
     * @param id ID
     */
    private static String buildKContainerName(Long id) {
        return "kContainer_" + id;
    }

    /**
     * 构造KBaseName
     *
     * @param id ID
     */
    private static String buildKBaseName(Long id) {
        return "kBase_" + id;
    }

    /**
     * 构造KSessionName
     *
     * @param id ID
     */
    private static String buildKSessionName(Long id) {
        return "kSession_" + id;
    }


    private static String getFileContent(){
        return "//包名必须是该文件的路径\n" +
                "package drools.rules.rulesHello\n" +
                "import com.zhilingsd.qi.business.storage.mysql.model.QiCommonRuleScoreRules\n" +
                "import com.barista.util.FileUtil\n" +
                "import com.barista.entity.Bill\n" +
                "import java.math.BigDecimal;\n" +
                "import java.util.Arrays;\n" +
                "import java.util.Date;\n" +
                "import java.util.HashSet;\n" +
                "import java.util.Set;\n" +
                "import java.math.BigDecimal\n" +
                "\n" +
                "    rule \"test001\"\n" +
                "        when\n" +
                "//            $b:Bill(payState memberOf Arrays.asList(payState.split(\"\")))\n" +
                "//            $b:Bill(date < \"2020-11-24 00:00:00\")\n" +
                "            $b:Bill(cost > 1 && cost < 200);\n" +
                "        then\n" +
                "            System.out.println(\"hello world\");\n" +
                "        end\n" +
                "\n" +
                "    rule \"test002\"\n" +
                "        when\n" +
                "            $b:Bill(payState==\"已还款\" || (cost%2) == 1);\n" +
                "        then\n" +
                "            $b.setCost(new BigDecimal(30.0));\n" +
                "// 如果是改值,加上这步操作,改动才会生效,这会导致全部规则重新执行 如果是修改引用对象内容,就不需要\n" +
                "//            update($b);\n" +
                "            System.out.printf(\"输出规则文件中的引用对象%s, 并将花费改为30.0, 现在cost的值%f%n\", $b, $b.getCost().doubleValue());\n" +
                "        end\n" +
                "\n" +
                "    rule \"test003\"\n" +
                "//        no-loop true //默认false.说是防止update触发的循环,但是\"test003\"触发到了\"test002\"还是会死循环,少写update为妙\n" +
                "//        ruleflow-group \"\" //分为rule,flow,group三个部分,分别代表规则,流程,分组, 即常说的规则流\n" +
                "//        lock-on-active true //默认false.锁定活跃,当ruleflow-group,agenda-group,update再次被激活时,锁定活跃可以保证当前规则只被激活一次\n" +
                "//        salience 0 //默认0.整数,可以为负,支持表达式,数值越大,规则越先被执行.\n" +
                "//        enabled true //默认true.指规则是否可以被执行\n" +
                "//        dialect \"\" //可选值:Java或Mvel.用来定义规则中要使用的语言类型\n" +
                "//        date-effective \"07-August-2018\" //默认格式dd-MMM-yyyy.当前系统时间大于等于设置时间时,规则才可以被执行.  如果要更改格式,需要在初始化KIE相关代码前添加代码 System.setProperty(\"drools.dateformat\",\"yyyy-MM-dd HH:mm:ss\")\n" +
                "//        date-expires \"\" //与date-effective相反,即小于时才可以执行\n" +
                "//        activation-group \"\" //激活分组,类似于规则流程中的XOR网关.通过定义的分组名称,具有相同组名的规则最多只有一个被激活(第一个LHS为true的规则)\n" +
                "//        agenda-group \"ag1\" //议程分组.指用户可以通过java代码设置值来控制哪个agenda-group获取焦点,只有获取焦点的规则才能被激活. 如:kieSession.getAgenda().getAgendaGroup(\"ag1\").setFocus();\n" +
                "//        auto-focus true //默认false.自动获取焦点.一般结合agenda-group使用\n" +
                "//        timer (int: 3s 4s; start=3-JAN-2018, end=5-JAN=2018) //定时执行.支持使用定义变量.有两种写法,1.(int: <initial delay> <report interval>?) 2.(cron <expression>)\n" +
                "\n" +
                "        when\n" +
                "            $b:Bill(cost==30.0);\n" +
                "        then\n" +
                "            System.out.println(\"cost现在是30\");\n" +
                "        end";
    }
}
