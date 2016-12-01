package ass3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class for all of Assignment 3's Array List problems
 * 
 * @author Michael Stamm
 * @version 1.3
 * @since 2016-10-01
 */

public class ArrayListPractice {

	/**
	 * Problem 1 : Prints the number of indexes between the two farthest set of 0s in an arraylist of integers 
	 * @param nums Array List of random integers
	 * @return Number of indexes between two farthest set of 0s
	 */
	public static int rangeBetweenZeroes(ArrayList<Integer> nums){
		int range;
		int indexHigh=-1; //Initialized at -1 to have a guard number to signify "not found"
		int indexLow=-1; 
		
		// two methods used to find first and last occurrences of 0 from ArrayList class
		indexLow=nums.indexOf(0);
		indexHigh=nums.lastIndexOf(0);
		
		// set of if else to determine range
		if(indexHigh==-1 || indexLow==-1){range=1;}
		if(indexHigh==-1 && indexLow==-1){range=0;}
		else{range = indexHigh - indexLow + 1;}
		
		return range;
	}
	
	/**
	 * Problem 2 : Takes an Array List of strings and two words, uses the first letter in the two words
	 * to create a range of first letters that will be deleted if within range between the two letters. 
	 * @param daString The array list of strings to be manipulated
	 * @param begWord	a first (in the alphabet) range creating String
	 * @param endWord	a second (in the alphabet) range creating String
	 * @return a trimmed arrayList of Strings
	 */
	public static ArrayList<String> removeInRange(ArrayList<String> daString, String begWord, String endWord){
		
		char begLet = begWord.charAt(0);//creating primitive units of the first and
		char endLet = endWord.charAt(0);//last letter allowed in the string
		char tempLet;// temporary char holder for the strings in daString
		
		//Loop to run through the list if the character lies outside the range move to next string
		//else remove the string that the character belongs to
		for (int i=0; i<daString.size();){ 
			tempLet= daString.get(i).charAt(0); 
			if(tempLet<=begLet || tempLet>=endLet){i++;}
			else{daString.remove(i);}
		}
		return daString;
	}
	
	//Problem 3
	
	/**
	 * Problem 3 : takes an integer and repeats the strings in the array list that integer number of times
	 * @param daString an array list of strings 
	 * @param k integer of times the strings in the list will be repeated
	 * @return finished array list of strings repeated
	 */
	public static ArrayList<String> stutter(ArrayList<String> daString, int k){
		
		// creates a new array list to repeat the strings into from the original list 
		ArrayList<String> daNewString = new ArrayList<String>();
		if (k<=0){daString.clear();} 
		else{
			//double loop inner loop repeats word at index for k times while index works through list
			int stop = daString.size();
			for(int i=0; i<stop; i++){	
				for (int j=0; j<k ; j++){
					daNewString.add(daString.get(i));
				}
			}
		}
		return daNewString;
	}
	
	//Problem 4
	
	/**
	 * Problem 4 : with an array list of strings this method will compare two words at a time and
	 * remove the shorter string until the end of the list
	 * @param daString the array list of strings to be manipulated
	 * @return the string with the shorter word in pairs removed
	 */
	public static ArrayList<String> removeShorterStrings(ArrayList<String> daString){
		int stop = daString.size();
		for(int i=0; i < stop; i++){
			if(i+1<daString.size()){ //ensures that the algorithm stays within bounds of the list
				String word1=daString.get(i); //creating string instances to directly compare
				String word2=daString.get(i+1); //the pair of words and
				if (word1.length() > word2.length()){daString.remove(i+1);}//remove the shorter
				if (word2.length() >= word1.length()){daString.remove(i);}
			}
		}
		return daString;
	}
	
	//Problem 5
	
	/**
	 * Problem 5 : takes an array list of strings and marks which strings have 4 characters with 
	 * 4 astricks 
	 * @param daString the array list of strings being manipulated 
	 * @return the array list with the strings that have 4 characters marked with a string of four asticks
	 */
	public static ArrayList<String> markLengthFour(ArrayList<String> daString){
		
		for(int i=0;i<daString.size();i++){
			String daWord = daString.get(i); //the word in the string to be checked
			if (daWord.length()==4){ 
				daString.add(i, "****");
				i++;
			}
		}
		return daString;
	}
	
	//Problem 6
	
	/**
	 * Problem 6 : takes an array list of integers and will reverse every set of three integers
	 * or swap the first and last integers for every 3 integers
	 * @param daInts the list of integers being manipulated 
	 * @return the reversed numbers
	 */
	public static ArrayList<Integer> reverse3(ArrayList<Integer> daInts){
	
		for(int i=0; i<daInts.size();i=i+3){ //taking the list in 3s
			if (i+2 < daInts.size()){ //ensures the algorithm is effecting 3 numbers in the list
				daInts.add(i, daInts.get(i+2)); //adding the third int into the first spot
				daInts.remove(i+3); //removing the third int
				daInts.add(i+3, daInts.get(i+1)); //adding the first int into the third spot
				daInts.remove(i+1);//removing the first int from the list
			}
		}
		return daInts;
	}
	
	
	/**
	 * Main program meant to test problems 1-6
	 * Initializes and completes each problem with first the given example and then a
	 * "curve ball" meant to test the method
	 * 
	 */
	public static void main(String[] args) {
		
		ArrayList<Integer> prob1 = new ArrayList<Integer>();
		prob1.addAll(Arrays.asList(7,2,0,0,4,0,9,0,5,4,8));
		System.out.println("Problem 1 example:\n" + prob1.toString());
		System.out.println(rangeBetweenZeroes(prob1)+"\n\n");
		
		ArrayList<Integer> prob1a = new ArrayList<Integer>();
		prob1a.addAll(Arrays.asList(7,2,9,0,5,4,8,7,9,2,3,1));
		System.out.println("Problem 1\n" + prob1a.toString());
		System.out.println(rangeBetweenZeroes(prob1a)+"\n\n");
		
		ArrayList<String> prob2 = new ArrayList<String>();
		prob2.addAll(Arrays.asList("to","be","or","not","to","be","that","is","the","question"));
		System.out.println("Problem 2 example\n"+ prob2.toString());
		System.out.println("free & rich");
		System.out.println(removeInRange(prob2,"free","rich")+"\n\n");
		
		ArrayList<String> prob2a = new ArrayList<String>();
		prob2a.addAll(Arrays.asList("this","is","a","unique","string","to","be","maniuplated","zebra","lion"));
		System.out.println("Problem 2\n"+ prob2a.toString());
		System.out.println("king & queen");
		System.out.println(removeInRange(prob2a,"king","queen")+"\n\n");
		
		ArrayList<String> prob3 = new ArrayList<String>();
		prob3.addAll(Arrays.asList("how","are","you"));
		System.out.println("Problem 3 example\n" + prob3.toString());
		System.out.println("repeat 4");
		System.out.println(stutter(prob3,4)+"\n\n");
		
		ArrayList<String> prob3a = new ArrayList<String>();
		prob3a.addAll(Arrays.asList("what","is","up"));
		System.out.println("Problem 3\n" + prob3a.toString());
		System.out.println("repeat 2");
		System.out.println(stutter(prob3a,2)+"\n\n");

		ArrayList<String> prob4 = new ArrayList<String>();
		prob4.addAll(Arrays.asList("four","score","and","seven","years","ago","our"));
		System.out.println("Porblem 4 example\n"+ prob4.toString());
		System.out.println(removeShorterStrings(prob4)+"\n\n");
		
		ArrayList<String> prob4a = new ArrayList<String>();
		prob4a.addAll(Arrays.asList("we","are","the","last","of","the","romantics"));
		System.out.println("Porblem 4\n"+ prob4a.toString());
		System.out.println(removeShorterStrings(prob4a)+"\n\n");
		
		ArrayList<String> prob5 = new ArrayList<String>();
		prob5.addAll(Arrays.asList("this","is","lots","of","fun","for","java","coders"));
		System.out.println("Problem 5 example\n"+prob5.toString());
		System.out.println(markLengthFour(prob5)+"\n\n");
		
		ArrayList<String> prob5a = new ArrayList<String>();
		prob5a.addAll(Arrays.asList("this","is","even","more","fun","for","joggers","with","apetites"));
		System.out.println("Problem 5\n"+prob5a.toString());
		System.out.println(markLengthFour(prob5a)+"\n\n");
		
		ArrayList<Integer> prob6 = new ArrayList<Integer>();
		prob6.addAll(Arrays.asList(3,8,19,42,7,26,19,-8));
		System.out.println("Problem 6 example\n"+ prob6.toString());
		System.out.println(reverse3(prob6)+"\n\n");
		
		ArrayList<Integer> prob6a = new ArrayList<Integer>();
		prob6a.addAll(Arrays.asList(2,5,10,5,7,3,8,9,3,1,0,-5,-3,6,7));
		System.out.println("Problem 6\n"+ prob6a.toString());
		System.out.println(reverse3(prob6a));
		
	}
}
