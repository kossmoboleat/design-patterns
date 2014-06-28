package de.timbenke.design_patterns;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class OgreHealthStrategyTest {
		
    private HealthStrategy ogre_strat;
		
	@Before
	public void setUp() {
		ogre_strat = new OgreHealthStrategy();
	}

	@Test(expected=IllegalArgumentException.class)
	public void IllegalArgumentNegativeDamage() {
		ogre_strat.receiveDamage(-10);
	}
	
	@Test
	public void NoHealthLostForNoDamage() {
		assertEquals(0, ogre_strat.receiveDamage(0));
	}
	
	@Test
	public void ExactHealthReduced() {
		assertEquals(2000, ogre_strat.receiveDamage(6000));
	} 
}
