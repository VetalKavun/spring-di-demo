package com.study.code.const_arg_resolution;

public class MessagePrinter {
    private MessageProvider messageProvider;

    public MessagePrinter(MessageProvider messageProvider){
        this.messageProvider = messageProvider;
    }

    public void print(){
        System.out.println(messageProvider.getMessage() + messageProvider.getCount());
    }
}
