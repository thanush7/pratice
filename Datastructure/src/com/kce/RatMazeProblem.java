package com.kce;

public class RatMazeProblem {
	int N=4;
	public boolean printMazepathutil(int maze[][],int x,int y,int sol[][])
	{
		if(x==N-1&&y==N-1&&maze[x][y]==1)
		{
			sol[x][y]=1;
			return true;
		}
		if(issafe(maze,x,y))
		{
			sol[x][y]=1;
			if(printMazepathutil(maze,x+1,y,sol))
			{
				return true;
			}
			if(printMazepathutil(maze,x,y+1,sol))
			{
				return true;
			}
			sol[x][y]=0;
		}
		return false;
	}
	public boolean issafe(int maze[][],int x,int y)
	{
		if(x>=0&&x<N&&y>=0&&y<N&&maze[x][y]==1)
		{
			return true;
		}
		return false;
	}
	public boolean printmazepath(int[][]maze)
	{
		int [][]finalpath=new int[N][N];
		if(!printMazepathutil(maze,0,0,finalpath)) 
		{
			return false;
		}
		print(finalpath);
		return true;
	}
		public void print(int [][]mat )
		{
			for(int i=0;i<N;i++)
			{
				for(int j=0;j<N;j++)
				{
					System.out.print(mat[i][j]+" ");
				}
				System.out.println();
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][]= {{1,1,0,0},
				      {1,1,1,0},
				      {0,0,1,1},
				      {1,1,1,1}};
		RatMazeProblem f=new RatMazeProblem();
		f.printmazepath(mat);
		}
	

	}


