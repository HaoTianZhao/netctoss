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
import com.barista.entity.Cost;
import com.zhilingsd.asset.manage.decisionengine.common.bo.BillVariateBo;
import com.zhilingsd.asset.manage.decisionengine.common.bo.DroolsResult;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zhaotianhao
 * @version 1.0
 * @className RulesHello.java
 * @description drools hello world
 * @date 2020/11/17 14:50
 */
public class RulesHello {
    public static void main(String[] args) {

        System.setProperty("drools.dateformat","yyyy-MM-dd HH:mm:ss");

        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        KieSession kieSession = kieContainer.newKieSession("testhelloworld");

        BillVariateBo billVariateBo = new BillVariateBo();
        billVariateBo.setOverdueStage("M1");
        billVariateBo.setOutHandType("Q2");
        billVariateBo.setOverdueDays(20);
        billVariateBo.setOverdueMoney(new BigDecimal("2000"));
        billVariateBo.setTag(new String[]{"20", "23", "24"});
        kieSession.insert(billVariateBo);
        DroolsResult droolsResult = new DroolsResult();
        kieSession.insert(droolsResult);

        int count = kieSession.fireAllRules();
        System.out.println("执行规则数:" + count);
        System.out.println("执行完规则后的queueNumber和billTag, " + droolsResult.getQueueNumber() + ", " + droolsResult.getBillTag());
        kieSession.dispose();
    }
}
