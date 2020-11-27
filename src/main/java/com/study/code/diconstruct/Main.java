package com.study.code.diconstruct;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
        MessagePrinter messagePrinter = (MessagePrinter) context.getBean("messagePrinter");
        messagePrinter.printMessage();
    }
}
