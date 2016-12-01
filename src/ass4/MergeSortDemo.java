package ass4;

	/**
	   This program demonstrates the merge sort algorithm by
	   sorting an array that is filled with random numbers.
	*/
	public class MergeSortDemo
	{  
	   public static void main(String[] args)
	   {  
	      int[] a = ArrayUtil.randomIntArray(10000, 10000);
	      MergeSorter.resetCount();
	      MergeSorter.sort(a);
	      System.out.println("Array size: 10000; comparisons: " + MergeSorter.getCount());
	      
	      int[] b = ArrayUtil.randomIntArray(20000, 20000);
	      MergeSorter.resetCount();
	      MergeSorter.sort(b);
	      System.out.println("Array size: 20000; comparisons: " + MergeSorter.getCount());
	      
	      int[] c = ArrayUtil.randomIntArray(30000, 30000);
	      MergeSorter.resetCount();
	      MergeSorter.sort(c);
	      System.out.println("Array size: 30000; comparisons: " + MergeSorter.getCount());
	      
	      int[] d = ArrayUtil.randomIntArray(40000, 40000);
	      MergeSorter.resetCount();
	      MergeSorter.sort(d);
	      System.out.println("Array size: 40000; comparisons: " + MergeSorter.getCount());
	      
	      int[] e = ArrayUtil.randomIntArray(50000, 50000);
	      MergeSorter.resetCount();
	      MergeSorter.sort(e);
	      System.out.println("Array size: 50000; comparisons: " + MergeSorter.getCount());
	      
	      int[] f = ArrayUtil.randomIntArray(60000, 60000);
	      MergeSorter.resetCount();
	      MergeSorter.sort(f);
	      System.out.println("Array size: 60000; comparisons: " + MergeSorter.getCount());
	      
	      int[] g = ArrayUtil.randomIntArray(70000, 70000);
	      MergeSorter.resetCount();
	      MergeSorter.sort(g);
	      System.out.println("Array size: 70000; comparisons: " + MergeSorter.getCount());
	      
	      int[] h = ArrayUtil.randomIntArray(80000, 80000);
	      MergeSorter.resetCount();
	      MergeSorter.sort(h);
	      System.out.println("Array size: 80000; comparisons: " + MergeSorter.getCount());
	      
	      int[] i = ArrayUtil.randomIntArray(90000, 90000);
	      MergeSorter.resetCount();
	      MergeSorter.sort(i);
	      System.out.println("Array size: 90000; comparisons: " + MergeSorter.getCount());
	   }
	}


