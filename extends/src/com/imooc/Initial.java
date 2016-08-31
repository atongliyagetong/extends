package com.imooc;

public class Initial {
	public static void main(String[] args) {
		Dog dog=new Dog();
		Dog dog2=new Dog();
		dog2.age=10;
		dog.age=10;
		if(dog.equals(dog2))
		{
			System.out.println("两个对象相同");
		}
		else{
			System.out.println("两个对象不同");
		}
		System.out.print(dog);
		
	}

}
