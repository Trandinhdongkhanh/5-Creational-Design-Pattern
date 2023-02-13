package com.example.abstractFactory;
//This is a concrete factory which produce a family of products that belong to a single variant. For example the variant here
//is fast food while the other is chinese food
public class FoodFactory extends AbstractFoodFactory{
    @Override
    public Food getFood(String foodType){
        if(foodType == null){
            return null;
        }
        if (foodType.equalsIgnoreCase("HAMBURGER")) {
            return new Hamburger();
        }
        else if (foodType.equalsIgnoreCase("FRIES")){
            return new Fries();
        }
        return null;
    }
}
