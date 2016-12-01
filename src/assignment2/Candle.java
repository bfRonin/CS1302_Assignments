package assignment2;

public class Candle {
	
	String color;
	int height;
	int price;
	
	public void setColor(String thisColor){
		color = thisColor;
	}
	public void setHeight(int thisHeight){
		height = thisHeight;
		price = 2 * height;
	}
	
	public String getColor(){
		return color;
	}
	public int getHeight(){
		return height;
	}
	public int getPrice(){
		return price;
	}
}
