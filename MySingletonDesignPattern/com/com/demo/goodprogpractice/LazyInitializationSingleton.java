package com.demo.goodprogpractice;

public class LazyInitializationSingleton {

	private static LazyInitializationSingleton singleton;

	private LazyInitializationSingleton(){}

	public static LazyInitializationSingleton getSingleton() {
		if (singleton == null) {
			singleton = new LazyInitializationSingleton();
		}
		return singleton;
	}
	
}
