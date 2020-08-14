package com.companyName.projectName.projectgeniricLib;
import org.apache.log4j.Logger;
import com.companyName.projectName.genericLib.LogUtils;

public class ProjectGenericName {

	public static LogUtils log;
	public static Logger logger;

	static {
		log = new LogUtils();
		logger = log.logger();
	}


}
