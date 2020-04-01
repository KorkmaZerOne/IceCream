package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {

	public static void main(String[] args) {
		
		IceCreamSeller iceDreamSalon = new IceCreamSalon(new PriceList(1.5 , 1.0 , 2.0));
		
		iceDreamSalon.orderConeFlavor();
		iceDreamSalon.orderIceRocket();
		iceDreamSalon.orderMagnum();
		
		Eatable iceCream1 = new Magnum(MagnumType.ALPINENUTS);
		Eatable iceCream2 = new IceRocket();
		Eatable iceCream3 = new Cone(new Flavor[] {Flavor.BANANA});
		
		Eatable [] iceCreams = {iceCream1 , iceCream2 , iceCream3};
		
		iceCreams [0].eat();
		iceCreams [1].eat();
		iceCreams [2].eat();
		
		System.out.println("Daily Raport : " + iceDreamSalon.toString());
		
		
	}

}
