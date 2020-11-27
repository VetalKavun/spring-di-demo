package com.study.code.diconstruct;

public class HelloMessageProvider implements MessageProvider{
    private String message = "Hello";
    public String getMessage(){
        return message;
    }
}
