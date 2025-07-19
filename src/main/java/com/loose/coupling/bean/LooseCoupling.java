package com.loose.coupling.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCoupling {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationLooseCouplingBeanContext.xml");
        DatabaseProvider userDatabase = (DatabaseProvider) context.getBean("userDatabase");
        DatabaseProvider mongoDatabase = (DatabaseProvider) context.getBean("mongoDatabase");

        System.out.println(userDatabase.getUserDetails());

        System.out.println(mongoDatabase.getUserDetails());
    }
}
