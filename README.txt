LLR Automation Framework: 

Import Guide: 

1. Copy the TestAutomation Framework into your local machine
2. Import into Eclipse
3. Make sure you select compatible chrome driver (64bit/32bit) for your machine 
in resources folder under DL-TestAutomation/com/otsi/resources

project structure: 

 DL_Automation: 
   -Src
      -com.otsi.rta.dlLib (DL Related Feature method and test class) 
      -com.otsi.rta.genericLib ( common function related to Automation Framework) 
      -com.otsi.rta.llrLib (LLR Related Feature method and test class llrfresh,mela,retest and exam) 
      -com.otsi.rta.pageobjectRepoLib (common functions related to project)

   -Lib (All external dependency jars)
   -Log (console log, file appender log)
   -Resources (browser driver, test data and properties file) 
   -Screenshot (Screenshot)
   -Test-Output (Extended Report ) 

   -Testng.xml (Need to provide test class to be executed)

Steps to execute: 

1. Provide the test class name and rowNum of TestData in Testng.xml
2. Provide input data in the TestData.xls file
3. Run the Testng.xml file


	

