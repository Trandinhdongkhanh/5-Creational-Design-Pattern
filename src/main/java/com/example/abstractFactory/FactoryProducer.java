package com.example.abstractFactory;
//The application picks the factory type to create products belong to its factory
public class FactoryProducer {
    public static AbstractFoodFactory getFactory(boolean isChinese){
        if(isChinese){
            return new ChineseFoodFactory();
        }
        else{
            return new FoodFactory();
        }
    }
}
