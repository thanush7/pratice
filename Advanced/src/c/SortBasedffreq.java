package c;
import java.util.*;
public class SortBasedffreq {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,2,2,8,9,1,1,1};
		HashMap<Integer,Integer> mapcount=new HashMap<>();
		HashMap<Integer,Integer> mapindex=new HashMap<>();
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			list.add(a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			if(mapcount.containsKey(a[i]))
			{
				mapcount.put(a[i],mapcount.get(a[i])+1);
			}
			else
			{
				mapcount.put(a[i],1);
				mapindex.put(a[i],i);
			}
		}
	     Collections.sort(list,new Comparator<Integer> ()
	    		 {
	    	            public int compare(Integer n1,Integer n2)
	    	            {
	    	            	int freq1=mapcount.get(n1);
	    	            	int freq2=mapcount.get(n2);
	    	            	if(freq1!=freq2)
	    	            	{
	    	            		return freq2-freq1;
	    	            	}
	    	            	else
	    	            	{
	    	            		return mapindex.get(n1)-mapindex.get(n2);
	    	            	}
	    	            }
	    		 }    		 
	    		 ); 
		System.out.println(list);
	}
}
