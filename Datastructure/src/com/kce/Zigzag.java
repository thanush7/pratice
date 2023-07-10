package com.kce;

public class Zigzag {

	public static String zigZag(String s,int n)
	{
		String ans="";
		for(int i=0;i<n;i++)
		{
			int incr=2*(n-1);
			for(int j=i;j<s.length();j+=incr)
			{
				ans+=s.charAt(j);
				if(i>0&&i<n-1&&j+incr-(2*i)<s.length())
				{
					ans+=s.charAt(j+incr-(2*i));
				}
				
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(zigZag("PAYPALISHIRING",3));

	}

}
