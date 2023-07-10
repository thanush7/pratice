package c;

import java.util.Stack;

public class PrintBracketNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="(aa(bdc))p(dee)ae";;
		StringBuilder s=new StringBuilder();
		Stack<Integer> st=new Stack<>();
		int count=1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
			{
				st.push(count);
				s.append(count);
				count++;
			}
			if(str.charAt(i)==')'&&!st.isEmpty())
			{
				s.append(st.pop());
			}			
		}
		System.out.println(s.toString());

	}

}
