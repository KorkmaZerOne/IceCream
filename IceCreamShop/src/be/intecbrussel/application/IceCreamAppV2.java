package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;

import be.intecbrussel.eatables.*;
import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.Magnum.MagnumType;
import be.intecbrussel.sellers.*;

public class IceCreamAppV2 {

	public static void main(String[] args) {
		
		IceCreamCar iceDreamCar = new IceCreamCar(new PriceList(1.5 , 1.0 , 2.0) , new Stock(1 , 3 , 0 , 2));
	
		Eatable eatableCone = iceDreamCar.orderCone(new Flavor [] {Flavor.BANANA, Flavor.CHOCOLATE , Flavor.LEMON});
		Eatable eatableRocket = iceDreamCar.orderIceRocket();
		Eatable eatableMagnum = iceDreamCar.orderMagnum(MagnumType.ALPINENUTS);
		
		if(eatableCone!=null)
			eatableCone.eat();
		else
			System.out.println("I can't eat Cone :(");
		
		if(eatableRocket!=null)
			eatableRocket.eat();
		else
			System.out.println("I can't eat Rocket :(");
		
		if(eatableMagnum!=null)
			eatableMagnum.eat();
		else
			System.out.println("I can't eat Magnum :(");
	
		System.out.println("Daily Raport : " + iceDreamCar.toString());

	}

}
