package com.practice;

public class Manager {
	
	private String dept;
	private String firstName;
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Override
	public String toString() {
		return "Manager [dept=" + dept + ", firstName=" + firstName + "]";
	}
	
	public static void main(String[] args)
	{
			
		String time = "00:??";
	        String[]split = time.split(":");
	        
	        String hours = split[0];
	        String minutes = split[1];
	        
	        if(hours.charAt(0) == '?')
	        {
	            int i = hours.charAt(1) - '0';
	            if(i<5)
	            {
	                hours = hours.replace('?','2');
	            }
	            else
	                hours = hours.replace('?','1');
	        }
	         if(hours.charAt(1) == '?');
	        {
	            int i = hours.charAt(0) - '0';
	            if(i==2)
	            {
	                hours = hours.replace('?','3');
	            }
	            else
	                hours = hours.replace('?','9');
	        }
	        if(minutes.charAt(0) == '?')
	        {
	            
	            minutes = minutes.replaceFirst('?','5');
	        }
	         if(minutes.charAt(1) == '?')
	        {
	            minutes = minutes.replace('?','9');
	        }
	        
	        String s1 = hours+":"+ minutes;
	        System.out.println(s1);
	    }
	}
	
	


