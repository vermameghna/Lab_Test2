package com.demo.goodprogpractice;

public class EagerInitializationSignleton {
   private static final EagerInitializationSignleton singleton = new EagerInitializationSignleton();
    
    private EagerInitializationSignleton(){}

    public static EagerInitializationSignleton getSingleton(){
        return singleton;
    }
}
