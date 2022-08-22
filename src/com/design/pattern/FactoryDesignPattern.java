package com.design.pattern;

public class FactoryDesignPattern 
{

	 public Plan getPlan(String planType){  
         if(planType == null){  
          return null;  
         }  
       if(planType.equalsIgnoreCase("DOMESTICPLAN")) {  
              return new DomesticPlan();  
            }   
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){  
             return new CommercialPlan();  
         }

   return null;  
}  
	    public static void main(String args[])
	    {
	    	new GenerateBill().returnOutput(100,"DOMESTICPLAN");
	    }
	    
}
abstract class Plan
{  
    protected double rate;  
    abstract void getRate();  

    public void calculateBill(int units){  
         System.out.println(units*rate);  
     }  
}

class DomesticPlan extends Plan {
	public void getRate() {
		rate = 3.50;
	}
}

class CommercialPlan extends Plan {

	public void getRate() {
		rate = 7.50;
	}
}

class GenerateBill{  

    public void returnOutput(int units, String planName)
    {
    	 FactoryDesignPattern planFactory = new FactoryDesignPattern();  
         
      
         
     
         Plan p = planFactory.getPlan(planName);  
         //call getRate() method and calculateBill()method of DomesticPaln.  
     
          System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
              p.getRate();  
              p.calculateBill(units);  
        }
    
}