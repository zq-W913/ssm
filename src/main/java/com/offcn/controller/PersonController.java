package com.ujiuye.controller;

import com.ujiuye.bean.PersonBean;
import com.ujiuye.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class PersonController {
    @Autowired
    PersonService service;

    @RequestMapping("save")
    public List<PersonBean> save() {
        return service.save();

    }
}
