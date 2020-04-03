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
	public Cone orderCone (Flavor [] balls) {
		System.out.println("New order: A Cone");
		totalProfit +=  priceList.getBallPrice();
		return new Cone(balls);
	}
	public IceRocket orderIceRocket() {
		System.out.println("New order: An Ice Rocket");
		totalProfit +=  priceList.getRocketPrice();
		return new IceRocket();
	}
	public Magnum orderMagnum(MagnumType type) {
		System.out.println("New order: A Magnum");
		totalProfit += priceList.getMagnumPrice(type);
		return new Magnum();
	}
	@Override
	public String toString() {
		return "IceCreamSalon [ Total Profit: " + totalProfit + "]";
	}
}
