package assignment2;

public class HighSchoolBaseballGame extends BaseballGame{

	int[] homeScore = {-1,-1,-1,-1,-1,-1,-1};
	int[] awayScore = {-1,-1,-1,-1,-1,-1,-1};
	
	public HighSchoolBaseballGame(String homeTeam, String awayTeam) {
		super(homeTeam, awayTeam);
	}
	public HighSchoolBaseballGame() {
	}	
	public void setInning(int inning, int homeS, int awayS){
		if (inning>=8){System.out.println("Inning doesn't exist");}
		else{super.setInning(inning, homeS, awayS);}
	}
}