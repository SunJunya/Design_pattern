package com.bridge;

//定义邮局接口
interface IPost{
	public void post();
}

//平信邮寄类
class SimplePost implements IPost{

	public void post() {
		System.out.println("this is simple post");
	}
	
}

//挂号邮寄类
class MarkPost implements IPost{

	@Override
	public void post() {
		System.out.println("this is mark post");
		
	}
	
}

//抽象事物类
abstract class AbstractThing {
	private IPost obj;
	public AbstractThing(IPost obj){
		this.obj=obj;
	}
	public void post(){
		obj.post();
	}
}


//具体事务类 Letter Parcel
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
