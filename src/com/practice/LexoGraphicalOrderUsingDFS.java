package com.practice;

import java.util.ArrayList;
import java.util.List;

public class LexoGraphicalOrderUsingDFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(lexicalOrder(13));
	}

	public static List<Integer> lexicalOrder(int n) 
    {
		List<Integer> al = new ArrayList<Integer>();
		
		
		for(int i=1;i<=9;i++)
		{
			dfs(i,n,al);
		}
		
		return al;
    }
	public static void dfs(int num,int n,List<Integer>al)
	{
		if(num > n)
		{
			return;
		}
		al.add(num);
		for(int i=0;i<10;i++)
		{
			
			dfs(num*10+i,n,al);
		}
		
	}
	
}
