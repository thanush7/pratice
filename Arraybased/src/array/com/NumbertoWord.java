package array.com;

public class NumbertoWord {
	
	public static void number(int num)
	{
		solve(num);
	}
	public static void solve(int num)
	{
		String ones[]= {"","one","two","three","four","five","six","seven","eight","nine"};
		String  tens[]= {"","","twenty","thirty","fourty","fivety","sixty","seventy","ninety"};
		String special[]= {"ten","eleven","tweleve","thirteen","fourteen","fiveteen","sixteen","seventeen","eighteen","nineteen"};
		
		StringBuilder res=new StringBuilder();
		
		if(num<10) res.append(ones[num]);
		if(num<20) res.append(special[num-10]);
		if (num < 100) res.append(tens[num/10]+" "+(solve(num % 10)));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
