package com.example.builder;

public class HouseBuilder implements Builder{
    private String color;
    private String roof;
    private String yard;
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public void setYard(String yard) {
        this.yard = yard;
    }
}
