package com.companyName.projectName.smokeTestCaseLib;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.companyName.projectName.genericLib.ExcelLib;
import com.companyName.projectName.genericLib.ExtendReportManager;
import com.companyName.projectName.genericLib.LogUtils;

public class DummyTest extends ExtendReportManager {

	ExcelLib eLib;
	LogUtils log;
	Logger logger;

	@BeforeClass
	public void configBeforeClass() throws Exception {
		log = new LogUtils();
		logger = log.logger();
		eLib = new ExcelLib();
	}

	
	
	/* Step 1 : Test */
	@Test(priority = 1)
	public void dummyTest() throws Exception {
		test = extent.createTest(" Test");
		logger.info("Test!!");
	}

}
