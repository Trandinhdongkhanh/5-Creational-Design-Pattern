package com.example.builder;
//The concrete builder class follow the builder interface and provide specific implementation of the building steps.
//We may have several ways of builders, each implementd differently.
//For example we build a `Hotel` here. We can also build an unrelated object like `House` which also use the same builder
public class HotelBuilder implements Builder{
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
