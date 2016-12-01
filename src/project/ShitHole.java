package project;

import java.util.*;


public class ShitHole {
	
		public static void main(String[] args) 
		{	
			ArrayList<Integer> al = new ArrayList<Integer>();		
			al = RandomArray(100);		
			
			ArrayList<Integer> Insert_al = new ArrayList<Integer>();
			copyArray(Insert_al, al);	
			
			ArrayList<Integer> Select_al = new ArrayList<Integer>();				
			copyArray(Select_al, al);
					
			ArrayList<Integer> Bubble_al = new ArrayList<Integer>();		
			copyArray(Bubble_al, al);
			
			System.out.println(al);
			System.out.println(Insert_al);
			System.out.println(Select_al);
							
			/*long insert_sort_startTime = System.currentTimeMillis();			
			insertionSort(Insert_al);		
			long insert_sort_endTime = System.currentTimeMillis();		
			long insert_sort_totalRuntime = (insert_sort_endTime - insert_sort_startTime);
			System.out.println("Total Time Taken for Insertion Sort: " + insert_sort_totalRuntime + " MS");		
			
			long sel_sort_startTime = System.currentTimeMillis();		
			Selection_Sort(Select_al);		
			long sel_sort_endTime = System.currentTimeMillis();		
			long sel_sort_totalRuntime = (sel_sort_endTime - sel_sort_startTime);
			System.out.println("Total Time Taken for Selection Sort: " + sel_sort_totalRuntime + " MS");
			
			long bubble_sort_startTime = System.currentTimeMillis();
			Bubble_Sort(Bubble_al);
			long bubble_sort_endTime = System.currentTimeMillis();		
			long bubble_sort_totalRuntime = (bubble_sort_endTime - bubble_sort_startTime);
			System.out.println("Total Time Taken for Bubble Sort: " + bubble_sort_totalRuntime + " MS");
			
		*/}
		public static ArrayList<Integer> RandomArray(int max_array)
		{
			ArrayList<Integer> arrayRandom = new ArrayList<Integer>(max_array);
	        Random rand = new Random();
	        for (int i=0; i<max_array; i++)
	        {            
	        	arrayRandom.add(rand.nextInt(max_array));
	        }
	        return arrayRandom;
		}	
		/*public static void insertionSort(ArrayList<Integer> Insert_Sort) 
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

		}	*/
		public static void copyArray(ArrayList<Integer> copy, ArrayList<Integer> array)
		{
		    for(int i=0;i<array.size();i++)
		    {
		        copy.add(array.get(i));	        
		    }
		}
			
	}
