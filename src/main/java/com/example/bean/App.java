package com.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        NewBean nwBean = (NewBean) applicationContext.getBean("newBean");
        System.out.println(nwBean);
        System.out.println(nwBean.toString());
    }
}
