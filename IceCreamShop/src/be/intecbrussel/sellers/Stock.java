package be.intecbrussel.sellers;

public class Stock {

	private static int iceRockets;
	private static int cones;
	private static int balls;
	private static int magni;
	
	public Stock(){
		
	}
	public Stock(int cones , int balls , int iceRockets,  int magni){
		this.cones = cones;
		this.balls = balls;
		this.iceRockets = iceRockets;
		this.magni = magni;
	}
	
	public static int getIceRockets() {
		return iceRockets;
	}
	public void setIceRockets(int iceRockets) {
		this.iceRockets = iceRockets;
	}
	public static int getCones() {
		return cones;
	}
	public void setCones(int cones) {
		this.cones = cones;
	}
	public static int getBalls() {
		return balls;
	}
	public void setBalls(int balls) {
		this.balls = balls;
	}
	public static int getMagni() {
		return magni;
	}
	public void setMagni(int magni) {
		this.magni = magni;
	}
}
