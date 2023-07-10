package com.concept;
//multiple inheritance
interface printable
{
	public void print();
}
interface showable
{
	public void print();
}

class A1 implements printable,showable
{
	public void print() {
		System.out.println("hello");
	}
}

//interface inheritance

interface printy
{
	public void pri();
}
interface showfy extends printy
{
	public void showw();
}
class BB implements showfy
{
	public void showw()
	{
		System.out.println("welcome");
	}
	public void pri()
	{
		System.out.println("hello gii");
	}
}
public class Interfaceexample  {

	public static void main(String[] args) {
		A1 obj=new A1();
		obj.print();
		BB obj1=new BB();
		obj1.pri();

	}

}
