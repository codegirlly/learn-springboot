package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.LyService;

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


}