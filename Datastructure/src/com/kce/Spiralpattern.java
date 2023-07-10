package com.kce;

public class Spiralpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][]= {{1,2,3,4},
				      {5,6,7,8},
				      {9,10,11,12},
				      {13,14,15,16}};
		int rowstart=0,rowend=mat.length;
		int colstart=0,colend=mat[0].length;
		while(rowstart<rowend&&colstart<colend)
		{
			//left to right
			for(int i=colstart;i<colend;i++)
			{
			  System.out.print(mat[rowstart][i]+" ");
			}
			rowstart++;
			//top to bottom
			for(int i=rowstart;i<rowend;i++)
			{
				System.out.print(mat[i][colend-1]+" ");
				
			}
			colend--;
			//right to left
			for(int i=colend-1;i>=colstart;i--)
			{
				System.out.print(mat[rowend-1][i]+" ");
			}
			rowend--;
			for(int i=rowend-1;i>=rowstart;i--)
			{
				System.out.print(mat[i][colstart]+" ");
			}
			colstart++;
		}
		
		

	}

}
