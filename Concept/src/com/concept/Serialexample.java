package com.concept;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable
{
	int a;
	int b;
	public A(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	
}

public class Serialexample  {

	public static void main(String[] args) {
		try
		{
			A ob=new A(10,11);
//			FileOutputStream fs=new FileOutputStream("D://inputt.txt");
//			ObjectOutputStream obj=new ObjectOutputStream(fs);
//			
//			obj.writeObject(ob);
//			obj.flush();
//			obj.close();
			FileInputStream fs=new FileInputStream("D://inputt.txt");
			ObjectInputStream obj=new ObjectInputStream(fs);
			A s=(A)obj.readObject();
			System.out.println(s.a);
			obj.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
