package com.ly.controller;

import com.ly.service.LyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LyController {

    @Autowired
    private LyService lyService;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

   @RequestMapping("/ly")
   @ResponseBody
    String wenjian(){
        return "愛你";
    }

    @RequestMapping("/ly/zhijie")
    @ResponseBody
    String second(){
        String str = lyService.cook();
        return str;
    }

    @RequestMapping("/ly/add")
    @ResponseBody
    String mm(String id, @RequestParam(name="name") String hh, String age, String classId){
        String success="成功";
        lyService.add(hh,age,id,classId);
        return success;
    }

}