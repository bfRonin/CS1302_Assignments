package assignment5;

import java.util.Scanner;
import java.util.Stack;

/**
 * Will check if the grouping symbols in a mathematical expression are correctly matched
 * @author michael
 */
public class ParenthesisCheck {

	/**
	 * Will print whether the grouping symbols in the expression are correct
	 * @param inputExpression The mathematical expression to be evaluated
	 */
	public static void doGroupingsMatch(String inputExpression){
		Stack<Character> groupSymbol = new Stack<Character>();
		Boolean done = false;
		String matching = "Grouping Symbols don't match";
		while(!done){
			for (int i=0; i<inputExpression.length();i++){ //set a loop to only look for grouping symbols
				char temp = inputExpression.charAt(i);
				if(temp=='('||temp=='[' || temp =='{'){
					groupSymbol.push(inputExpression.charAt(i));
				}
				if(temp==')'){
					if(groupSymbol.peek()=='('){groupSymbol.pop();}
					else{done=true;}
				}
				if(temp=='}'){
					if(groupSymbol.peek()=='{'){groupSymbol.pop();}
					else{done=true;}
				}
				if(temp==']'){
					if(groupSymbol.peek()=='['){groupSymbol.pop();}
					else{done=true;}
				}
			}
			if(groupSymbol.isEmpty()){matching="Grouping symbols match!";}
			done=true;
		}
		System.out.println(matching);
	} 
	
	/**
	 * Testing the method
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an expression:");
		String exp = in.nextLine();
		doGroupingsMatch(exp);
		
		exp=in.nextLine();
		doGroupingsMatch(exp);
		in.close();
		
	}
}


