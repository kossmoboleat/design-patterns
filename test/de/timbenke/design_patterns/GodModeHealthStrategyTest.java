package de.timbenke.design_patterns;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GodModeHealthStrategyTest {
	
	private HealthStrategy god_mode_strat;
	
	@Before
	public void setUp() {
		god_mode_strat = new GodModeHealthStrategy();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void IllegalArgumentNegativeDamage() {
		god_mode_strat.receiveDamage(-10);
	}
	
	@Test
	public void NoHealthLostForNoDamage() {
		assertEquals(0, god_mode_strat.receiveDamage(0));
	}
	
	@Test
	public void NoHealthLostForHugeDamage() {
		assertEquals(0, god_mode_strat.receiveDamage(1000*1000*1000));
	}
}
