package de.timbenke.design_patterns.singleton;

import org.junit.Test;

public class LoggerSingletonTest {
	@Test
	public void LogMessage() {
		LoggerSingleton.getInstance().log(LoggerSingleton.LogType.INFO, "The eagle has landed.");
	}
	
}
