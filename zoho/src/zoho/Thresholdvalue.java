package zoho;

public class Thresholdvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={5,8,10,13,6,2};
		int threshold=3;
		
		int count=0;
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			temp=threshold;
			int sum=0;
			while(sum!=arr[i])
			{
				sum+=temp;
				count++;
				if(sum>arr[i])
				{
					sum-=temp;
					temp--;
					count--;
				}
				
			}
		}
		System.out.println(count);

	}

}
