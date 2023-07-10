import java.util.*;
public class Main
{
     private static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
    public static int count(char ch[][],int s,int e)
    {
        int rows=ch.length;
        int cols=ch[0].length;
        
        Queue<int[]> q=new LinkedList<>();
        boolean visited[][]=new boolean[rows][cols];
        
        q.offer(new int[]{s,e});
        visited[s][e]=true;
        int cnt=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                int cur[]=q.poll();
                int currow=cur[0];
                int curcol=cur[1];
                
                for(int j[]:DIRECTIONS)
                {
                    int newrow=currow+j[0];
                    int newcol=curcol+j[1];
                    if(newrow>=0&&newrow<rows&&newcol>=0&&newcol<cols)
                    {
                        if(ch[newrow][newcol]=='T'&&!visited[newrow][newcol])
                        {
                            q.offer(new int[] {newrow,newcol});
                            visited[newrow][newcol]=true;
                        }
                    }
                }
                
            }
            cnt++;
            
        }
        return cnt-1;
        
    }
	public static void main(String[] args) {
		char ch[][]={{'W','T','T'},
		             {'T','W','W'},
		             {'W','T','T'}};

		 int s=0,e=0;
		 int flag=0;
		 for(int i=0;i<3;i++)
		 {
		     for(int j=0;j<3;j++)
		     {
		         if(ch[i][j]=='T')
		         {
		             s=i;
		             e=j;
		             flag=1;
		             break;
		             
		         }
		         
		     }
		     if(flag==1)
		     {
		         break;
		     }
		 }
		 System.out.print(count(ch,s,e));
		
		             
	}
}
