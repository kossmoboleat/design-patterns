package de.timbenke.design_patterns.factory;

import org.junit.Test;

public class MagheritaPizzaTest {
	@Test
	public void UsePizza() {
		Pizza margherita = new MargheritaPizza();
				
		margherita.prepare();
		margherita.bake();
		margherita.cut();
		margherita.bake();		
	}

}
