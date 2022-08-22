package com.striver.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumProblem {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] nums = {-1,0,1,2,-1,-4};
		System.out.println(threeSum(nums));
		
	}
	
	public static List<List<Integer>> threeSum(int[] nums) 
    {
        List<List<Integer>> abc = new ArrayList<List<Integer>>();
        
        Arrays.sort(nums);
        
        for(int i=0;i< nums.length;i++)
        {
            int l =i+1;
            int r = nums.length-1;
            
            if(i > 0 && nums[i] == nums[i-1])
            {
                continue;
            }
            while(l <=r)
            {
                
                if(nums[i]+nums[l]+nums[r] == 0 && l!=r && l!=i && r!=l)
                {
                    List<Integer> output = new ArrayList<>();
                    output.add(nums[l]);
                    output.add(nums[r]);
                    output.add(nums[i]);
                    abc.add(output);
                    while(l < r && nums[l] == nums[l+1])
                    {
                    	l++;
                    }
                    l++;
                    r--;
                }
                else if(nums[i]+nums[l]+nums[r] > 0)
                {
                    r--;
                }
                else
                {
                    l++;
                }    
            }
            
        }
        return abc;
        
    }

}
