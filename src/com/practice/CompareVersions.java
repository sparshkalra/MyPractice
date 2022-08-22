package com.practice;

public class CompareVersions {

	public static void main(String[] args)
	{
		

		/*System.out.println(compareVersion("1.01","1.001"));
		System.out.println(compareVersion("1.0","1.0.0"));
		System.out.println(compareVersion("0.1","1.1"));
		System.out.println(compareVersion("1.01","1"));*/
		//System.out.println(compareVersion("7.5.2.4","7.5.3"));
		
		System.out.println(decodeString("3[a]2[bc]"));
	}
	 public static int compareVersion(String version1, String version2) 
	    {
	        
	        String[] oneVersion = version1.split("\\.");
	        String[] twoVersion = version2.split("\\.");
	        
	        int i=0;
	        
	        
	        
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
	 
	 public static String decodeString(String s) 
	    {
	        String s1 = "";
	        for(int i=0;i<s.length();i++)
	        {
	            if(Character.isDigit(s.charAt(i)))
	            {
	                int times = s.charAt(i) - '0';
	                if(s.charAt(++i) == '[')
	                {
	                    i++;
	                    String s2 = "";
	                    while(s.charAt(i)!= ']')
	                    {
	                        s2 = s2 + String.valueOf(s.charAt(i));
	                        i++;
	                    }
	                    for(int j=0;j<times;j++)
	                    {
	                        s1 = s1+ s2;
	                    }
	                    
	                }
	        
	            }
	        }
	        return s1;
	    }
}
