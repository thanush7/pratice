package com.kce;

public class Geeksforgotpass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int sum=12;
		String str="";
		if((n*9)<sum)
		{
			str+="-1";
		}
		while(sum>0)
		{
			if(sum>=9)
			{
				str+="9";
				sum-=9;
			}
			else
			{
				str+=String.valueOf(sum);
				sum=0;
				break;
			}
		}
		
		
    System.out.println(str);
	}

}
