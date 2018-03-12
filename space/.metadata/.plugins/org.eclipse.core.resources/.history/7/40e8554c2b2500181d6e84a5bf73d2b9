package com.thread;

class MyRunnableThread implements Runnable{
	private String name;
	
	public MyRunnableThread(String name) {
		super();
		this.name = name;
	}

	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(name+"运行  i="+i);
		}
	}
}

public class RunnableTest {
	public static void main(String[] args){
		MyRunnableThread mt1=new MyRunnableThread("线程1");
		MyRunnableThread mt2=new MyRunnableThread("线程2");
		Thread t1=new Thread(mt1);
		Thread t2=new Thread(mt2);
		t1.start();
		t2.start();
	}
}
