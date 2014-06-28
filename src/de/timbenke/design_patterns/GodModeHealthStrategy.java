package de.timbenke.design_patterns;

public class GodModeHealthStrategy implements HealthStrategy {

	public int receiveDamage(int damage) {
		if(damage<0) {
			throw new IllegalArgumentException();
		}
		
		return 0;
	}

}
