package com.bridge;

//�����ʾֽӿ�
interface IPost{
	public void post();
}

//ƽ���ʼ���
class SimplePost implements IPost{

	public void post() {
		System.out.println("this is simple post");
	}
	
}

//�Һ��ʼ���
class MarkPost implements IPost{

	@Override
	public void post() {
		System.out.println("this is mark post");
		
	}
	
}

//����������
abstract class AbstractThing {
	private IPost obj;
	public AbstractThing(IPost obj){
		this.obj=obj;
	}
	public void post(){
		obj.post();
	}
}


//���������� Letter Parcel
class Letter extends AbstractThing{

	public Letter(IPost obj) {
		super(obj);
		// TODO Auto-generated constructor stub
	}
	
}

class Parcel extends AbstractThing{

	public Parcel(IPost obj) {
		super(obj);
		// TODO Auto-generated constructor stub
	}
	
}

public class Test {

	public static void main(String[] args) {
		IPost p=new SimplePost();
		Letter letter=new Letter(p);
		p.post();

	}

}
