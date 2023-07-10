package c;

import java.util.Collections;
import java.util.Comparator;
import java.util.*;
public class Ranksort {

	public static void main(String[] args) {
	    HashMap<Character,Integer> hm=new HashMap<>();
	    ArrayList<Character> list=new ArrayList<>();
	    int a[]={5,3,4,2,1};
	    char ch[]={'a','b','c','d','e'};
	    for(int i=0;i<5;i++)
	    {
	        hm.put(ch[i],a[i]);
	        list.add(ch[i]);
	    }
	    Collections.sort(list,new Comparator<Character>()
	    {
	        public int compare(Character n1,Character n2)
	        {
	            int freq1=hm.get(n1);
	            int freq2=hm.get(n2);
	            return freq1-freq2;
	        }
	    });
	    System.out.println(list);
	}

}
