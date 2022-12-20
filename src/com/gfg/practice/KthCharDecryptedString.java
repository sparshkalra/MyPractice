package com.gfg.practice;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import com.practice.LinkedListImplementationTest;
import com.practice.LinkedListImplementationTest.Node;

public class KthCharDecryptedString {

	public static void main(String[] args) {
		
		
		//System.out.println(kThCharaterOfDecryptedString("a2b3cd3", (long) 8));

		/*
		 * System.out.println(kThCharaterOfDecryptedString("dajidas988ksajlkdn908",
		 * (long) 9000)); System.out.println(kThCharaterOfDecryptedString(
		 * "a2a3a4a5a6a7a8a9a10a11a12a13", (long) 37));
		 * System.out.println(kThCharaterOfDecryptedString("ab12c3", (long) 20));
		 */
		

		Node first = new Node(1);
		first.next = new Node(2);
		first.next.next = new Node(3);
		first.next.next.next = new Node(4);
		first.next.next.next.next = new Node(5);
		
		Node op = lastAppearance(first);
		
		LinkedListImplementationTest.printLinkedList(op);
	}
	
	public static char kThCharaterOfDecryptedString(String s, Long k) 
    {
        String op = "";
        int val = 0;
        for(int i=0;i<s.length();i++)
        {
        	String print = "";
        	if(Character.isAlphabetic(s.charAt(i)))
        	{
        		while(Character.isAlphabetic(s.charAt(i)))
                {
        			print = print +s.charAt(i);
                    i++;
                }
        	}
            if(Character.isDigit(s.charAt(i)))
            {
                String num = "";
                while(i< s.length() && Character.isDigit(s.charAt(i)))
                {
                    num = num +s.charAt(i);
                    i++;
                }
                i--;
                int number = Integer.parseInt(num);
                if(val+ number*print.length() > k)
                {
                	if(print.length() == 1)
                	{
                		return print.charAt(0);
                	}
                	int diff = (int) (val+ number*print.length() - k);
                	
                	int div = diff%print.length();
                	if(div > 0)
                	{
                		return print.charAt(div-1);
                	}
                	return print.charAt(div+1);
                }
                else
                {
                	val = val+ number*print.length();
                }
                
            }
        }
        return 'a';
    }	
	
	public static Node lastAppearance(Node head) {
		// Write your code here
        Set<Integer> hs = new LinkedHashSet<Integer>();
        
        while(head!=null)
        {
            if(hs.contains(head.data))
            {
                hs.remove(head.data);
            }
            hs.add(head.data);
            head = head.next;
        }
        Iterator<Integer> it = hs.iterator();
        Node first = new Node(hs.iterator().next());
        Node backup = first;
        it.next();
        while(it.hasNext())
		{

			first.next = new Node(it.next());
			first = first.next;
		}
        return backup;
	}

}
