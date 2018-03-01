package javaExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadGroupBasics {

	public static void main(String[] args) {
		
		//system thread group acts as root for all thread groups in java
		/*system thread group contains system level threads such as finalizer or garbage collector
		garbage collector, main thread group, reference handled, signal dispatcher, attach listener
		These are 4 examples, there are so many other threads */
		/*main thread group contains other threads such as main, Thread-0, sub thread group*/
		// ThreadGroup it self is a java class. present in java.lang, child of object 
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
		// as we are executing below line in the main thread. So FirstGroup becomes child of main thread 
		/* default thread priority is 10. Below group will be assigned a priority of 10 by default. We can change the priority
		whenever we want, when we change the thread group priority, all the threads those are created 
		after setting priority will get same max priority. which are already there ll not get affected, old priorities ll continue.
		*/
		ThreadGroup tg1 = new ThreadGroup("FirstGroup");
		ThreadGroup tg2 = new ThreadGroup(tg1, "FirstGroup");
		
		Thread t1 = new Thread(tg2, "thread1");
		t1.setPriority(5);
		Thread t2 = new Thread(tg2, "thread2");
		t2.setPriority(5);
		Thread t4 = new Thread(tg2, "thread4");
		t4.setPriority(2);
		tg2.setMaxPriority(3);
		Thread t3 = new Thread(tg2, "thread3");
		
		System.out.println(tg1.getParent().getName());
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		System.out.println(t4.getPriority());
		
		//copying all the threads in the system group to an array
		
		Thread[] tarr = new Thread[100];
		System.out.println("printing all thread names");
		System.out.println(Thread.currentThread().getThreadGroup().getParent().enumerate(tarr));
		
		
		for(Thread tt: tarr){
			System.out.println(tt.getName());
		}
		
		

	}

}
