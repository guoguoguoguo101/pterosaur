package com.bozai.pterosaur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginOutController {

    @RequestMapping("/loginout")
    public String loginout(HttpSession session){
        Object obj =session.getAttribute("loginUser");
        System.out.println("当前登录的是 "+obj);
        System.out.println("现在准备退出");
        System.out.println("删除中");
        session.removeAttribute("loginUser");
        System.out.println(session.getAttribute("loginUser")+"*****");
        return "redirect:/login.html";
    }
}
