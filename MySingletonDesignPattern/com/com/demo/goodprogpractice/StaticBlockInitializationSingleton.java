package com.demo.goodprogpractice;

public class StaticBlockInitializationSingleton {
private static StaticBlockInitializationSingleton singleton;
    
    private StaticBlockInitializationSingleton(){}
    
    static{
        try{
        	singleton = new StaticBlockInitializationSingleton();
        }
        catch(Exception ex){
            throw new RuntimeException("Exception occured due to singleton class");
        }
    }
    
    public static StaticBlockInitializationSingleton getSingleton(){
        return singleton;
    }
    
}
