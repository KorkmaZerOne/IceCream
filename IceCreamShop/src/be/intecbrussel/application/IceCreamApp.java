package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.*;
import be.intecbrussel.eatables.Magnum.MagnumType;
import be.intecbrussel.sellers.*;

public class IceCreamApp {

	public static void main(String[] args) {
		
		IceCreamSeller iceDreamSalon = new IceCreamSalon(new PriceList(1.5 , 1.0 , 2.0));
		
		Eatable iceCream1 = iceDreamSalon.orderCone(new Flavor[] {Flavor.BANANA, Flavor.CHOCOLATE});
		Eatable iceCream2 = iceDreamSalon.orderIceRocket();
		Eatable iceCream3 = iceDreamSalon.orderMagnum(MagnumType.ALPINENUTS);
		
		Eatable [] iceCreams = {iceCream1 , iceCream2 , iceCream3};
		
		iceCreams [0].eat();
		iceCreams [1].eat();
		iceCreams [2].eat();
		
		System.out.println("Daily Raport : " + iceDreamSalon.toString());
	}

}
