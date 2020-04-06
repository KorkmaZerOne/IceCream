package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;

public class IceCreamCar implements IceCreamSeller{

	private PriceList priceList;
	private Stock stock;
	private double profit;
	
	IceCreamCar(){
		
	}
	public IceCreamCar(PriceList priceList , Stock stock){
		this.priceList = priceList;
		this.stock = stock;
	}
	public double getProfit() {
		return this.profit;
	}
	public Cone orderCone(Flavor [] balls) {
		try {
			System.out.println("New order: A Cone");

			return prepareCone(balls);
		}catch(NoMoreIceCreamException ex){
			System.out.println(ex.getMessage());
			return new Cone();
		}
	}
	public Cone prepareCone(Flavor [] balls) throws NoMoreIceCreamException {
		if (stock.getBalls()>=balls.length && stock.getCones()>0) {
			System.out.println("Cone is preparing...");
			System.out.println("Cone is ready");
			profit += priceList.getBallPrice();
			stock.setBalls(stock.getBalls()- balls.length);
			stock.setCones(stock.getCones()- 1);
			return new Cone(balls);
		}else {
			throw new NoMoreIceCreamException("Sorry! no more Cone!");
			}
	}
	
	public IceRocket orderIceRocket() {
		try {
			System.out.println("New order: An Ice Rocket");
			return prepareIceRocket();
		}catch(NoMoreIceCreamException ex) {
			System.out.println(ex.getMessage());
			return new IceRocket();
		}
	}
	public IceRocket prepareIceRocket() throws NoMoreIceCreamException {
		if(stock.getIceRockets()>0) {
			System.out.println("IceRocket is preparing...");
			System.out.println("Ice Rocket is ready");
			profit +=  priceList.getRocketPrice();
			stock.setIceRockets(stock.getIceRockets()-1);
			return new IceRocket();
		}else {
			throw new NoMoreIceCreamException("Sorry! no more Ice Rocket!");
		}
	}
	public Magnum orderMagnum(MagnumType type) {
		try {
		System.out.println("New order: A Magnum");
			return prepareMagnum(type);		
		}catch(NoMoreIceCreamException ex) {
			System.out.println(ex.getMessage());
			return new Magnum();
		}
	}
	public Magnum prepareMagnum(MagnumType type) throws NoMoreIceCreamException{
		if(stock.getMagni()>0) {
			System.out.println("Magnum is preparing...");
			System.out.println("Magnum is ready");
			profit += priceList.getMagnumPrice(type);
			stock.setMagni(stock.getMagni()-1);
			return new Magnum(type);
		}else {
			throw new NoMoreIceCreamException("Sorry! no more Magnum!");
		}
	}
	@Override
	public String toString() {
		return "IceCreamSalon [ Profit: " + profit + "]";
	}
}
