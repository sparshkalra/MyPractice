package com.practice;

public class MaxHeight {
	
	public static void main(String[] args)
	{
		int[]height = {1,1};
		System.out.println(maxArea(height));
	}
	
	
	public static int maxAreaDP(int[]arr)
	{
		int op =0;
		int l =0;
		int area = 0;
		int r = arr.length-1;
		while(l<=r)
		{
			area = Math.min(l, r)* (r-l);
			
			op = Math.max(area, op);
			
			if(arr[l] > arr[r])
			{
				r--;
			}
			else
			{
				l++;
			}
		}
		
		return op;
	}
	
	
	
	
	
	
	
	
	
	public static int maxArea(int[] height) 
    {
        int max = 0;
        for(int i =0;i<height.length-1;i++)
        {
            
            for(int j =i+1;j<height.length;j++)
            {
                int depth = Math.min(height[i],height[j])* (j-i);
                
                if(depth > max)
                {
                    max = depth;
                }
            }
            
        }
        
        return max;
    }
	public int maxAreaBestCase(int[] height) 
    {
        int max = 0;
        int l =0;
        int r = height.length-1;
        
        while(l<=r)
        {
            int capacity = Math.min(height[l],height[r])*(r-l);
            
            max = Math.max(capacity,max);
            
            if(height[l] > height[r])
            {
                r--;
            }
            else
            {
                l++;
            }
        }
        
        return max;
    }

}
