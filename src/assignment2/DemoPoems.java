package assignment2;

public class DemoPoems {
	
	public static void main(String[] args) {
		
		Poem p1 = new Poem("Romeo & Juliet", 356);
		Couplet p2 = new Couplet("Hero");
		Limerick p3 = new Limerick("Hickory Dickory Dock");
		Haiku p4 = new Haiku("Basho");
		
		System.out.println("The Poem \"" + p1.getName() + "\" has " + p1.getLines() + " lines.");
		System.out.println("The Couplet \"" + p2.getName() + "\" has " + p2.getLines() + " lines.");
		System.out.println("The Limerick \"" + p3.getName() + "\" has " + p3.getLines() + " lines.");
		System.out.println("The Haiku \"" + p4.getName() + "\" has " + p4.getLines() + " lines.");

		
		
	}

}
