package com.study.code.const_arg_resolution;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
        MessagePrinter messagePrinter = (MessagePrinter) context.getBean("printer");
        messagePrinter.print();
    }
}
