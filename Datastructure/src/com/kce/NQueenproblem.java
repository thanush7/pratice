package com.kce;

public class NQueenproblem {

	int mat[][]=new int[4][4];
	public static boolean isrow(int mat[][],int row)
	{
		for(int i=0;i<4;i++)
		{
			if(mat[row][i]==1)
			{
				return true;
			}
		}
		return false;
	}
	public static boolean iscol(int mat[][],int col)
	{
		for(int i=0;i<4;i++)
		{
			if(mat[i][col]==1)
			{
				return true;
			}
		}
		return false;
	}
	public static boolean isdia(int mat[][])
	{
		for(int i=0;i<4;i++)
		{
			if(mat[i][i]==1)
				return true;
		}
		return false;
	}
	public static void solve()
	{
	   mat
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		
	

	}

}
