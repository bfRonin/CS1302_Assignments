package ass4;

/**
The sort method of this class sorts an array, using the merge 
sort algorithm.
*/
public class MergeSorter
{
	private static int count;
/**
   Sorts an array, using merge sort.
   @param a the array to sort
*/
public static void sort(int[] a)
{  
   if (a.length <= 1) { return; }
   int[] first = new int[a.length / 2];
   int[] second = new int[a.length - first.length];
   // Copy the first half of a into first, the second half into second
   for (int i = 0; i < first.length; i++) 
   { 
      first[i] = a[i]; 
   }
   for (int i = 0; i < second.length; i++) 
   { 
      second[i] = a[first.length + i]; 
   }
   sort(first);
   sort(second);
   merge(first, second, a);
}

/**
   Merges two sorted arrays into an array
   @param first the first sorted array
   @param second the second sorted array
   @param a the array into which to merge first and second
*/
private static void merge(int[] first, int[] second, int[] a)
{  
   int iFirst = 0; // Next element to consider in the first array
   int iSecond = 0; // Next element to consider in the second array
   int j = 0; // Next open position in a

   // As long as neither iFirst nor iSecond is past the end, move
   // the smaller element into a
   while (iFirst < first.length && iSecond < second.length)
   {  
	   count++;
	   if (first[iFirst] < second[iSecond])
      {  
         a[j] = first[iFirst];
         iFirst++;
      }
      else
      {  
         a[j] = second[iSecond];
         iSecond++;
      }
      j++;
   }

   // Note that only one of the two loops below copies entries
   // Copy any remaining entries of the first array
   while (iFirst < first.length) 
   { 
      a[j] = first[iFirst]; 
      iFirst++; j++;
   }
   // Copy any remaining entries of the second half
   while (iSecond < second.length) 
   { 
      a[j] = second[iSecond]; 
      iSecond++; j++;
   }
}

public static void resetCount(){
	count=0;
}
public static int getCount(){
	return count;
}
}







/*
public class MergeSorter {
	
	private static int count;
	private int[]a;	
	private int[]b;
	
	public MergeSorter(int[] anArray){
		a=anArray;
		b=new int[a.length];
	}
	
	private static void merge(int[] first, int[] second, int[] fin)
	   {  
	      int iFirst = 0; // Next element to consider in the first array
	      int iSecond = 0; // Next element to consider in the second array
	      int j = 0; // Next open position in a

	      // As long as neither iFirst nor iSecond is past the end, move
	      // the smaller element into a
	      while (iFirst < first.length && iSecond < second.length)
	      {  
	         count++;
	    	 if (first[iFirst] < second[iSecond])
	         {  
	            fin[j] = first[iFirst];
	            iFirst++;
	         }
	         else
	         {  
	            fin[j] = second[iSecond];
	            iSecond++;
	         }
	         j++;
	      }

	      // Note that only one of the two loops below copies entries
	      // Copy any remaining entries of the first array
	      while (iFirst < first.length) 
	      { 
	         fin[j] = first[iFirst]; 
	         iFirst++; j++;
	      }
	      // Copy any remaining entries of the second half
	      while (iSecond < second.length) 
	      { 
	         fin[j] = second[iSecond]; 
	         iSecond++; j++;
	      }
	   }

	public static int getCounter(){
		return count;
	}
	
	public static void resetCounter(){
		count=0;
	}
	public int[] sort()
    {  
       if (a.length <= 1) return a;
       int[] first = new int[a.length / 2];
       int[] second = new int[a.length - first.length];
       // Copy the first half of a into first, the second half into second
       for (int i = 0; i < first.length; i++) { first[i] = a[i]; }
       for (int i = 0; i < second.length; i++) 
       { 
          second[i] = a[first.length + i]; 
       }
       MergeSorter firstSorter = new MergeSorter(first);
       MergeSorter secondSorter = new MergeSorter(second);
       firstSorter.sort();
       secondSorter.sort(); 
       merge(first, second,b);
       return b;
    }
}
*/