package com.ferao.service.impl;


import com.ferao.dao.UserMapper;
import com.ferao.pojo.User;
import com.ferao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public void findAll() {
        List<User> users=userMapper.findAll();
        for (User user : users){
            System.out.println(user);
        }
        System.out.println("userService findAll success");
    }

}
