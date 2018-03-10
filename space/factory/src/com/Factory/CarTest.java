package com.Factory;


interface Icar{
	
}
class TopCar implements Icar{
	
}
class MidCar implements Icar{
	
}
class LowCar implements Icar{
	
}

//¹¤³§
abstract class AbstractFactory{
	public abstract Icar creat();
}

class TopFactory extends AbstractFactory{
	public Icar creat(){
		return new TopCar();
	}
}

class MidFactory extends AbstractFactory{
	public Icar creat(){
		return new MidCar();
	}
}

class LowFactory extends AbstractFactory{
	public Icar creat(){
		return new LowCar();
	}
}

public class CarTest {

	public static void main(String[] args) {
		AbstractFactory ab=new TopFactory();
		System.out.println(ab.getClass().getName());

	}

}
