package com.gfg.practice;

import java.util.HashSet;
import java.util.Set;

public class ComputerAllocation 
{
	public static void main(String[] args)
	{
	    System.out.println(runCustomerSimulation(2, "ABBAJJKZKZ".toCharArray()));
	    System.out.println(runCustomerSimulation(3, "GACCBDDBAGEE".toCharArray()));
	    System.out.println(runCustomerSimulation(3, "GACCBGDDBAEE".toCharArray()));
	    System.out.println(runCustomerSimulation(1, "ABCBCA".toCharArray()));
	    System.out.println(runCustomerSimulation(1, "ABCBCADEED".toCharArray()));
	}
	
	static int runCustomerSimulation(int n, char []seq)
	{
		int count = 0;
		Set<Character> hs = new HashSet();
		Set<Character> emptySet = new HashSet();
		for(int i=0;i<seq.length;i++)
		{
			if(emptySet.contains(seq[i]))
			{
				continue;
			}
			if(hs.contains(seq[i]))
			{
				hs.remove(seq[i]);
				continue;
			}
			if(hs.size() == n)
			{
				count++;
				emptySet.add(seq[i]);
			}
			else
			{
				hs.add(seq[i]);
			}
			
		}
		return count;
	}
}
