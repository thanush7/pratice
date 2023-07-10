package c;

public class Circularprime {
	
	
	public static boolean isprime(int n)
	{
		if(n==0||n==1) return false;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)return false;
		}
		return true;
	}
	public static boolean circularprime(int num)
	{
		int count=(int)(Math.log(num)/Math.log(10))+1;
		int temp=num;
		while(isprime(temp))
		{
			int last=temp%10;
			int rem=temp/10;
			temp=(int)(Math.pow(10,count-1)*last)+rem;
			if(num==temp)
			{
				return true;
			}
			
		}
		return false;
	}

	public static void main(String[] args) {
		int n=1193;
		
		System.out.println(circularprime(n));

	}

}
