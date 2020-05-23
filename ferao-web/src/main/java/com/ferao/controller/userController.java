package com.ferao.controller;/*
 * @author Ferao
 * @date
 * @discription
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ferao.pojo.User;
import com.ferao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class userController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/ferao")
    @ResponseBody
    public String feraoMaven() throws IOException {
        userService.findAll();
        System.out.println();
        return "success";
    }

}

