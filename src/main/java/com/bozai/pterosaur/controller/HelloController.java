package com.bozai.pterosaur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        System.out.println("hello");
        return "sign";
    }

    @RequestMapping(value = "/success")
    //查出一些数据 展示
    public String success(Map<String,Object> map){


        return "success";
    }

    @RequestMapping(value = "/login")
    //查出一些数据 展示
    public String login(){
        return "login";
    }


//    @RequestMapping(value = "/cart")
//    //查出一些数据 展示
//    public String cart(){
//        return "cart";
//    }

//    @RequestMapping(value = "/dash")
//    //查出一些数据 展示
//    public ModelAndView dashboard(){
//        System.out.println("dashboard**********");
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("dash");
//        return modelAndView;
//    }

//    @RequestMapping(value = "/dash")
//    //查出一些数据 展示
//    public String dashboard(){
//
//        return "dash";
//    }

}
