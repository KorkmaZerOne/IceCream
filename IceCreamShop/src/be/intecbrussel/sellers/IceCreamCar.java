package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.MagnumType;

public class IceCreamCar implements IceCreamSeller{

	private PriceList pricelist;
	private Stock stock;
	private double profit;
	
	public double getProfit() {
		return 0;
	}

	public Cone orderConeFlavor() {
		return null;
	}
	
	public Cone prepareCone() {
		
	}

	public IceRocket orderIceRocket() {
		return null;
	}
	public IceRocket prepareIceRocket(IceRocket rocket) {
		
	}
	public Magnum orderMagnum() {
		return null;
	}
	public Magnum prepareMagnum(MagnumType type) {
		
	}

}
