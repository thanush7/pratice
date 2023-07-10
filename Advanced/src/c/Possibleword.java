package c;

import java.util.ArrayList;
import java.util.HashMap;

public class Possibleword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4};
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(2,"abc");
		hm.put(3, "def");
		hm.put(4,"ghi");
		hm.put(5,"jkl");
		hm.put(6,"mno");
		hm.put(7,"pqrs");
		hm.put(8,"tuv");
		hm.put(9,"wxyz");
		ArrayList<String> list=new ArrayList<>();
		backtrack(a,hm,0,new StringBuilder(),list);
		System.out.println(list);

	}
	public static void backtrack(int a[],HashMap<Integer,String> hm,int i,StringBuilder sb,ArrayList<String> res)
	{
		if(sb.length()==a.length)
		{
			res.add(sb.toString());
			return;
		}
		else
		{
			String curem=hm.get(a[i]);
			for(int j=0;j<curem.length();j++)
			{
				sb.append(curem.charAt(j));
				backtrack(a,hm,i+1,sb,res);
				sb.deleteCharAt(sb.length()-1);
			}
		}
	}


}
