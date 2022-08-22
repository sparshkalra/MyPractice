package com.practice;

public class TwoDimensionArrayReverseAndInvert 
{
	public static void main(String[]args)
	{
		int[][]image = {{1,1,0},{1,0,1},{0,0,0}};
		
	}
	public int[][] flipAndInvertImage(int[][] image) 
    {
        
        for(int i=0;i <image.length;i++)
        {
            int[] old = image[i];
            
            int[] newArr = new int[old.length];
            int k=0;
            for(int j=old.length-1;j>=0;j--)
            {
                newArr[k] = old[j];
                k++;
            }
            int[] new2 = new int[newArr.length];
            k=0;
            for(int j=0;j<newArr.length;j++)
            {
                if(newArr[j] ==0)
                {
                    new2[j] =1;
                }
                else
                    new2[j]=0;
            }
            image[i] = new2;
        }
        return image;
    }
}
