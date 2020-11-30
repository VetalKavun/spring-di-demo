package com.study.code.lazy_init;

public class Line {

    public Line(){
        System.out.println("Line constructor");
    }

    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
