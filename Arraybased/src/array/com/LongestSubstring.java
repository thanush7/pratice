package array.com;
import java.util.*;
public class LongestSubstring {
	public static String longest(String str)
	{
		HashSet<Character> hs=new HashSet<>();
		String longestnow="";
		String longestoverall="";
		for(int i=0;i<str.length();i++)
		{
			 char c=str.charAt(i);
			 if(hs.contains(c))
			 {
				 longestnow="";
				 hs.clear();
			 }
			 longestnow+=c;
			 hs.add(c);
			 if(longestoverall.length()<longestnow.length())
			 {
				 longestoverall=longestnow;
			 }
		}
		return longestoverall;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(longest("abcdabc"));
	}

}
