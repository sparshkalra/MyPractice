package com.practice;

import java.time.temporal.IsoFields;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSumZero {

	public static void main(String[] args) 
	{
		int []arr = {0, -1, 2, -3, 1};
		int[]nums = { -1,0,1,2,-1,-4};
		int[]nums2 = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
		int[]nums3 = {1,1,-2};
		int[]nums4 = {-2,0,0,2,2};
		int[]nums5 = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
		
		List<List<Integer>> abc = new TripletSumZero().threeSum(nums5);
		
		System.out.println(abc.size());
		System.out.println(abc);
		
		//List<int[]> result = findTriplets(arr);
		
		//result.stream().forEach(action) ->System.out.println(action));
		
		/*for(int[]var : result )
		{
			
			System.out.print("Element --->   ");
			for(int i =0; i< var.length; i++)
			{
				System.out.print(var[i]);
				System.out.print(",");
			}
			System.out.println();
		}*/
	}
	
	public static List<int[]> findTriplets(int arr[])
	{
		Arrays.sort(arr);
		List<int[]> result = new ArrayList<int[]>();
		
		for(int i=0; i< arr.length; i++)
		{
			int l= i+1;
			int r = arr.length -1;
			
			while(l <r )
			{
				if(arr[i]+ arr[l]+ arr[r] == 0)
				{
					l++;
					r--;
					
					int []rs = {arr[i],arr[l],arr[r]};
					result.add(rs);
				}
				else if(arr[i]+ arr[l]+ arr[r] < 0)
				{
					l++;
				}
				else
				{
					r--;
				}
			}
		}
		return result;
	}
	
	public List<List<Integer>> threeSum(int[] nums) 
    {
       List<List<Integer>> output = new ArrayList<List<Integer>>();
        
        Arrays.sort(nums);
        
        int count=0;
      
        for(int i =0;i< nums.length-2;i++)
        {
        	if(i >0 && nums[i] == nums[i-1])
        	{
        		continue;
        	}
            int l=i+1;
            int r=nums.length-1;
            
            while(l<r)
            {
                if(nums[i]+ nums[l]+nums[r] ==0)
                {
                   
                   
                        List<Integer> ele = new ArrayList<Integer>();
                        ele.add(nums[i]);
                        ele.add(nums[l]);
                        ele.add(nums[r]);
                    
                        output.add(ele);
                        
                        System.out.println("Before this line : l= " +l + "and r= "+ r);
                        
                        while(l < r && nums[l] == nums[l+1])
                        {
                        	l++;
                        }
                        l++;
                        r--;
                        System.out.println("After this line : l= " +l + "and r= "+ r);
                    
                }
                else if(nums[i]+ nums[l]+nums[r] >0)
                {
                    r--;
                }
                else
                {
                    l++;
                }
            }
            
        }
        
        return output;
    }

}
