package com.practice;

public class EnergyAndExperience {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int initialEnergy = 5, initialExperience = 3; 
		int[] energy = {1,4,3,2}, experience = {2,6,3,1};
		int[] energy1 = {1,4}, experience1 = {2,5};
		int[] energy2 ={1,1,1,1}, experience2 = {1,1,1,50};
		
		//4 + 48
		//System.out.println(minNumberOfHours(initialEnergy, initialExperience, energy, experience));

//		System.out.println(minNumberOfHours(initialEnergy, initialExperience, energy1, experience1));

		System.out.println(minNumberOfHours(1, 1, energy2, experience2));
		System.out.println(minNumberOfHours2(1, 1, energy2, experience2));
		
	}
	
	public static int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) 
    {
        int op =0;

        for(int i: energy)
        {
        	initialEnergy = initialEnergy - i;      
        }
        if(initialEnergy <= 0)
        {
        	op = op - initialEnergy +1;
        }
        System.out.println(op);
        for(int i: experience)
        {
            if(initialExperience > i)
            {
                initialExperience = initialExperience + i;
            }
            else
            {
                int diff = i - initialExperience;
                initialExperience = initialExperience + i+1;
                op = op+ diff+1;
            }
        }
        return op;

    }
	public static int minNumberOfHours2(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int n = energy.length;
        int sum = 0;
        int res = 0;
		//the energy needed is the total sum 
        for (int i : energy) {
            sum += i;
        }
        res += sum - initialEnergy >= 0 ? sum - initialEnergy + 1: 0;
        // if curExp < opponents‘ exp, we need to study to earn more
        for (int i : experience) {
            if (initialExperience <= i) {
                res += i - initialExperience + 1;
                initialExperience = i + 1;
            }
            initialExperience += i;
        }
        return res;
    }

}
