package de.timbenke.design_patterns.factory;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimplePizzaFactoryTest {
	@Test
	public void CreateMargheritaPizza() {
		Pizza pizza = SimplePizzaFactory.createPizza("margherita");
		
		assertTrue(pizza instanceof MargheritaPizza);
	}
}
