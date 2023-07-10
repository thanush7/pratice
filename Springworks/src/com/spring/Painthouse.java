package com.spring;

import java.util.Scanner;

public class Painthouse {
	
	public static int count(int n)
	{
		if(n<=1)
			return 2;
     int result1=count(n-1);
     int result2=count(n-2);
     return (result1+result2)%100000007;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(count(n));
		

	}

}
