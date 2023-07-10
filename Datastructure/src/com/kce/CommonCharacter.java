package com.kce;

public class CommonCharacter {
	public static int common(String s,String p)
	{
		int l=s.length();
		int m=p.length();
		char ch1[]=s.toCharArray();
		char ch2[]=p.toCharArray();
		int dp[][]=new int[l+1][m+1];
		for(int i=0;i<=l;i++)
		{
			for(int j=0;j<=m;j++)
			{
				dp[i][j]=0;
			}
		}
		for(int i=1;i<=l;i++)
		{
		  for(int j=1;j<=m;j++)
			{
				if(ch1[i-1]==ch2[j-1])
				{
					dp[i][j]=dp[i-1][j-1]+1;
				}
				else
				{
					dp[i][j]=max(dp[i][j-1],dp[i-1][j]);
				}
			}
		}
		return dp[l][m];
	}
	public static int max(int a,int b)
	{
		return a>b?a:b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(common("kavis","karthika"));
	}

}
