package zoho;

public class Palindromebinar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		int i,j=0,c=0;
		for(i=4*8-1;(n>>i&1)!=1;i--);
		for(;j<i;i--,j++)
		{
			if((n>>i&1)!=(n>>j&1))
			{
				c=1;
				break;
			}
		}
		if(c==0)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not");
		}
		

	}

}
