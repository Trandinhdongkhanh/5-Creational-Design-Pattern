package com.example.builder;

public class Main {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new HouseBuilder();
        Director dir = new Director();
        dir.constructHouse(houseBuilder);
        System.out.println(houseBuilder);
        HotelBuilder hotelBuilder = new HotelBuilder();
        dir.constructHotel(hotelBuilder);
        System.out.println(hotelBuilder);
    }
}
