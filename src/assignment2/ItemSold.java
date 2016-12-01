package assignment2;

public class ItemSold {

	int invoiceNum;
	String itemDescript;
	double price;
	
	public void setInvoiceNum(int theNum){
		invoiceNum = theNum;
	}
	public void setItemDescript(String theDescript){
		itemDescript = theDescript;
	}
	public void setPrice(double thePrice){
		price = thePrice;
	}
	
	
	public int getInvoiceNum(){
		return invoiceNum;
	}
	public String getItemDescript(){
		return itemDescript;
	}
	public double getPrice(){
		return price;
	}
}
