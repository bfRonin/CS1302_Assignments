package ass5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Will check if a string is a palindrom or not
 * @author michael
 *
 */
public class PalindromeTest {
	
	public static Stack<Character> daStack = new Stack<Character>();
	public static Queue<Character> daQue = new LinkedList<Character>();
	public static String daString;
	
	/**
	 * Sets the string to check for palindrome
	 * @param string to be checked
	 */
	public PalindromeTest(String a){
		daString=a;
	}
	
	/**
	 * places the string into a stack and que (used by palinCheck)
	 */
	public static void prepPalinCheck(){
		System.out.println(daString);
		String lowerString = daString.toLowerCase();
		for(int i = 0; i<lowerString.length();i++){
			if (Character.isDigit(lowerString.charAt(i)) || Character.isLetter(lowerString.charAt(i))){
				daStack.add(lowerString.charAt(i));
				daQue.add(lowerString.charAt(i));
			}
		}
	}
	
	/**
	 * Checks string for palindromeness
	 * @return String signifying whether the string is a palindrome or not
	 */
	public static String palinCheck(){
		char stackTemp;
		char queTemp;
		String isPali = "It's a Palindrome!";
		String notPali = "It's not a Palindrome... :(";
		
		prepPalinCheck();
		
		for(int i=0; i<daStack.size();){
			stackTemp=daStack.pop();
			queTemp=daQue.remove();
			if(stackTemp!=queTemp){
				daStack.clear();
				daQue.clear();
				return(notPali);
			}
		}
		return isPali;
	}
	/**
	 * Runs through series of tests of class and method.
	 * @param args
	 */
	public static void main(String[] args) {
		daString="RaceCar";
		System.out.println(palinCheck());
		daString="stuff";
		System.out.println(palinCheck());
		daString="Chicken Soup";
		System.out.println(palinCheck());
		daString="no x in Nixon";
		System.out.println(palinCheck());
		daString="12321";
		System.out.println(palinCheck());
		daString="A man, a plan, a canal, Panama!";
		System.out.println(palinCheck());
	}
}
