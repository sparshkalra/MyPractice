package com.striver.day16;

public class CompareVersions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int compareVersion(String version1, String version2) 
    {
        int op =0;
        
        String[] oneVersion = version1.split("\\.");
        String[] twoVersion = version2.split("\\.");
        
        int i=0;
        
        int len1 = oneVersion.length;
        int len2 = twoVersion.length;
        
        
        while(i < oneVersion.length && i < twoVersion.length)
        {
            String s1 = oneVersion[i];
            String s2 = twoVersion[i];
            
            
            
            for(int k=0;k < s1.length();k++)
            {
                while(s1.charAt(k) ==0)
                {
                    k++;
                }
                s1 = s1.substring(k);
                break;
            }
            
            
            for(int k=0;k < s2.length();k++)
            {
                while(s2.charAt(k) ==0)
                {
                    k++;
                }
                s2 = s2.substring(k);
                break;
            }
            
            
            int i1 = Integer.parseInt(s1);
            int i2 = Integer.parseInt(s2);
            
            if(i2 > i1)
            {
                return -1;
            }
            else if(i1 > i2)
            {
                return 1;
            }
            else i++;
            
        }
        
        if(i == oneVersion.length)
        {
            for(int m =i;m < twoVersion.length;m++)
            {
                String s = twoVersion[m];
                for(int k=0;k < s.length();k++)
                {
                    while(s.charAt(k) ==0)
                    {
                        k++;
                    }
                    s = s.substring(k);
                    break;
                }
                int num = Integer.parseInt(s);
                if(num >0)
                {
                    return -1;
                }
            }
        }
        else if (i == twoVersion.length)
        {
            for(int m =i;m < oneVersion.length;m++)
            {
                String s = oneVersion[m];
                for(int k=0;k < s.length();k++)
                {
                    while(s.charAt(k) ==0)
                    {
                        k++;
                    }
                    s = s.substring(k);
                    break;
                }
                int num = Integer.parseInt(s);
                if(num >0)
                {
                    return 1;
                }
            }
        }
        return 0;
        
    }
}
