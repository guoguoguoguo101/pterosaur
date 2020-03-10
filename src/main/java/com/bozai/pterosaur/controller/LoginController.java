package com.bozai.pterosaur.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {
   // @RequestMapping(value = "/user/login",method = RequestMethod.POST)

    @PostMapping(value = "/user/login")

    public String login(@RequestParam("username") String Username,
                        @RequestParam("password")String Password,
                        Map<String,Object> map,HttpSession httpSession
                        ){

       httpSession.setAttribute("loginUser",Username);
        System.out.println("username="+Username);
        System.out.println("password="+Password);
        System.out.println(!StringUtils.isEmpty(Username));
        if (!StringUtils.isEmpty(Username)&&"123456".equals(Password)){


            return "redirect:/dash.html";
        }else {
            map.put("msg","用户名密码错误");
            System.out.println("登录失败");

            return "login";
        }


    }

}
