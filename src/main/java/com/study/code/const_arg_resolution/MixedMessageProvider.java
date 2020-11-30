package com.study.code.const_arg_resolution;

public class MixedMessageProvider implements MessageProvider{

    private String message = null;

    public MixedMessageProvider(String message){
        this.message = message;
    }

    public MixedMessageProvider(String message, int count){
        this.message = "String: " + message + ", number: " + count;
    }

    public MixedMessageProvider(int num1, int num2){
        this.message = "Number_1: " + num1 + ", number_2: " + num2;
    }

    public String getMessage() {
        return message;
    }
}
