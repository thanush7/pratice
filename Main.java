/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static boolean palindrome(String s)
    {
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        if(s.equals(sb.toString()))
        {
            return true;
        }
        return false;
    }
    public static void Palin3(String s)
    {
        int len=s.length();
        for(int i=1;i<len-1;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                String s1=s.substring(0,i);
                String s2=s.substring(i,j);
                 String s3=s.substring(j,len);
                 if(palindrome(s1)&&palindrome(s2)&&palindrome(s3))
                 {
                     System.out.print(s1+" "+s2+" "+s3);
                     return;
                 }
            }
        }
    }
	public static void main(String[] args) {
	    String s="nayannamantenet";
	    Palin3(s);
	}
}
