package com.striver.day8;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapSack 
{
	public static void main()
	{
		Item i1 = new Item(60, 10);
		Item i2 = new Item(100, 20);
		Item i3 = new Item(120, 30);
		
		Item[] arr = {i1, i2,i3};
		
		System.out.println(new FractionalKnapSack().fractionalKnapsack(50, arr, 3));
	}
	double fractionalKnapsack(int W, Item arr[], int n) 
	{
		double op = 0;
		Arrays.sort(arr, new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				double val1 = (double) o1.value / (double) o1.weight;
				double val2 = (double) o2.value / (double) o2.weight;

				if (val2 > val1) {
					return 1;
				} else if (val1 > val2) {
					return -1;
				} else {
					return 0;
				}

			}
		});

		for (int i = 0; i < arr.length; i++) {
			Item obj = arr[i];

			if (obj.weight <= W) {
				op = op + (double) obj.value;
				W = W - obj.weight;
			} else {
				double val = (double) obj.value / (double) obj.weight * W;
				op = op + val;
				W = 0;
			}
		}

		return op;
	}
}
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
