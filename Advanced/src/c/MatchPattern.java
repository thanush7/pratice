package c;
public class MatchPattern {
	public static void main(String[] args) {
		String str1="AABACCAABA";
		String str2="AABA";
		int n=str2.length();
		for(int i=0;i<str1.length()-str2.length()+1 ;i++)
		{
				String temp=str1.substring(i,i+str2.length());
				if(temp.equals(str2))
				{
					System.out.println(i);
				}
		}
	}
}
