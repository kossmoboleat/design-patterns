package de.timbenke.design_patterns.strategy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import de.timbenke.design_patterns.strategy.HealthStrategy;
import de.timbenke.design_patterns.strategy.WarriorHealthStrategy;

public class WarriorHealthStrategyTest{
	
	private HealthStrategy warrior_strat;
	
	@Before
	public void setUp() {
		warrior_strat = new WarriorHealthStrategy();
	}

	@Test
	public void NotMoreHealthLostThanDamage() {
		int damage_dealt = 10;
		int health_reduced = warrior_strat.receiveDamage(damage_dealt);
		assertTrue(health_reduced<=damage_dealt);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void IllegalArgumentNegativeDamage() {
		warrior_strat.receiveDamage(-10);
	}
	
	@Test
	public void NoDamageNoHealthLost() {
		assertEquals(0, warrior_strat.receiveDamage(0));
	}
	
	@Test
	public void ShouldLoseSomeHealth() {
		assertTrue(warrior_strat.receiveDamage(1000*1000)>0);
	}
	
	@Test
	public void ExactHealthReduced() {
		assertEquals(14, warrior_strat.receiveDamage(30));
	}
}
