package com.imooc;

public class Annimal {
	public int age;
	public String name;
	public void eat(){
		System.out.println("�����ܳ�");
	}
	public Annimal()
	{
		System.out.println("Annimal���캯������");
	}
	@Override
	public String toString() {
		return "Annimal [age=" + age + ", name=" + name + "]";
	}
	

}
