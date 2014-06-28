package de.timbenke.design_patterns.factory;

import java.util.ArrayList;

public abstract class Pizza {
	
	private static enum Condiment {
		TOMATO_SAUCE,
		CHEESE,
		SALAMAI
	};
	
	private boolean baked = false;
	private boolean boxed = false;
	
	private ArrayList<Condiment> condiments = new ArrayList<Condiment>();
	
	private int numberOfPieces = 1;
	
	public void prepare() {
		condiments.add(Condiment.TOMATO_SAUCE);
		condiments.add(Condiment.CHEESE);
	}
	
	public void bake() {
		baked = true;
	}
	
	public void cut() {
		numberOfPieces = 8;
	}
	
	public void box() {
		if(!baked) {
			throw new IllegalStateException("Cannot box an unbaked pizza");
		}
		
		boxed = true;
	}

	public int getNumberOfPieces() {
		return numberOfPieces;
	}

	public boolean isBoxed() {
		return boxed;
	}
}
