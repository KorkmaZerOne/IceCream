package be.intecbrussel.sellers;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;

public class PriceList {
	
	public double ballPrice;
	public double rocketPrice;
	public double magnumStandartPrice;
	
	public PriceList(){
	
	}
	public PriceList(double ballPrice , double rocketPrice , double magnumStandartPrice){
		this.ballPrice = ballPrice;
		this.rocketPrice = rocketPrice;
		this.magnumStandartPrice = magnumStandartPrice;
	}
	public double getBallPrice() {
		return ballPrice;
	}
	public void setBallPrice(double ballPrice) {
		this.ballPrice = ballPrice;
	}
	public double getRocketPrice() {
		return rocketPrice;
	}
	public void setRocketPrice(double rocketPrice) {
		this.rocketPrice = rocketPrice;
	}
	public double getMagnumPrice(MagnumType type) {
		double magnumPrice;
		if (type != MagnumType.ALPINENUTS || type != MagnumType.ROMANTICSTRAWBERRIES) {
			magnumPrice = this.magnumStandartPrice*1.5;
		} else {
			magnumPrice = this.magnumStandartPrice;
		}
		return magnumPrice;
	}
	public void setMagnumStandartPrice(double magnumStandartPrice) {
		this.magnumStandartPrice = magnumStandartPrice;
	}
}
