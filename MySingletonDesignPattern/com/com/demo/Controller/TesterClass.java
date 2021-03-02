package com.demo.Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.demo.goodprogpractice.LazyInitializationSingleton;
import com.demo.goodprogpractice.SerializedIssueSingleton;
import com.demo.goodprogpractice.StaticBlockInitializationSingleton;
import com.demo.goodprogpractice.ThreadSafeSingleton;

public class TesterClass {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// EagerInitializationSignleton.getSingleton();
		StaticBlockInitializationSingleton.getSingleton();
//		LazyInitializationSingleton.getSingleton();
//		ThreadSafeSingleton.getSingleton();
//     	SerializedIssueClass.getSingleton();

		SerializedIssueSingleton test1 = SerializedIssueSingleton.getSingleton();
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("file.ser")));

		out.writeObject(test1);

		out.close();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("file.ser")));
		SerializedIssueSingleton test2 = (SerializedIssueSingleton) in.readObject();

		in.close();
		System.out.println("hashcode of test1=" + test1.hashCode());
		System.out.println("hashcode of test2 =" + test2.hashCode());
	}
}
