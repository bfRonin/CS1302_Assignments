package ass5;

import java.util.Stack;

/**
 * Checks if two stacks contain the same characters
 * @author michael
 *
 */
public class StackCheck {
	
	static Stack<Character> aux = new Stack<Character>();

	/**
	 * goes through two stacks and determenines true or false if the stacks are the same
	 * @param a First stack in question
	 * @param b second stack in question
	 * @return boolean false if not the same or true if are
	 */
	public static Boolean areEqual(Stack<Character> a, Stack<Character> b){
		Boolean same = true;
		Boolean notSame = false;
		
		for(int i=0; i<a.size();){
			if(a.peek().equals(b.peek())){
				aux.add(a.pop());
				b.pop();
			}
			else{
				for(int j=0;j<aux.size();){
					b.add(aux.peek());
					a.add(aux.pop());
				}
				return notSame;
			}
		}
		if(b.isEmpty()){
			for(int k=0;k<aux.size();){
				b.add(aux.peek());
				a.add(aux.pop());
			}
			return same;
		}
		else{
			for(int l=0;l<aux.size();){
				b.add(aux.peek());
				a.add(aux.pop());
			}
			return notSame;
		}
	}

	/**
	 * Testing the method
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<Character> a1 = new Stack<Character>();
		Stack<Character> a2 = new Stack<Character>();
		Stack<Character> b1 = new Stack<Character>();
		Stack<Character> b2 = new Stack<Character>();
		Stack<Character> c1 = new Stack<Character>();
		Stack<Character> c2 = new Stack<Character>();
		
		a1.add('a');
		a1.add('b');
		a1.add('c');
		a1.add('d');
		
		a2.add('a');
		a2.add('b');
		a2.add('c');
		a2.add('d');
	
		b1.add('a');
		b1.add('b');
		b1.add('c');
		b1.add('d');
		
		b2.add('a');
		b2.add('b');
		b2.add('e');
		b2.add('d');
		
		c1.add('a');
		c1.add('b');
		c1.add('c');
		c1.add('d');
		
		c2.add('a');
		c2.add('b');
		c2.add('c');
		c2.add('d');
		c2.add('e');
		
		
		if(areEqual(a1,a2)){
			System.out.println("It's Alive!!!");
			System.out.println(a1.toString());
			System.out.println(a2.toString());
		}
		System.out.println();
		if(!areEqual(b1,b2)){
			System.out.println("I can't do that Dave.");
			System.out.println(b1.toString());
			System.out.println(b2.toString());
		}
		System.out.println();
		if(!areEqual(c1,c2)){
			System.out.println("I really can't do that, Dave");
			System.out.println(c1.toString());
			System.out.println(c2.toString());
		}
	}
}
