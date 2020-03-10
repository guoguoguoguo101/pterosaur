package com.bozai.pterosaur.config;


import com.bozai.pterosaur.component.LoginHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    //ctrl+o 实现方法 视图映射功能
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/dashboard").setViewName("dash.html");


        registry.addViewController("/dash.html").setViewName("dash");
        registry.addViewController("/index.html").setViewName("login");


    }

    //注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/login","/index.html","/user/login","/loginout");
        //静态资源呢
        //已经做好静态资源映射
    }
}
