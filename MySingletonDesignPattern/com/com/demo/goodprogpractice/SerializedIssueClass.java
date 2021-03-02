package com.demo.goodprogpractice;

import java.io.Serializable;

public class SerializedIssueClass implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedIssueClass(){}
    
    private static class SingletonHelper{
        private static final SerializedIssueClass instanceSingleton = new SerializedIssueClass();
    }
    
    public static SerializedIssueClass getSingleton(){
        return SingletonHelper.instanceSingleton;
    }
}
