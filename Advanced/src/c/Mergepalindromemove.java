package c;

public class Mergepalindromemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1, 4, 5, 1};
		int n=a.length-1;
		int ans=0;
		for(int i=0,j=n-1;i<=j;)
		{
			
			if(a[i]==a[j])
			{
				i++;
				j--;
			}
			if(a[i]>a[j])
			{
				j--;
				a[j]+=a[j-1];
				ans++;
			}
			if(a[i]<a[j])
			{
				i++;
				a[i]+=a[i-1];
				ans++;
			}
		}
		System.out.println(ans);
	}

}
