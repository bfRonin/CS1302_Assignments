package ass2;

public class Poem {
	
	String poemName;
	int numOfLines;
	
	public Poem(){
		
	}
	public Poem(String name, int lineNum){
		poemName = name;
		numOfLines = lineNum;
	}
	
	public String getName(){
		return poemName;
	}
	public int getLines(){
		return numOfLines;
	}

}
