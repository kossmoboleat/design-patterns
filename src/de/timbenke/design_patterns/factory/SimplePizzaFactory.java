package de.timbenke.design_patterns.factory;

public class SimplePizzaFactory {

	public static Pizza createPizza(String type) {
		if(type=="margherita") {
			return new MargheritaPizza();
		} else {
			throw new IllegalArgumentException();
		}		
	}

}
