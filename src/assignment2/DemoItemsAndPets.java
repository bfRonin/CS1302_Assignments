package assignment2;

public class DemoItemsAndPets {
	
	public static void main(String[] args) {
	
		ItemSold chewToy = new ItemSold();
		ItemSold dogBed = new ItemSold();
		PetSold badDog = new PetSold();
		PetSold goodDog = new PetSold();

		chewToy.setInvoiceNum(1);
		chewToy.setItemDescript("Turtle Chew Toy");
		chewToy.setPrice(5.75);
		
		dogBed.setInvoiceNum(2);
		dogBed.setItemDescript("Large Dog Bed");
		dogBed.setPrice(34.99);
		
		badDog.setInvoiceNum(3);
		badDog.setItemDescript("Rescued Pug");
		badDog.setNeut(false);
		badDog.setHB(false);
		badDog.setVacc(false);
		badDog.setPrice(150);
		
		goodDog.setInvoiceNum(4);
		goodDog.setItemDescript("Pure-bred Husky");
		goodDog.setHB(true);
		goodDog.setNeut(true);
		goodDog.setVacc(true);
		goodDog.setPrice(150);
		
		System.out.println(chewToy.getInvoiceNum()+" "+chewToy.getItemDescript()+" - $"+chewToy.getPrice());
		System.out.println(dogBed.getInvoiceNum()+" "+dogBed.getItemDescript()+" - $"+dogBed.getPrice());
		System.out.println(badDog.getInvoiceNum()+" "+badDog.getItemDescript()+" - $"+badDog.getPrice()+"0");
		System.out.println(goodDog.getInvoiceNum()+" "+goodDog.getItemDescript()+" - $"+goodDog.getPrice()+"0");
	}
}
