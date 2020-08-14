package com.companyName.projectName.genericLib;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

/*
 **	 		@Author: Raushan kumar jha
 ** 		@Version: 1.0
 ** 		@Date: 20/06/2017
 ** 		This class contains methods for Logger 
 */

public class LogUtils {
	public static Logger log;
	
	

	public Logger logger(){
		 log=Logger.getLogger("Logger");
		 // configure log4j properties file
		 PropertyConfigurator.configure("resources"+File.separator+"log4j.properties");
		 return log;
	}
	
}
