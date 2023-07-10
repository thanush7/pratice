package zoho;


import java.util.*;
public class Permutationdistinct {
	
	public static List<List<Integer>> permute(int nums[])
	{
		List<List<Integer>> res=new ArrayList<>();
		dfs(new ArrayList<>(),new boolean [nums.length],res,nums);
		return res;
	}
    public static void dfs(List<Integer> path,boolean used[],List<List<Integer>> res,int nums[])
    {
    	if(path.size()==used.length)
    	{
    		res.add(new ArrayList<>(path));
    		return;
    	}
    	
    	for(int i=0;i<used.length;i++)
    	{
    		if(used[i]) continue;
    		path.add(nums[i]);
    		used[i]=true;
    		dfs(path,used,res,nums);
    		path.remove(path.size()-1);
    		used[i]=false;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3};
		System.out.println(permute(a));
		

	}

}
