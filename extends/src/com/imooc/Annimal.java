package com.imooc;

public class Annimal {
	public int age;
	public String name;
	public void eat(){
		System.out.println("动物能吃");
	}
	public Annimal()
	{
		System.out.println("Annimal构造函数调用");
	}
	@Override
	public String toString() {
		return "Annimal [age=" + age + ", name=" + name + "]";
	}
	

}
