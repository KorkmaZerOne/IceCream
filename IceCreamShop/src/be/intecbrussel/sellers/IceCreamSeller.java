package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public interface IceCreamSeller extends Profitable {

	Cone orderConeFlavor();
	
	IceRocket orderIceRocket();
	
	Magnum orderMagnum();
}
