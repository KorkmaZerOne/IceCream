package be.intecbrussel.eatables;

import java.util.Arrays;

import be.intecbrussel.sellers.Stock;

public class Cone implements Eatable{
	public enum Flavor {
		
		STRAWBERRY,
		BANANA,
		CHOCOLATE,
		VANILLA,
		LEMON,
		STRACIATELLA,
		MOKKA,
		PISTACHE;	
	}
	
	public Flavor [] balls;
	
	
	public Cone(){
		
	}
	public Cone(Flavor [] balls){
		this.balls = balls;
	}
	public void eat() {
		if(Stock.getCones()>0) {
			System.out.println("Immm... my favorite cone is " + Arrays.toString(balls));
		}else {
			System.out.println("I can't eat Cone! :(");
		}
	}
}
