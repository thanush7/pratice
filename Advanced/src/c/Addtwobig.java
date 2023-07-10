package c;

public class Addtwobig {
	public static void swap(String s1,String s2)
	{
		String temp=s1;
		s1=s2;
		s2=temp;
	}
	
	public static String findsum(String str1,String str2)
	{
		if(str1.length()<str2.length())
		{
			swap(str1,str2);
		}
		StringBuilder ss=new StringBuilder();
		int n1=str1.length(),n2=str2.length();
		StringBuilder sb1=new StringBuilder(str1);
		sb1.reverse();
		StringBuilder sb2=new StringBuilder(str2);
		sb2.reverse();
		String rev1=sb1.toString();
		String rev2=sb2.toString();
		int carry=0;
		int i;
		for(i=0;i<n1;i++)
		{
			int sum=(rev1.charAt(i)-'0')+(rev2.charAt(i)-'0')+carry;
			ss.append(sum%10+'0');
			carry=sum/10;
		}
		for(i=n1;i<n2;i++)
		{
			int sum=(rev1.charAt(i)-'0')+carry;
			ss.append(sum%10+'0');
			carry=sum/10;
		}
		if(carry>1)
		{
			ss.append(carry-'0');
		}
		ss.reverse();
		return ss.toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="1234";
		String s2="1234";
		System.out.println(findsum(s1,s2));

	}

}
