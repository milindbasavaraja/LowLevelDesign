package com.low.level.design.singeltonPattern;

public class SingletonDemoClass {
    /**
     * Static variable to hold one instance of the class Singleton
     */
    private static SingletonDemoClass uniqueInstance;

    /**
     * Constructor is declared private, only Singleton can instantiate this class
     */
    private SingletonDemoClass(){};

    /**
     * this method gives a way to instantiate the class and also return the instance of it
     * @return
     */
    public static SingletonDemoClass getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new SingletonDemoClass();
        }

        return uniqueInstance;
    }
}
