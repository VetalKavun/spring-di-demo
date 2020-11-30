package com.study.code.collections_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
        CollectionDemo collectionDemo = (CollectionDemo) context.getBean("collectionDemo");
        for (String str : collectionDemo.getListOfStrings()) {
            System.out.println(str);
        }
        for (Map.Entry<String, String> entry : collectionDemo.getMapOfStrings().entrySet()){
            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
        }
        for (String str : collectionDemo.getSetOfStrings()){
            System.out.println(str);
        }
    }
}
