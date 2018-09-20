package com.Shetty.Shravan.SDI;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("shetty_spring.xml");
        Book bookYouReadIn = (Book) context.getBean("Book");
        System.out.println(bookYouReadIn);

    }
}

