package com.thread;

class MyThread2 extends Thread{
	//�̳�Thread�࣬����ʵ����Դ����
	private int t=5;
	public void run(){
		for(int i=0;i<100;i++){
			if(t>0){
				System.out.println("��Ʊ��ticket= "+t--);
			}
		}
	}
}

public class MyThreadTest2  {

	public static void main(String[] args) {
		MyThread2  mt1=new MyThread2();
		MyThread2  mt2=new MyThread2();
		MyThread2  mt3=new MyThread2();
		mt1.start();
		mt2.start();
		mt3.start();
	}

}
