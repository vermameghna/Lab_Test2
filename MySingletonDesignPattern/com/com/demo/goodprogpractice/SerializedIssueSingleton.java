package com.demo.goodprogpractice;

import java.io.Serializable;

public class SerializedIssueSingleton implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedIssueSingleton(){}
    
    private static class SingletonClass{
        private static final SerializedIssueSingleton singleton = new SerializedIssueSingleton();
    }
    
    public static SerializedIssueSingleton getSingleton(){
        return SingletonClass.singleton;
    }
    
    
  //to overcome the serialization problem in singleton design pattern
    protected Object readResolve() {
    	return getSingleton();
    	}
}
