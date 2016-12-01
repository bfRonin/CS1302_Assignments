package assignment2;

public class DemoLLBaseballGame {
	
	public static void main(String[] args) {
		BaseballGame bb = new BaseballGame("Braves","RedSox");
		BaseballGame hs = new HighSchoolBaseballGame("Duluth","Norcross");
		BaseballGame ll = new LittleLeagueBaseballGame("Falcons","Panthers");
		BaseballGame noBall = new BaseballGame();
		
		bb.setInning(1,3,1);
		bb.setInning(2,0,1);
		bb.setInning(3,2,4);
		bb.setInning(4,9,6);
		bb.setInning(5,2,0);
		bb.setInning(6,1,0);
		bb.setInning(7,0,2);
		bb.setInning(8,3,3);
		bb.setInning(9,0,0);
		System.out.println(bb.getHomeName()+" "+bb.getAwayName());
		System.out.println(bb.getInning(1));
		System.out.println(bb.whoWon());
		
		System.out.println();
		
		hs.setInning(1,3,1);
		hs.setInning(2,0,1);
		hs.setInning(3,2,4);
		hs.setInning(4,9,6);
		hs.setInning(5,2,0);
		hs.setInning(6,1,0);
		hs.setInning(7,0,2);
		System.out.println(hs.getHomeName()+" "+hs.getAwayName());
		System.out.println(hs.getInning(5));
		System.out.println(hs.whoWon());
		
		System.out.println();
		
		ll.setInning(1,3,1);
		ll.setInning(2,0,1);
		ll.setInning(3,2,4);
		ll.setInning(4,9,6);
		ll.setInning(5,2,0);
		ll.setInning(6,1,0);
		System.out.println(ll.getHomeName()+" "+ll.getAwayName());
		System.out.println(ll.getInning(1));
		System.out.println(ll.whoWon());
		
		System.out.println();
		
		noBall.setTeamName("Banana", "Pudding");
		noBall.setInning(5, 5, 5);
		System.out.println(noBall.getInning(3));
		System.out.println(noBall.getHomeName()+" "+noBall.getAwayName());
		System.out.println(noBall.whoWon());
	}
	
}
