package com.example.abstractFactory;
//Create concrete classes using the same interface
public class Fries implements Food {
    @Override
    public void makeFood() {
        System.out.println("Making fries");
    }
}