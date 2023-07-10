package zoho;

import java.util.Scanner;

public class CountFather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String a[][]=new String[n][2];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<2;j++)
			{
			   a[i][j]=sc.next();
			}
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<2;j++)
			{
			   System.out.print(a[i][j]);
			}
			System.out.println();
		}
		String str=sc.nextLine();
		for(int i=0;i<n;i++)
		{
			
			   if(a[i][1].equals(str))
			   {
				  for(int j=0;j<n;j++)
				  {
					 if(a[j][0].equals(a[i][0]))
					 {
						 c++;
					 }
				  }
			   }
		}
		System.out.println(c);

	}

}
