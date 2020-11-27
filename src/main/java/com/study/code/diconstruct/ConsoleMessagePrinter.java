package com.study.code.diconstruct;

public class ConsoleMessagePrinter implements MessagePrinter{

    private MessageProvider messageProvider;

    public ConsoleMessagePrinter(MessageProvider messageProvider){
        this.messageProvider = messageProvider;
    }

    public void printMessage() {
        System.out.println(messageProvider.getMessage());
    }
}
