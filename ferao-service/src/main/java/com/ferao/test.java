package com.ferao;/*
 * @author Ferao
 * @date
 * @discription
 */

import com.ferao.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    public static void main (String[] args)
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/bean-dao.xml","spring/bean-service.xml");
        UserService user = (UserService) ac.getBean("userServiceimpl");
        user.findAll();
    }
}
