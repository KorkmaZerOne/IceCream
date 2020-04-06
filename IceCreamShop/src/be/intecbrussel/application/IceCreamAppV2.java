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
	
		Eatable iceCream1 = iceDreamCar.orderCone(new Flavor [] {Flavor.BANANA,Flavor.CHOCOLATE});
		Eatable iceCream2 = iceDreamCar.orderIceRocket();
		Eatable iceCream3 = iceDreamCar.orderMagnum(MagnumType.ALPINENUTS);
		
		Eatable [] iceCreams = {iceCream1 , iceCream2 , iceCream3};
		
		for(int i=0; i<iceCreams.length; i++) {
			iceCreams[i].eat();
		}
	
		System.out.println("Daily Raport : " + iceDreamCar.toString());

	}

}
