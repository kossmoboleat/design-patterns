package de.timbenke.design_patterns;

public class OgreHealthStrategy implements HealthStrategy {

	public int receiveDamage(int damage) {
		if(damage<0) {
			throw new IllegalArgumentException();
		}
		
		return damage/3;
	}

}
