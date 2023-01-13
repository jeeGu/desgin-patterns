package com.demo.desginpatterns.creational.factoryMethodPattern;

public abstract class Plan {

    protected Double rate;

    public abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}
