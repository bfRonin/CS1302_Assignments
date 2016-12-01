package assignment5;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Duplicates a stack
 * @author michael
 *
 */
public class StackDup {

	/**
	 * 
	 * @param daStack Stack to be duplicated
	 * @return another stack filled with the same characters
	 */
	public static Stack<Character> dupStack(Stack<Character> daStack){
		Stack<Character> newStack = new Stack<Character>();
		ArrayList<Character> helpList = new ArrayList<Character>();
		for(int i=0;i<daStack.size();){
			helpList.add(daStack.pop());
		}
		for(int i=helpList.size()-1;i>=0;i--){
			newStack.push(helpList.get(i));
			daStack.push(helpList.get(i));
		}
		return newStack;
	}
	
	/**
	 * Test the method
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<Character> a = new Stack<Character>();
		a.push('a');
		a.push('b');
		a.push('c');
		a.push('d');
		a.push('e');
		
		System.out.println(a.toString());
		System.out.println(dupStack(a).toString());
		System.out.println(a.toString());
	}
}
