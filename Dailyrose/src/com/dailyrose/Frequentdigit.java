package com.dailyrose;
import java.util.*;
public class Frequentdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int n=4;
	   int ar[]= {1123,-34,345,453};
	   ArrayList<Integer> list=new ArrayList<>();
	   for(int i=0;i<ar.length;i++)
	   {
		   int temp=ar[i];
		   if(temp<0)
		   {
			   int t=temp/10;
			   list.add(t);
			   temp=temp*-1;
			   while(temp!=0)
			   {
				   list.add(temp%10);
				   temp/=10;
			   }
			   list.remove(list.size()-1);
			   
		   }
		   else
		   {
			   while(temp!=0)
			   {
				   list.add(temp%10);
				   temp/=10;
			   }
		   }
		   
	   }
	   HashMap<Integer,Integer> hm=new HashMap<>();
	   HashMap<Integer,Integer> hc=new HashMap<>();
	   for(int i=0;i<list.size();i++)
	   {
		   if(hm.containsKey(list.get(i)))
		   {
			   hm.put(list.get(i),hm.get(list.get(i))+1);
		   }
		   else
		   {
			   hm.put(list.get(i),1);
			   hc.put(list.get(i),i);
		   }
	   }
	   System.out.println(list);
	   Collections.sort(list,new Comparator<Integer>()
			   {
		           public int compare(Integer n1,Integer n2)
		           {
		        	   int freq1=hm.get(n1);
		        	   int freq2=hm.get(n2);
		        	   if(freq1!=freq2)
		        	   {
		        		   return freq2-freq1;
		        	   }
		        	   else
		        	   {
		        		   return freq1-freq2;
		        	   }
		           }
			   });
	   System.out.println(hm.entrySet());
	   System.out.println(list);
	    

	}

}
