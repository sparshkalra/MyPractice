package com.gfg.practice;

public class ArrayAlternatePositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1, 2, 3, -4, -1, 4};
		
		rearrange(a);
	}
	
	static void rearrange(int[] arr)
	{
		int outofplace = -1;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
            if (outofplace >= 0) 
            {
            	int current = arr[i];
                if (((current >= 0) && (arr[outofplace] < 0)) 
                    || ((current < 0) && (arr[outofplace] >= 0))) 
                {
                    rightrotate(arr, n, outofplace, i);
 
                    // the new out-of-place entry is now 2
                    // steps ahead
                    if (i - outofplace >= 2)
                        outofplace = outofplace + 2;
                    else
                        outofplace = -1;
                }
            }
 
            // if no entry has been flagged out-of-place
            if (outofplace == -1) {
                // check if current entry is out-of-place
                if (((arr[i] >= 0) && ((i & 0x01) == 0)) || ((arr[i] < 0) && (i & 0x01) == 1))
                {
                	  outofplace = i;
                }
                  
            }
        }
	}
	
	static void  rightrotate(int arr[], int n, int outofplace,
            int cur)
	{
		int tmp = arr[cur];
		for (int i = cur; i > outofplace; i--)
			arr[i] = arr[i - 1];
		arr[outofplace] = tmp;
	}

}
