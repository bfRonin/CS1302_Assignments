package ass2;

public class PetSold extends ItemSold{
	
	Boolean vaccinated;
	Boolean neutered;
	Boolean houseBroken;
	
	public void setVacc(Boolean isVacc){
		vaccinated = isVacc;
	}
	public void setNeut(Boolean isNeut){
		neutered = isNeut;
	}
	public void setHB(Boolean isHB){
		houseBroken = isHB;
	}
	
	public Boolean getVacc(){
		return vaccinated;
	}
	public Boolean getNeut(){
		return neutered;
	}
	public Boolean getHB(){
		return houseBroken;
	}
	
	public void setPrice(double thePrice){
		super.setPrice(thePrice);
		if(houseBroken==true){
			price = price + price*.2;
		}
		if(vaccinated==true){
			price = price + 20;
		}
		if(neutered==true){
			price = price + 50;
		}
	}
}

