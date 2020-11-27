package com.study.code.const_arg_resolution;

public class MessageProvider{

    private String message = null;
    private int count = 0;

    public MessageProvider(String message){
        this.message = message;
    }

    public MessageProvider(String message, int count){
        this.message = message;
        this.count = count;
    }

    public String getMessage() {
        return message;
    }

    public int getCount() {
        return count;
    }
}
