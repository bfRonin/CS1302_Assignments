package project;

import java.util.*;
public class AlgorithmsDemo 
{
	public static void main(String[] args) 
	{	
		//Create ArrayList filled with Random Integers
		ArrayList<Integer> al = new ArrayList<Integer>();        
        al = RandomArray(100000, 100000);        
        
        //Creating exact copies of the random ArrayList to pass to the three different Sort Methods
        ArrayList<Integer> Insert_al = new ArrayList<Integer>();
        copyArray(Insert_al, al);    
        ArrayList<Integer> Select_al = new ArrayList<Integer>();                
        copyArray(Select_al, al);   
        ArrayList<Integer> Bubble_al = new ArrayList<Integer>();        
        copyArray(Bubble_al, al);       
               
        //Insertion Sort Algorithm and Time utilization
        long insert_sort_startTime = System.currentTimeMillis();            
        insertionSort(Insert_al);        
        long insert_sort_endTime = System.currentTimeMillis();        
        long insert_sort_totalRuntime = (insert_sort_endTime - insert_sort_startTime);
        System.out.println("Total Time Taken for Insertion Sort: " + insert_sort_totalRuntime + " MS"); 
        
        //Selection Sort Algorithm and Time utilization
        long sel_sort_startTime = System.currentTimeMillis();        
        Selection_Sort(Select_al);        
        long sel_sort_endTime = System.currentTimeMillis();        
        long sel_sort_totalRuntime = (sel_sort_endTime - sel_sort_startTime);
        System.out.println("Total Time Taken for Selection Sort: " + sel_sort_totalRuntime + " MS");
        
        //Bubble Sort Algorithm and Time utilization
        long bubble_sort_startTime = System.currentTimeMillis();
        Bubble_Sort(Bubble_al);
        long bubble_sort_endTime = System.currentTimeMillis();        
        long bubble_sort_totalRuntime = (bubble_sort_endTime - bubble_sort_startTime);
        System.out.println("Total Time Taken for Bubble Sort: " + bubble_sort_totalRuntime + " MS\n");
       
        //check which sorting algorithm is the Max, 2nd Max and Min time utilization to sort random array
        Time_Taken_ToSort(insert_sort_totalRuntime, sel_sort_totalRuntime,bubble_sort_totalRuntime);
        
        Random r = new Random();
        int numToSearchFor = r.nextInt(100000); //Creating random int to search for in sorted algorithms
        
        long binSearStart = System.currentTimeMillis();
        binarySearch(Insert_al,numToSearchFor); //Timing and using binary search algorithm
        long binSearEnd = System.currentTimeMillis();
        System.out.println("Binary Search took " + (binSearEnd-binSearStart) + " MS");
        
        long linSearStart = System.currentTimeMillis();
        linearSearch(Bubble_al,numToSearchFor); //Timing and using linear search algorithm
        long linSearEnd = System.currentTimeMillis();
        System.out.println("Linear Search took " + (linSearEnd-linSearStart) + " MS");
    }
    /**
     * Returns an ArrayList filled with random integers
     * @param max_array How many indexes the array wil have
     * @param max_range How large of a range the random integers will be 0-> N
     * @return ArrayList filled with random integers
     */
	public static ArrayList<Integer> RandomArray(int max_array, int max_range)
    {
        ArrayList<Integer> arrayRandom = new ArrayList<Integer>(max_array);
        Random rand = new Random();
        for (int i=0; i<max_array; i++)
        {            
            arrayRandom.add(rand.nextInt(max_range));
        }
        return arrayRandom;
    }
	/**
	 * Insertion sorting algorithm will sort an arrayList
	 * @param Insert_Sort the ArrayList to be sorted
	 */
    public static void insertionSort(ArrayList<Integer> Insert_Sort) 
    {        
        int value;
        int holePos;
        
        for( int k=1; k<Insert_Sort.size(); k++ )
        {
            value = Insert_Sort.get(k);                   
            holePos = k;
            
            while( holePos > 0 && Insert_Sort.get(holePos-1) > value )
            {
                Insert_Sort.set( holePos, Insert_Sort.get(holePos-1) );
                holePos--;
            }           
            
            Insert_Sort.set( holePos, value );
        }

    }
    /**
     * Selection sorting algorithm that will sort an ArrayList
     * @param sel_sort the ArrayLIst to be sorted
     */
    private static void Selection_Sort( ArrayList<Integer> sel_sort )
    {
        for( int k=0; k<sel_sort.size()-1; k++ )
        {
            int minIndex = k;
            for( int j=k+1; j<sel_sort.size(); j++ )
            {
                if( sel_sort.get(j) < sel_sort.get(minIndex) )
                {
                    minIndex = j;
                }
            }         
            
            int temp = sel_sort.get(k);
            sel_sort.set( k, sel_sort.get(minIndex) );
            sel_sort.set( minIndex, temp );
        }
    }
    /**
     * Bubble sorting algorithm that will sort an ArrayList
     * @param list the ArrayList to be sorted
     */
    public static void Bubble_Sort(ArrayList<Integer> list)
    {
         int temp;
            if (list.size()>1) // check if the number of orders is larger than 1
            {
                for (int x=0; x<list.size(); x++) // bubble sort outer loop
                {
                    for (int i=0; i < list.size() - x - 1; i++) {
                        if (list.get(i).compareTo(list.get(i+1)) > 0)
                        {
                            temp = list.get(i);
                            list.set(i,list.get(i+1) );
                            list.set(i+1, temp);
                        }
                    }
                }
            }

    }
    /**
     * Makes perfect copies of the arrayList (Not just a reference)
     * @param copy the ArrayList gaining the copied integers
     * @param array the full ArrayList being copied
     */
    public static void copyArray(ArrayList<Integer> copy, ArrayList<Integer> array)
    {
        for(int i=0;i<array.size();i++)
        {
            copy.add(array.get(i));            
        }
    }
    /**
     * Searches for an integer within a sorted arrayList using a binarySearch algorithm
     * the arraylist MUST BE SORTED for this algorithm to work
     * @param sortedList the SORTED list the be search
     * @param value the integer being searched for
     */
    public static void binarySearch(ArrayList<Integer> sortedList, int value){
        System.out.println("Using Binary Search Algorithm to find "+ value);
        boolean found = false;
        int low = 0;
        int high = sortedList.size()-1;
        int pos =0 ;
        while(low <= high && !found){
            pos = (low+high)/2;
            if(sortedList.get(pos) == value){found=true;}
            else if(sortedList.get(pos)<value){low=pos+1;}
            else {high=pos-1;}
        }
        if(found){System.out.println(value+" found at position "+ pos);}
        else{System.out.println(value+" not found.");}
    }
    /**
     * Searches for a number within an arraylist
     * @param list arrayList being searched through
     * @param value number being searched for
     */
    public static void linearSearch(ArrayList<Integer> list, int value){
        System.out.println("Using Linear Search Algorithm to find "+ value);
        boolean found = false;
        int pos = 0;
        while(!found && pos<list.size()){
            if(value==list.get(pos)){found=true;}
            else{pos++;}
        }
        if(found==true){System.out.println(value+" found at position "+ pos);}
        else{System.out.println(value+" not found!");}
    }
    /**
     * Comparison between total time taken for three sorting algorithms
     * @param insert long number of total time taken by inserting sort
     * @param select long number of total time taken by selection sort
     * @param bubble long number of total time taken by bubble sort
     */
    public static void Time_Taken_ToSort(Long insert, Long select, Long bubble)
    {    	
    	 Long a = insert, b =select, c= bubble;     	 
    	 
         if (a.equals(b) && b.equals(c)) // Will work when Three equal Long #s pass thru the function
         {
         	System.out.println("Total Time taken for all three[Insertion,Selection and Bubble] Sorting Algorithms: " + a + " MS\n");
         }
         //Will work when two equal Long #s and a different # pass thru to the function
         else if (a.equals(b) && a > c) 
         {
           	 System.out.println ("The Maximum Time: " + a +" MS has taken by Insertion and Selection Sorts");
        	 System.out.println ("The Minimum Time: " + c +" MS has taken by Bubble Sort\n");
         }
         else if (b.equals(c) && a < c)
         {
        	 System.out.println ("The Maximum Time: " + b +" MS has taken by Selection and Bubble Sorts");
        	 System.out.println ("The Minimum Time: " + a +" MS has taken by Insertion Sorts\n");
         }
         else if (a.equals(b) && a < c)
         {
        	 System.out.println ("The Maximum Time: " + c +" MS has taken by Bubble Sorts");
        	 System.out.println ("The Minimum Time: " + a +" MS has taken by Selection and Insertion Sorts\n");
         }
         else if (b.equals(c) && a > c)
         {
        	 System.out.println ("The Maximum Time: " + a +" MS has taken by Bubble Sorts");
        	 System.out.println ("The Minimum Time: " + c +" MS has taken by Selection and Insertion Sorts\n");
         }
         else if (a.equals(c) && a < b)
         {
        	 System.out.println ("The Maximum Time: " + b +" MS has taken by Selection Sorts");
        	 System.out.println ("The Minimum Time: " + a +" MS has taken by Insertion and Bubble Sorts\n");
         }
         else if (a.equals(c) && a > b)
         {
        	 System.out.println ("The Maximum Time: " + a +" MS has taken by Insertion and Bubble Sorts");
        	 System.out.println ("The Minimum Time: " + b +" MS has taken by Selection Sorts\n");
         }
         else //Will work when Three Different Long #s pass thru the function
         {        	 
        	 if (a.compareTo(b) == -1  && b.compareTo(c)== -1 && a.compareTo(c) == -1)
        	 {
        		 System.out.println ("The Maximum Time: " + c +" MS has taken by Bubble Sort");
        		 System.out.println ("The Second Maximum Time: " + b +" MS has taken by Selection Sort");
        		 System.out.println ("The Minimum Time: " + a +" MS has taken by Insertion Sort\n"); 
        	 }
        	 else if( a.compareTo(b) == 1  && b.compareTo(c)==1 && a.compareTo(c) == 1)
        	 {
        		 System.out.println ("The Maximum Time: " + a +" MS has taken by Insertion Sort");
        		 System.out.println ("The Second Maximum Time: " + b +" MS has taken by Selection Sort");
        		 System.out.println ("The Minimum Time: " + c +" MS has taken by Bubble Sort\n");
        	 }
        	 else if(a.compareTo(b)==-1 && b.compareTo(c)==1 && a.compareTo(c)==-1)
        	 {
        		 System.out.println ("The Maximum Time: " + b +" MS has taken by Selection Sort");
        		 System.out.println ("The Second Maximum Time: " + c +" MS has taken by Bubble Sort");
        		 System.out.println ("The Minimum Time: " + a +" MS has taken by Insertion Sort\n");
        	 }
        	 else if(a.compareTo(b)==1 && b.compareTo(c)==-1 && a.compareTo(c)==-1)
        	 {
        		 System.out.println ("The Maximum Time: " + c +" MS has taken by Bubble Sort");
        		 System.out.println ("The Second Maximum Time: " + a +" MS has taken by Insetion Sort");
        		 System.out.println ("The Minimum Time: " + b +" MS has taken by Selection Sort\n");
        	 }
        	 else if(a.compareTo(b)==-1 && b.compareTo(c)==1 && a.compareTo(c)==1)
        	 {
        		 System.out.println ("The Maximum Time: " + b +" MS has taken by Selection Sort");
        		 System.out.println ("The Second Maximum Time: " + a +" MS has taken by Insertion Sort");
        		 System.out.println ("The Minimum Time: " + c +" MS has taken by Bubble Sort\n");
        	 }
        	 else
        	 {
        		 System.out.println ("The Maximum Time: " + a +" MS has taken by Insertion Sort");
        		 System.out.println ("The Second Maximum Time: " + c +" MS has taken by bubble Sort");
        		 System.out.println ("The Minimum Time: " + b +" MS has taken by Selection Sort\n");
        	 }
         }
         
    }
}