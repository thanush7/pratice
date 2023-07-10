package zoho;

public class Addbinary {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="1001";
		String s2="1100";
		int n1=s1.length();
		int n2=s2.length();
		int carry=0;
		String res="";
		int i=0,j=0;
		
		while(i!=n1||j!=n2)
		{
			res+= (carry+ (s1.charAt(i++)-48)+(s2.charAt(j++)-48)%2);
			res
			
		}
	}
}
