package zoho;

public class Stringadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1ab40b3";
		int sum=0,num=0; 
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)-48>=0&&s.charAt(i)-48<=9)
			{
				num=num*10+(s.charAt(i)-48);
			}
			else
			{
				sum+=num;
				System.out.println(num);
				num=0;
			}
		}
		System.out.println(sum);

	}

}
