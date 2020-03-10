package com.bozai.pterosaur.controller;

import com.bozai.pterosaur.dao.EmployeeDao;
import com.bozai.pterosaur.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.Collection;


@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @GetMapping("/emps")
    public String list(Model model){
    //thymeleaf 默认拼串

        //classpath:/templetes/xxxx.html

        Collection c = employeeDao.getAll();
        model.addAttribute("emps",c);
        return "emp/list";
    }
}
