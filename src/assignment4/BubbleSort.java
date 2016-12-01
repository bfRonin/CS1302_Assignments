package assignment4;

import java.util.Random;

public class BubbleSort {
	
	public static void Bubble(int[] list)
    {
         int temp;
            if (list.length>1) // check if the number of orders is larger than 1
            {
                for (int x=0; x<list.length; x++) // bubble sort outer loop
                {
                    for (int i=0; i < list.length - x - 1; i++) {
                        if (list[i]>list[i+1])
                        {
                            temp = list[i];
                            list[i]=list[i+1];
                            list[i+1]=temp;
                            
                        }
                    }
                }
            }
    }
	
	public static int[] RandomArray(int maxArray, int maxRange)
    {
        int[] arrayRandom = new int[maxArray];
        Random rand = new Random();
        for (int i=0; i<maxArray; i++)
        {            
            arrayRandom[i]=rand.nextInt(maxRange);
        }
        return arrayRandom;
    }
	public static void main(String[] args) {
		int[] list = RandomArray(10,10);
		for(int i=0;i<list.length;i++){System.out.print(" "+list[i]);}
		Bubble(list);
		System.out.println();
		for(int i=0;i<list.length;i++){System.out.print(" "+list[i]);}
	}
}
