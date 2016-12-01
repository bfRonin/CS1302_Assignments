package assignment2;

public class ScentedCandle extends Candle{
	
	String scent;
	
	public void setScent(String thisScent){
		scent = thisScent;
	}
	public String getScent(){
		return scent;
	}
	public void setHeight(int thisHeight){
		height = thisHeight;
		price = 3 * height;
	}

}
