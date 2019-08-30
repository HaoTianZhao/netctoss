package com.barista.controller;

import com.alibaba.fastjson.JSON;
import com.barista.entity.AdminInfo;
import com.barista.result.Result;
import com.barista.result.ResultCode;
import com.barista.service.AdminRoleService;
import com.barista.util.MD5Util;
import com.barista.util.ValueUtil;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @ClassName AdminInfoControllerTest
 * @Author zhaoth
 * @Date 2019/8/26 17:45
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@ContextConfiguration({"classpath:application.xml"})
public class AdminInfoControllerTest {
    @Autowired
    private AdminInfoController adminInfoController;

    AdminInfo adminInfo;
    Integer[] roleIds;

    @Test
    public void getPageInfo() {
        System.out.println(JSON.toJSON(adminInfoController.getPageInfo(1, 10)));
    }

    @Test
    public void addAdmin() {
        roleIds = new Integer[]{1, 2, 3, 4, 5, 6};
        adminInfo = new AdminInfo();
        adminInfo.setAdminCode("qwe");
        adminInfo.setAdminPassword("admin");
        adminInfo.setAdminId(1003);
        adminInfo.setAdminTelephone("15626134357");
        adminInfo.setAdminEmail("597611084@qq.com");
        adminInfo.setAdminName("赵天昊");
        adminInfo.setAdminEnrolldate(null);

        adminInfoController.addAdmin(adminInfo, roleIds);
    }

    @Test
    public void deleteAdmin() {
        addAdmin();
        adminInfoController.deleteAdmin(adminInfo.getAdminId());
    }

    @Test
    public void updateAdmin() {
        roleIds = new Integer[]{1};
        adminInfo = new AdminInfo();
        adminInfo.setAdminId(1003);
        adminInfoController.updateAdmin(adminInfo, roleIds);
    }
}
