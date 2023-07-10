package com.concept;
import java.io.*;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Person implements Serializable
{
	int id;
	String name;
	public Person()
	{
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class Concept_1 {
	public static void main(String[] args) {
		Person p=new Person();
		p.setId(123);
		p.setName("thanush");
		//serialiization
//		try
//		{
//			FileOutputStream fs=new FileOutputStream("file.txt");
//			ObjectOutputStream ob=new ObjectOutputStream(fs);
//			ob.writeObject(p);
//			ob.close();
//			fs.close();
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
		Person p1=null;
		try
		{
			FileInputStream fs=new FileInputStream("file.txt");
			ObjectInputStream ob=new ObjectInputStream(fs);
			p1=(Person)ob.readObject();
			System.out.println(p1.id);
			System.out.println(p1.name);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
