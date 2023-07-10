package com.ccc;

public class Maxiele {

	public static void max(int arr [],int n)
    {
    	int i;
    	int lar=0;
    	int index=0;
    	for( i=0;i<n;i++)
    	{
    		if(arr[i]>lar)
    		{
    			lar=arr[i];
    			index=i;
    		}
    	}
    	System.out.println(lar+" "+index);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,45,82,71};
		max(arr,arr.length);

	}

}
