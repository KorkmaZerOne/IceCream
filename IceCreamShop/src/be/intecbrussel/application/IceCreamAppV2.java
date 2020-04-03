package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.Magnum.MagnumType;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.NoMoreIceCreamException;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

public class IceCreamAppV2 {

	public static void main(String[] args) {
		
		IceCreamCar iceDreamCar = new IceCreamCar(new PriceList(1.5 , 1.0 , 2.0) , new Stock(2 , 2 , 0 , 2));
		
		try {
			iceDreamCar.orderCone(new Flavor [] {Flavor.BANANA});
		} catch (NoMoreIceCreamException e) {
			System.out.println(e);;
		}
		try {
			iceDreamCar.orderIceRocket();
		} catch (NoMoreIceCreamException e) {
			System.out.println(e);;
		}
		try {
			iceDreamCar.orderMagnum(MagnumType.ALPINENUTS);
		} catch (NoMoreIceCreamException e) {
			System.out.println();
		}
		
		Eatable iceCream1 = new Cone(new Flavor[] {Flavor.BANANA});
		Eatable iceCream2 = new IceRocket();
		Eatable iceCream3 = new Magnum(MagnumType.ALPINENUTS);
		
		Eatable [] iceCreams = {iceCream1 , iceCream2 , iceCream3};
		
		iceCreams [0].eat();
		iceCreams [1].eat();
		iceCreams [2].eat();
	
		System.out.println("Daily Raport : " + iceDreamCar.toString());
	}

}
