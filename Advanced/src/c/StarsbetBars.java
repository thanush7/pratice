package c;

import java.util.Scanner;
import java.util.Stack;

public class StarsbetBars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String s=scanner.next();
		int size1=scanner.nextInt();
		int start[]=new int[size1];
		for(int i=0;i<size1;i++)
		{
			start[i]=scanner.nextInt();
		}
		int size2=scanner.nextInt();
		int end[]=new int[size2];
		for(int i=0;i<size2;i++)
		{
			end[i]=scanner.nextInt();
		}
		
		for(int i=0;i<size1;i++)
		{
			int cnt=0;
			String temp=s.substring(start[i]+1,end[i]);
			int st=temp.indexOf("|");
			int en=temp.indexOf("|");
			for(int j=st;j<en;j++)
			{
				if(temp.charAt(j)=='*')
				{
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		
	}

}
