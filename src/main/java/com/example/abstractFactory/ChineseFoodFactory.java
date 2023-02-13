package com.example.abstractFactory;
//This is a concrete factory which produce a family of products that belong to a single variant. For example the variant here
//is chinese food while the other is fast food
public class ChineseFoodFactory extends AbstractFoodFactory{

    @Override
    Food getFood(String foodType) {
        if(foodType == null){
            return null;
        }
        if (foodType.equalsIgnoreCase("HOTPOT")) {
            return new Hotpot();
        }
        else if (foodType.equalsIgnoreCase("HACAO")){
            return new Hacao();
        }
        return null;
    }
}
