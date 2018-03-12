package com.thread;

class MyThread extends Thread {
	private String name;
	public MyThread(String name){
		this.name=name;
	}
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(name+"运行  i="+i);
		}
	}
}

class ThreadTest{
	public static void main(String[] args){
		MyThread  thread1=new MyThread("线程1");
		MyThread  thread2=new MyThread("线程2");
		thread1.start();
		thread2.start();
	}
}
