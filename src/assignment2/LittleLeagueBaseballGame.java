package assignment2;

public class LittleLeagueBaseballGame extends BaseballGame{

	int[] homeScore = {-1,-1,-1,-1,-1,-1};
	int[] awayScore = {-1,-1,-1,-1,-1,-1};
	
	public LittleLeagueBaseballGame(String homeTeam, String awayTeam) {
		super(homeTeam, awayTeam);
	}
	public LittleLeagueBaseballGame(){
	}
	public void setInning(int inning, int homeS, int awayS){
		if (inning>=7){System.out.println("Inning doesn't exist");}
		else{super.setInning(inning, homeS, awayS);}
	}
}