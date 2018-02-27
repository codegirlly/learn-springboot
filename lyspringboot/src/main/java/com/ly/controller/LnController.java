package com.ly.controller;

import com.ly.entity.QqEntity;
import com.ly.service.LnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ln")
public class LnController {

    @Autowired
    private LnService lnService;

    @RequestMapping("/add")
    String result(){
        return "/give";
    }

    @RequestMapping("/in")
    String input(){
        return "/input";
    }

    @RequestMapping("/qq")
    @ResponseBody
    String add(String userid,String username,String userage,String usersex,String usergroupid){
        lnService.add(userid,username,userage,usersex,usergroupid);
        String x = "success";
        return x;
    }

    @RequestMapping("/find")
    @ResponseBody
    QqEntity findqq(String userid){
        return lnService.findqq(userid);
    }
    
    @RequestMapping("/findgroup")
    String findgroup(String usergroupid, Model model){
        model.addAttribute("lns",lnService.findAll(usergroupid));
        return "/biao";
    }




}
