package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;

public class IceCreamSalon implements IceCreamSeller{

	private PriceList priceList;
	private double totalProfit;
	
	public IceCreamSalon(PriceList priceList){
		this.priceList = priceList;
	}
	
	public double getProfit() {
		return this.totalProfit;
	}
	public Cone orderConeFlavor () {
		System.out.println("New order: Cone");
		totalProfit +=  priceList.getBallPrice();
		return new Cone();
	}
	public IceRocket orderIceRocket() {
		System.out.println("New order: Ice Rocket");
		totalProfit +=  priceList.getRocketPrice();
		return new IceRocket();
	}
	public Magnum orderMagnum() {
		System.out.println("New order: Magnum");
		totalProfit += priceList.getMagnumPrice(Magnum.MagnumType.ALPINENUTS);
		return new Magnum();
	}
	@Override
	public String toString() {
		return "IceCreamSalon [ Total Profit: " + totalProfit + "]";
	}
}
