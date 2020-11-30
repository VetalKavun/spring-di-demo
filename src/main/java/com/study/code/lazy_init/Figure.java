package com.study.code.lazy_init;

public class Figure {
    private Line line;

    public Figure(){
        System.out.println("Figure constructor");
    }

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }
}
