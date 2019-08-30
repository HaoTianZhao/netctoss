
import com.barista.service.AuthorityService;
import com.barista.util.MD5Util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName Demo1
 * @Author zhaoth
 * @Date 2019/8/5 12:48
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@ContextConfiguration({"classpath:application.xml"})
public class Demo1 {
    static Logger logger = LoggerFactory.getLogger(Demo1.class);

    @Test
    public void test2() {
        try {

            Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println(clazz.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        logger.trace("trace message");
        logger.debug("debug message");
        logger.info("info message");
        logger.warn("warn message");
        logger.error("error message");
        //        logger.fatal("fatal message");//log4j2才有这个级别
        System.out.println("Hello World!");
    }

    @Autowired
    AuthorityService authorityService;

    @Test
    public void 测试权限拦截器() {
        Set<String> set = authorityService.selectAllPermission("admin");
        boolean b = "http://localhost:8080/user/loginAll".matches("http://localhost:8080/user/login.*");
        System.out.println(b);

        System.out.println(set);
    }

    @Test
    public void Test4() {
        System.out.println(MD5Util.encode("admin"));
    }

    @Test
    public void match() {
        Integer a = 127;
        Integer b = 127;

        System.out.println(a == b);

        List<Integer> list = new ArrayList<>();

    }

}
