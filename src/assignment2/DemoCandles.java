package assignment2;

public class DemoCandles {

	public static void main(String[] args) {
	
		Candle a = new Candle();
		a.setColor("White");
		a.setHeight(10);
		
		ScentedCandle b = new ScentedCandle();
		b.setColor("Purple");
		b.setScent("Lavander");
		b.setHeight(8);
		
		System.out.print("The " + a.getHeight()+ "in " +a.getColor() + " Candle is $" 
				+ a.getPrice() + ".\n");
		System.out.printf("The " + b.getScent() + " Scented " + b.getHeight() + "in "+ b.getColor()
				+ " Candle is $" + b.getPrice() + ".");
	}

}
