package zoho;

import java.util.Stack;

public class Balancedparenthes {
	
	public static boolean valid(String s)
	{
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='('||c=='{'||c=='[')
			{
				st.add(c);
				continue;
			}
			if(st.isEmpty()) return false;
			char check;
			switch(c)
			{
			case')':
				check=st.pop();
				if(check=='['||check=='{') return false;
				break;
			case ']':
				check=st.pop();
				if(check=='('||check=='{') return false;
				break;
			case '}':
				check=st.pop();
				if(check=='['||check=='(') return false;
				break;
			}
			
		}
		return st.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="([]{})";
		System.out.println(valid(s));

	}

}
