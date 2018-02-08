package com.ly.controller;

import com.ly.entity.StudentEntity;
import com.ly.service.LyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/ly")
public class LyController {

    @Autowired
    private LyService lyService;

    @RequestMapping("/")
    String get(){
        return "/hello";
    }

    @RequestMapping("/xx")
    String getWorld(){
        return "/world";
    }

    @RequestMapping("/add")
    @ResponseBody
    String mm(String id, @RequestParam(name = "name") String hh, String age, String classId) {
        String success = "成功";
        lyService.add(hh, age, id, classId);
        return success;
    }

    @RequestMapping("/del")
    @ResponseBody
    String dd(String id) {

        String success = "success";
        //A
        lyService.del(id);


        return success;


    }

    @RequestMapping("/find")
    @ResponseBody
    StudentEntity ff(String id) {

        String success = "success";
        return lyService.find(id);

    }

    @RequestMapping("/findall")
    String findAll(String classId,Model model){

        model.addAttribute("lys",lyService.findAll(classId));
        return "/list";

    }
}