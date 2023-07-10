import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int low=4,high=5,k=3;
		
		int evencount=high/2-(low-1)/2;
		int oddcount=(high+1)/2-low/2;
		
		long evensum=1;
		long oddsum=0;
		
		
		for(int i=0;i<k;i++)
		{
		    long preveven=evensum;
		    long prevodd=oddsum;
		    
		    evensum=(preveven*evencount)+(prevodd*oddcount);
		    oddsum=(prevodd*evencount)+(preveven*oddcount);
		}
		System.out.println(evensum);
	}
}
