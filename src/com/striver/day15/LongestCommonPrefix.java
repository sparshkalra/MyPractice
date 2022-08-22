package com.striver.day15;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String longestCommonPrefix(String[] strs) 
    {
        if(strs.length ==1)
        {
            return strs[0];
        }
        String common = strs[0];
        boolean flag = true;
        
        for(int i=1;i< strs.length;i++)
        {
            String var = strs[i];
            int j =0;
            while(common.length() > 0 && j < var.length() && j < common.length() && common.charAt(j) == var.charAt(j) )
            {
                    flag = false;
                    j++;
            }
                common = common.substring(0,j);
        }
        if(flag)
            common = "";
        return common;
    }

}
