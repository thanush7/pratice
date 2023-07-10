package com.spring;

import java.util.*;

public class LinearProbing {
	
	public static int[] probe(List<Integer> list)
	{
		int size=list.size();
		int hashtable[]=new int[size];
		for(int i=0;i<size;i++)
		{
			hashtable[i]=-1;
		}
		for(int i=0;i<list.size();i++)
		{
			int hash=list.get(i)%size;
			while(hashtable[hash]!=-1)
			{
				hash=(hash+1)%size;
			}
			hashtable[hash]=list.get(i);
		}
		return hashtable;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
		//5 3 2 6 4
		list.add(5);
		list.add(3);
		list.add(2);
		list.add(6);
		list.add(4);
		int arr[]=probe(list);
		for(int i:arr)
			System.out.print(i+" ");
		//System.out.println(arr);
	}

}
