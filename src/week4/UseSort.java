package week4;

public class UseSort {
	
	public static void main(String[] args) {
		Sort a = new Sort();
		int[] unSorted = {87,53,4,9,5,17,46,0,3,2,7,12,10};
		for (int i=0; i<unSorted.length; i++)
		{
			System.out.print(unSorted[i] + " ");
		}
		System.out.println();
		int[] sorted = a.sortItUp(unSorted);
		for (int i=0; i<sorted.length; i++)
		{
			System.out.print(sorted[i]+" ");
		}
	}
}
