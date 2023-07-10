package zoho;

public class Nonzerodigitinfact {
	
	public static int fact(int n)
	{
		if(n==0)
			return 1;
		return n*fact(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
	    int fac=fact(n);
	    while(fac%10==0)
	    {
	    	fac/=10;
	    }
	    System.out.println(fac%10);
		

	}

}
