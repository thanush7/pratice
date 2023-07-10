package zoho;

import java.util.Scanner;

public class Decimaltoimproper {
	
	public static long gcd(long a,long b)
    {
        if(a==0)
            return b;
        else if(b==0)
            return a;
        if(a<b)
            return gcd(a,b%a); 
        else
            return gcd(b,a%b);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double number=sc.nextDouble();
		double inval=Math.floor(number);
		double fval=number-inval;
		final long pvalue=1000000000;
		long gcdval=gcd(Math.round(pvalue*fval),pvalue);
		long deno=pvalue/gcdval;
		long num=Math.round(pvalue*fval)/gcdval;
		System.out.println((int)number+" "+num+"/"+deno);

	}

}
