package zoho;

public class Kadanes {
   public static void main(String[] args) {
	//max subarray sum using kadanes
	   int arr[]= { -2, -3, 4, -1, -2, 1, 5, -3 };
	   int maxend=0,maxfar=0;
	   for(int i=0;i<arr.length;i++)
	   {
		   maxend+=arr[i];
		   if(maxfar<maxend)
		   {
			   maxfar=maxend;
		   }
		   if(maxend<0)
		   {
			   maxend=0;
		   }
	   }
	   System.out.println(maxfar);
}
}
