package array.com;

public class Twostack {
	
	int top1;
	int top2;
	int array[];
	int size;
	public Twostack(int size)
	{
		this.size=size;
		array=new int[size];
		top1=-1;
		top2=size;
	}
    public void push1(int x)
    {
    	if(top1<top2)
    	{
    		array[++top1]=x;
    		System.out.println("element pushed successfully");
    	}
    	else
    	{
    		System.out.println("overflow");
    		System.exit(0);
    	}
    }
    public void push2(int x)
    {
    	if(top1<top2-1)
    		if(top1<top2)
        	{
        		array[--top2]=x;
        		System.out.println("element pushed successfully");
        	}
        	else
        	{
        		System.out.println("overflow");
        		System.exit(0);
        	}
    }
    public int pop1()
    {
    	if(top1>=0)
    	{
    		return array[top1--];
    	}
    	else
    	{
    		System.out.println("underflow");
    		return 0;
    	}
    }
    public int push2()
    {
    	if(top2<size)
    	{
    		return array[top2++];
    	}
    	else
    	{
    		System.out.println("underflow");
    	}
		return 0;
    }
	public static void main(String[] args) {
		Twostack s=new Twostack(5);
		s.push1(1);
		s.push1(2);
		s.push1(3);
		System.out.println(s.pop1());
	}
}
