package com.imooc;

public class Dog extends Annimal {
	public int age=10;
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		return true;
	}

	public Dog()
	{
		System.out.println("Dog构造函数被调用");
	}

	@Override
	public String toString() {
		return "Dog [age=" + age + ", name=" + name + "]";
	}
	

}
