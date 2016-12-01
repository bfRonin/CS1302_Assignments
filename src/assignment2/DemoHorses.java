package assignment2;

public class DemoHorses {

	public static void main(String[] args) {
	
	Horse horse1 = new Horse();
	RaceHorse horse2 = new RaceHorse();
	
	horse1.setName("Haberdash");
	horse1.setColor("brown");
	horse1.setBirthYear("Jan 23 1987");
	
	horse2.setName("SeaBiscuit");
	horse2.setColor("black");
	horse2.setBirthYear("Jun 11 1993");
	horse2.setNumOfRaces(174);
	
	System.out.println(horse1.getName()+" is a "+ horse1.getColor() + " horse born on " 
	+ horse1.getBirthYear() + ".");
	System.out.println(horse2.getName()+" is a "+ horse2.getColor() + " horse born on " 
	+ horse2.getBirthYear() + ". She has had " + horse2.getNumOfRaces() + " races."); 
	}
}