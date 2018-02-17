package com.ly.controller;

import com.ly.service.LnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ln")
public class LnController {

    @Autowired
    private LnService lnService;

    @RequestMapping("/qq")
    @ResponseBody
    String add(String userid,String username,String userage,String usersex,String usergroupid){
        lnService.add(userid,username,userage,usersex,usergroupid);
        String x = "success";
        return x;
    }
}
