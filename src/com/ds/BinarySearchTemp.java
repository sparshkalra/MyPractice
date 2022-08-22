package com.ds;



public class BinarySearchTemp {
	// Returns index of x if it is present in arr[l..
	// r], else return -1
	
	int binarySearch2(int arr[], int x)
	{
		int n = arr.length;
		if(n == 0)
		{
			return -1;
		}
		int l = 0;
		int r = n-1;
		
		while(l < r)
		{
			int m = l+ (r - l) /2;
			if(arr[m] > x)
			{
				r = m-1;
			}
			else
			{
				l = m+1;
			}
		}
		if(arr[l] == x)
		{
			return l;
		}
		return -1;
	}
	
	
	int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = r - l / 2;
  
            // Check if x is present at mid
            if (arr[m] == x)
                return m;
  
            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;
  
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
  
        // if we reach here, then element was
        // not present
        return -1;
    }

	// Driver method to test above
	public static void main(String args[])
	{
		BinarySearchTemp ob = new BinarySearchTemp();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 10;
		
		
		int arr2[] = {1,2,5,9,9};
		System.out.println(ob.binarySearch2(arr2, 1));
	}
}
/* This code is contributed by Rajat Mishra */

