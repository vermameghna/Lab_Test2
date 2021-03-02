package com.demo.goodprogpractice;

import java.lang.reflect.Constructor;

public class ReflectionDestroySingleton {
	public static void main(String[] args) {
		LazyInitializationSingleton object1 = LazyInitializationSingleton.getSingleton();
		LazyInitializationSingleton object2 = null;
        try {
			Constructor ctr = LazyInitializationSingleton.class.getDeclaredConstructor();
			ctr.setAccessible(true);
			object2 = (LazyInitializationSingleton) ctr.newInstance();
        } catch (Exception ex) {
            System.out.println(ex);
        }

        System.out.println("Hashcode of Object1 - "+object1.hashCode());
        System.out.println("Hashcode of Object2 - "+object2.hashCode());
	}
}
