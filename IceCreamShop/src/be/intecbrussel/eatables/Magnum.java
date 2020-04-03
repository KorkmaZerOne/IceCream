package be.intecbrussel.eatables;

import be.intecbrussel.sellers.Stock;

public class Magnum implements Eatable{
	public enum MagnumType {
		
		MILKCHOCALATE,
		WHITECHOCOLATE,
		BLACKCHOCOLATE,
		ALPINENUTS,
		ROMANTICSTRAWBERRIES;
	}
	
	public MagnumType type;
	
	public Magnum (){
		
	}
	public Magnum (MagnumType type){
		this.type = type;
	}
	public void eat() {
		if (Stock.getMagni()>0) {
			System.out.println("Immm... my favorite MAGNUM is " +this.type);
		}else {
			System.out.println("I can't eat Magnum! :(");
		}
	}
	public MagnumType getType() {
		return type;
	}
}
