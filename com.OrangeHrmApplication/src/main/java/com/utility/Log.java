package com.utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log{
		public static Logger log=Logger.getLogger("Log");
		private static Object propertyconfigurator;
		public static void info(String message)
		{
			
			PropertyConfigurator.configure("Log4j.properties");
			log.info(message);
		}
	
	
	
	
}
