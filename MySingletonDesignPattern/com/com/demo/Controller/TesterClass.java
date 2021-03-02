package com.demo.Controller;

import com.demo.goodprogpractice.LazyInitializationSingleton;
import com.demo.goodprogpractice.SerializedIssueClass;
import com.demo.goodprogpractice.StaticBlockInitializationSingleton;
import com.demo.goodprogpractice.ThreadSafeSingleton;

public class TesterClass {
	public static void main(String[] args) {
		//EagerInitializationSignleton.getSingleton();
    	StaticBlockInitializationSingleton.getSingleton();
//		LazyInitializationSingleton.getSingleton();
//		ThreadSafeSingleton.getSingleton();
//     	SerializedIssueClass.getSingleton();
		
	}
}
