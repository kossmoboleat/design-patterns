package de.timbenke.design_patterns.singleton;

import java.io.PrintStream;

public class LoggerSingleton {

	private static LoggerSingleton instance = new LoggerSingleton();
	
	public static LoggerSingleton getInstance() {
		return instance;
	}

	public void log(LogType type, String message) {
		@SuppressWarnings("resource")
		PrintStream out_stream = type==LogType.INFO ? System.out : System.err;
		
		out_stream.println(message);
	}

	public static enum LogType {
		INFO,
		ERROR
	}
	
}
