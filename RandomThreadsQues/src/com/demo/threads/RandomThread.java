package com.demo.threads;
import java.util.Random;

class RandomThread implements Runnable {
   Random randomNumber = new Random();
   
   int num;
   public void run() {
      num = randomNumber.nextInt(10) + 1;
   }
   
   int getNumber(){
      return num;
   }

   public static void main (String args[]) throws InterruptedException {
	   
	  RandomThread thread1 = new RandomThread();
	  RandomThread thread2 = new RandomThread();
	  RandomThread thread3 = new RandomThread();
	  RandomThread thread4 = new RandomThread();
	  RandomThread thread5 = new RandomThread();
	   
	   
      Thread th1=new Thread(thread1);
      Thread th2=new Thread(thread2);
      Thread th3=new Thread(thread3);
      Thread th4=new Thread(thread4);
      Thread th5=new Thread(thread5);
      
      
      th1.start();th2.start();th3.start();th4.start();th5.start();
      
      th1.join();th2.join();th3.join();th4.join();th5.join();

      System.out.println("Thread 1 gets a random number: " + thread1.getNumber());
      System.out.println("Thread 2 gets a random number: " + thread2.getNumber());
      System.out.println("Thread 3 gets a random number: " + thread3.getNumber());
      System.out.println("Thread 4 gets a random number: " + thread4.getNumber());
      System.out.println("Thread 5 gets a random number: " + thread5.getNumber());
      
      
      int totalSum = 0; 
      totalSum = totalSum + thread1.getNumber();
      totalSum = totalSum + thread2.getNumber();
      totalSum = totalSum + thread3.getNumber();
      totalSum = totalSum + thread4.getNumber();
      totalSum = totalSum + thread5.getNumber();
      System.out.println("Sum of the random Numbers generated: " + totalSum);
   }

}