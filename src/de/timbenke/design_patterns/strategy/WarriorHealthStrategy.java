package de.timbenke.design_patterns.strategy;

public class WarriorHealthStrategy implements HealthStrategy {

	public int receiveDamage(int damage) {
		if(damage<0) {
			throw new IllegalArgumentException();
		}
		
		return Math.max(0, (damage-2) )/2;
	}

}
