package com.thread;

class MyRunnableThread2 implements Runnable{
	//实现Runnable接口，可以实现资源共享
	private int t=5;
	public void run(){
		for(int i=0;i<100;i++){
			if(t>0){
				System.out.println("卖票：ticket= "+t--);
			}
		}
	}
}

public class RunnableTest2  {

	public static void main(String[] args) {
		MyRunnableThread2 mt=new MyRunnableThread2();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
	}

}
