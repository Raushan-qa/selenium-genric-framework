package com.companyName.projectName.genericLib;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;
import org.openqa.selenium.os.WindowsUtils;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

/*
 **	 		@Author: Raushan kumar jha
 ** 		@Version: 1.0
 ** 		@Date: 20/06/2017
 ** 		This class contains methods for Extend Report and After annotation methods.
 */
public class ExtendReportManager {

	static LogUtils log;
	static Logger logger;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	static {

		log = new LogUtils();
		logger = log.logger();

	}

	@BeforeSuite
	public void setUp() {
		htmlReporter = new ExtentHtmlReporter(
				System.getProperty("user.dir") + "/test-output/DL-TestAutomationReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		extent.setSystemInfo("User Name", "Raushan Kumar Jha");
		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("Host Name", "QA Server");
		extent.setSystemInfo("Environment", "Pre-Pod");
//		extent.setSystemInfo("Version", "1.0");

		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("DL Test Automation Report");
		htmlReporter.config().setReportName("Pre-Pod DL Application Functional Test Automation Report");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);
	}
	@AfterMethod
	public void getResult(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			ScreenshotLib.takeScreenshot(result);
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " Test case FAILED due to below issues:",
					ExtentColor.RED));
			test.fail(result.getThrowable());
			test.log(Status.FAIL, "Snapshot below: " + test.addScreenCaptureFromPath("screenshot"));
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
			ScreenshotLib.takeScreenshot(result);
		} else {
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " Test Case SKIPPED", ExtentColor.YELLOW));
			test.skip(result.getThrowable());
		}
	}

	@AfterClass
	public void tearDown() throws Exception {
		if (Driver.driver != null) {
			logger.info("Closing browser...");
//			Driver.driver.close();
//			Driver.driver.quit();

			String processName = "chrome.exe";
//			logger.info(isProcessRunning(processName));
//			 if (isProcessRunning(processName)) {
//			  killProcess(processName);
//			 }	
		}
		logger.info("All chrome instances are closed...");
		
	}

	@AfterSuite
	public void flushExtendReport() {
		extent.flush();
	}
	
	private static final String TASKLIST = "tasklist";
	private static final String KILL = "taskkill /F /IM ";

	public static boolean isProcessRunning(String serviceName) throws Exception {

		
//		WindowsUtils.killByName("");
	 Process p = Runtime.getRuntime().exec(TASKLIST);
	 BufferedReader reader = new BufferedReader(new InputStreamReader(
	 p.getInputStream()));
	 String line;
	 while ((line = reader.readLine()) != null) {

//		 logger.info(line);
	  if (line.contains(serviceName)) {
	   return true;
	  }
	 }

	 return false;

	}

	public static void killProcess(String serviceName) throws Exception {
	  Runtime.getRuntime().exec(KILL + serviceName);

	 }

}
