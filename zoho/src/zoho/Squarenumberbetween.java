package zoho;

public class Squarenumberbetween {
	
	
	public static double sqrt(int n)
	{
		double x=n;
		for(int i=1;i<=10;i++)
		{
			x=(x+n/x)/2;
		}
		return x;
	}
	public static boolean perfect(int n)
	{
		double sq=sqrt(n);
		return (sq-Math.floor(sq)==0);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		int m=100;
		if(m<200)
		{
			for(int i=n;i<m;i++)
			{
				if(perfect(i))
				{
					System.out.println(i+" ");
				}
			}
		}

	}

}
