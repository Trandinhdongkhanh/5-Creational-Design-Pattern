package com.example.abstractFactory;

public class FactoryPattern {
    public static void main(String[] args) {
        AbstractFoodFactory chineseFact = FactoryProducer.getFactory(true);
        Food chineseFood1 = chineseFact.getFood("HOTPOT");
        chineseFood1.makeFood();
        Food chineseFood2 = chineseFact.getFood("HACAO");
        chineseFood2.makeFood();
        AbstractFoodFactory fact = FactoryProducer.getFactory(false);
        Food food1 = fact.getFood("HAMBURGER");
        food1.makeFood();
        Food food2 = fact.getFood("FRIES");
        food2.makeFood();
    }
}