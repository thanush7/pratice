package zoho;

public class Fibanacinumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int n=6;
		System.out.println(a+" "+b);
		for(int i=2;i<n;i++)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
