package zoho;

import java.util.Arrays;

public class Findweight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={10,36,54,89,12};
		Arrays.sort(arr);
		int weight[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int sq=(int)Math.sqrt(arr[i]);
			if(sq*sq==arr[i])
			{
				weight[i]+=5;
			}
			if(arr[i]%4==0&&arr[i]%6==0)
			{
				weight[i]+=4;
			}
			if(arr[i]%2==0)
			{
				weight[i]+=3;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" "+weight[i]);
		}

	}

}
