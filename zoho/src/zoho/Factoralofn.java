package zoho;

import java.util.Arrays;

public class Factoralofn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=43;
		int arr[]=new int[10000];
		Arrays.fill(arr,0);
	    arr[0]=1;
	    int q=2;
	    int len=1;
	    int x=0;
	    int num=0;
	    while(q<=n)
	    {
	    	x=0;
	    	num=0;
	    	while(x<len)
	    	{
	    		arr[x]=arr[x]*q+num;
	    		num=arr[x]/10;
	    		arr[x]=arr[x]%10;
	    		x++;
	    	}
	    	while(num!=0)
	    	{
	    		arr[len]=num%10;
	    		num/=10;
	    		len++;
	    	}
	    	q++;
	    }
	    len--;
	    while(len>=0)
	    {
	    	System.out.print(arr[len--]);
	    }
		
	}

}
