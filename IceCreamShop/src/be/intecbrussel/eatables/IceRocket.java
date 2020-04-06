package be.intecbrussel.eatables;

import be.intecbrussel.sellers.Stock;

public class IceRocket implements Eatable{
	
	public IceRocket(){
		
	}
	public void eat() {
		if(Stock.getIceRockets()>0) {
			System.out.println("Immm... my favorite ice cream is ROCKET");
		}else {
			System.out.println("I can't eat Ice Rocket! :(");
		}
	}
}
