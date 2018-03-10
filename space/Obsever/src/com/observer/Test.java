package com.observer;

import java.util.Vector;

//�۲��߽ӿ�
interface IObserver{
	public void refresh(String data);
}

//����ӿ�
interface ISubject{
	public void register(IObserver obs);//ע��۲���
	public void unregister(IObserver obs);//�����۲���
	public void notifyObservers();//֪ͨ���й۲���
}

//����ʵ����
class Subject implements ISubject{

	private Vector<IObserver> vec=new Vector();
	private String data;
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public void register(IObserver obs) {
		vec.add(obs);
		
	}

	@Override
	public void unregister(IObserver obs) {
		if(vec.contains(obs)){
			vec.remove(obs);
		}
	}

	@Override
	public void notifyObservers() {
		for(int i=0;i<vec.size();i++){
			IObserver obs=vec.get(i);
			obs.refresh(data);
		}
	}
	
}

//һ������Ĺ۲�����
class Observer implements IObserver{

	@Override
	public void refresh(String data) {
		System.out.println("i have gotten the data "+ data);
	}
	
}

public class Test {

	public static void main(String[] args) {
		IObserver obs=new Observer();
		Subject sub=new Subject();
		sub.register(obs);;
		sub.setData("hello");
		sub.notifyObservers();

	}

}