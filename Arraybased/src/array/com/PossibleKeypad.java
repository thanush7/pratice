package array.com;
import java.util.*;
public class PossibleKeypad {

	private static List<String> combination=new ArrayList<>();
	private static Map<Character,String> letter=Map.of('2',"abc",'3',"def",'4',"ghi",'5',"jkl",'6',"mno",'7',"pqrs",'8',"tuv",'9',"wxyz");
	public static String phonedigit;
	
	public  static List<String> lc(String digit)
	{
		if(digit.length()==0)
		{
			return combination;
		}
		phonedigit=digit;
		backtrack(0,new StringBuilder());
		return combination;
	}
	public static void backtrack(int index,StringBuilder path)
	{
		if(path.length()==phonedigit.length())
		{
			combination.add(path.toString());
		}
		String possibleletters=letter.get(phonedigit.charAt(index));
		for(char lett:possibleletters.toCharArray())
		{
			path.append(lett);
			backtrack(index+1,path);
			path.deleteCharAt(path.length()-1);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lc("235"));

	}

}
