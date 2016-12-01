package assignment2;

public class BaseballGame {
	
	String homeT;
	String awayT;
	
	private int[] homeScore = {-1,-1,-1,-1,-1,-1,-1,-1,-1};
	private int[] awayScore = {-1,-1,-1,-1,-1,-1,-1,-1,-1};
	
	public BaseballGame(String homeTeam, String awayTeam){
		homeT=homeTeam;
		awayT=awayTeam;
	}
	public BaseballGame() {
	}

	public void setTeamName(String name, String name2){
		homeT = name;
		awayT = name2;
	}
	public String getHomeName(){
		return homeT;
	}
	public String getAwayName(){
		return awayT;
	}
	public void setInning(int inning, int homeS, int awayS){
		if (inning>1 && homeScore[inning-2]==-1){
			System.out.println("Please enter in innings in order.");
		}
		else{
			homeScore[inning-1]=homeS;
			awayScore[inning-1]=awayS;
		}
	}
	public String getInning(int inning){
		String daScore;
		if (homeScore[inning-1]>=0 && awayScore[inning-1]>=0){
			daScore = ("Home- " + homeScore[inning-1]+"\nAway- "+awayScore[inning-1]);
		}
		else{
			daScore=("They haven't reached that inning yet");
		}
		return daScore;
	}
	public String whoWon(){
		String datsWhoWon=("It's a tie!");
		int homeTotal=0;
		int awayTotal=0;
		
		for (int i=0; i<homeScore.length;i++){
			if(homeScore[i]==-1){homeScore[i]=0;}
			homeTotal=homeTotal+homeScore[i];
		}
		for (int i=0; i<awayScore.length;i++){
			if(awayScore[i]==-1){awayScore[i]=0;}
			awayTotal=awayTotal+awayScore[i];
		}
		
		if(homeTotal>awayTotal){
			datsWhoWon=(homeT+" won with "+ homeTotal+ " points.");
		}
		if(awayTotal>homeTotal){
			datsWhoWon=(awayT+" won with "+ awayTotal+ " points.");
		}
		return datsWhoWon;
	}
}