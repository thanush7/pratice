package com.kce;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

class node
{
	int data;
	node left;
	node right;
	int height;
}
class BinaryTree{
	public  node createnode(int val)
	{
		node newnode=new node();
		newnode.data=val;
		newnode.left=null;
		newnode.right=null;
		return newnode;
	}
	int maxlvl;
	public void leftview(node root,int level)
	{
		if(root==null)
		{
			return;
		}
		if(level>=maxlvl)
		{
			System.out.println(root.data);
			maxlvl++;
		}
		leftview(root.left,level+1);
		leftview(root.right,level+1);
	}
	public  int maxlevel;
	public  void rightview(node root,int level)
	{
		
		if(root==null)
		{
			return;
		}
		if(level>=maxlevel)
		{
			System.out.println(root.data);
			maxlevel++;
		}
		rightview(root.right,level+1);
		rightview(root.left,level+1);
	}
	public void printbound(node root)
	{
		if(root!=null)
		{
			System.out.print(root.data);
			leftbound(root.left);
			printleaf(root.left);
			printleaf(root.right);
			rightbound(root.right);
		}
	}
	public void leftbound(node root)
	{
		if(root==null)
		{
			return;
		}
		if(root.left!=null)
		{
			System.out.print(root.data);
			leftbound(root.left);
		}
		else if(root.right!=null)
		{
			System.out.print(root.data);
			leftbound(root.right);
		}
	}
	public void printleaf(node root)
	{
		if(root==null)
		{
			return;
		}
		printleaf(root.left);
		if(root.left==null&&root.right==null)
		{
			System.out.print(root.data);
		}
		printleaf(root.right);
	}
	public void rightbound(node root)
	{
		if(root==null)
		{
			return;
		}
		if(root.right!=null)
		{
			rightbound(root.right);
			System.out.print(root.data);
		}
		else if(root.left!=null)
		{
			rightbound(root.left);
			System.out.print(root.data);
		}
	}
	public int sumOfallnode(node root)
	{
		if(root==null)
		{
			return 0;
		}
		return root.data+sumOfallnode(root.left)+sumOfallnode(root.right);
	}
	public int difference(node root)
	{
		if(root==null)
		{
			return 0;
		}
		return root.data-difference(root.left)-difference(root.right);
	}
	public int NoNode(node root)
	{
		if(root==null)
		{
			return 0;
		}
		return 1+NoNode(root.left)+NoNode(root.right);
	}
	public void parent(node root,int val,int parent)
	{
		if(root==null)
		{
			return;
		}
		if(root.data==val)
		{
			System.out.print(parent);
		}
		else
		{
			parent(root.left,val,root.data);
			parent(root.right,val,root.data);
		}
	}
	public int leafcount(node root)
	{
		if(root==null)
		{
			return 0;
		}
		if(root.left!=null&&root.right!=null)
		{
			return 1;
		}
		return leafcount(root.left)+leafcount(root.right);
		
	}
	public int height(node root)
	{
		if(root==null)
		{
			return -1;
		}
		return max(height(root.left),height(root.right))+1;
	}
	public static int max(int a,int b)
	{
		return a>b?a:b;
	}
	public static void topview(node root)
	{
		if(root==null)
		{
			return;
		}
		TreeMap<Integer,Integer> m=new TreeMap<>();
		Queue<node> q=new LinkedList<node>();
		q.add(root);
		while(!q.isEmpty())
		{
			node temp=q.remove();
			int hd=temp.height;
			if(m.get(hd)==null)
			{
				m.put(hd,temp.data);
			}
			if(temp.left!=null)
			{
				temp.left.height=hd-1;
				q.add(temp.left);
			}
			if(temp.right!=null)
			{
				temp.right.height=hd+1;
				q.add(temp.right);
			}
			
		}
		System.out.println(m.values());
	}
	public static void bottomview(node root)
	{
		if(root==null)
		{
			return;
		}
		TreeMap<Integer,Integer> m=new TreeMap<>();
		Queue<node> q=new LinkedList<node>();
		q.add(root);
		while(!q.isEmpty())
		{
			node temp=q.remove();
			int hd=temp.height;
			m.put(hd,temp.data);
			if(temp.left!=null)
			{
				temp.left.height=hd-1;
				q.add(temp.left);
			}
			if(temp.right!=null)
			{
				temp.right.height=hd+1;
				q.add(temp.right);
			}
		}
		System.out.println(m.values());
	}
	public static void dfs(node root)
	{
		if(root==null) return;
		Stack<node> st=new Stack<>();
		st.push(root);
		while(!st.isEmpty())
		{
			node temp=st.pop();
			System.out.print(temp.data+" ");
			if(temp.right!=null) st.push(temp.right);
			if(temp.left!=null) st.push(temp.left);
			
		}
	}
	public static void bfs(node root)
	{
		Queue<node> q=new LinkedList<node>();
		if(root==null) return;
		q.add(root);
		while(!q.isEmpty())
		{
			int size=q.size();
			for(int i=0;i<size;i++)
			{
				node temp=q.remove();
				System.out.print(temp.data+" ");
				if(temp.left!=null) q.add(temp.left);
				if(temp.right!=null) q.add(temp.right);
			}
		}
	}
}

public class TreeExample {

	public static void main(String[] args){
		BinaryTree a=new BinaryTree();
		node root=a.createnode(2);
		root.left=a.createnode(7);
		root.right=a.createnode(5);
		root.left.left=a.createnode(2);
		root.left.right=a.createnode(6);
		root.left.right.left=a.createnode(5);
		root.left.right.right=a.createnode(11);
		root.right.right=a.createnode(9);
		root.right.right.left=a.createnode(4);
//		a.leftview(root,0);
//		System.out.println(a.sumOfallnode(root));
//		System.out.println(a.NoNode(root));
//		System.out.println(a.difference(root));
//		System.out.println(a.leafcount(root));
//		System.out.println(a.height(root));
//		a.parent(root,6, -1);
		a.printbound(root);
		//a.bfs(root);
		System.out.println();
		//a.dfs(root);
		}
	
}
