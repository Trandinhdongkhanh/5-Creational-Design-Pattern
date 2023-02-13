package com.example.builder;
// The director is only responsible for executing the building
// steps in a particular sequence.
public class Director {
    public void constructHotel(Builder builder){
        builder.setRoof("Hotel roof");
        builder.setColor("Golden Luxury");
        builder.setYard("Large yard");
    }
    public void constructHouse(Builder builder){
        builder.setRoof("House roof");
        builder.setColor("Normal color");
        builder.setYard("Small yard");
    }
}
