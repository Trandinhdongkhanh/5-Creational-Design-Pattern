package com.example.singleton;

public class Singleton {
    //Create a private constructor, the only way to get its object is to call the getInstance() method
    private Singleton(){};
    private static Singleton instance;
    //This will return only 1 instance of the object
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    public static void main(String[] args) {
        //Create a new instance
        Singleton sg1 = Singleton.getInstance();
        //The variable `sg1` will contain the same object as the variable `sg2` because there is only 1 instance. This
        //ensures no object can have more than 1 instance
        Singleton sg2 = Singleton.getInstance();

    }
}

