package com.kcc;

public class Wholedoc {
	public static int fact(int n)
	{
		if(n==0)
			return  1;
	    return n*fact(n-1);
	}
	public static int gcd(int a,int b)
	{
		if(a==0)
			return b;
		if(b==0)
			return a;
		else if(a>b)
			return gcd(b,a%b);
		else 
			return gcd(a,b%a);
		
	}
	
	public static int lcm(int n1,int n2)
	{
		int max=n1>n2?n1:n2;
		while(true)
		{
			if(max%n1==0&&max%n2==0)
			{
				return max;
			}
			max++;
		}
    }
    public static boolean strong(int n)
    {
    	int temp=n;
    	int sum=0;
    	while(temp!=0)
    	{
    		sum+=fact(temp%10);
    		temp/=10;
    	}
    	if(n==sum)
    	{
    		return true;}
    	return false;
    }
    public static boolean automorphic(long n)
    {
    	long sq=n*n;
        int result = (int)(Math.log(n) / Math.log(10))+1;
        int div=(int)Math.pow(10, result);
        System.out.println(result+" "+div+" "+sq);
        if(n==(sq%div))
        {
        	return true;
        }
        return false;
        
    	
    }
	public static void main(String[] args) {
//		System.out.println(gcd(9,8));
//		System.out.println(lcm(72,120));
//		System.out.println(strong(145));
		 
		System.out.println(automorphic(25));
	}

}
