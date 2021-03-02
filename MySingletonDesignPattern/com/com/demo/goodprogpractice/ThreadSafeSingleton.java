package com.demo.goodprogpractice;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton singleton;

	private ThreadSafeSingleton(){}

	public static synchronized ThreadSafeSingleton getSingleton() {
		if (singleton == null) {
			singleton = new ThreadSafeSingleton();
		}
		return singleton;
	}
	
	public static void main(String[] args) {
		ThreadSafeSingleton.getSingleton();
	}
}
