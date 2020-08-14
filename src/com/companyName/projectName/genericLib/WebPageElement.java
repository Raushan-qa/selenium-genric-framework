package com.companyName.projectName.genericLib;

/*
 **	 		@Author: Raushan kumar jha
 ** 		@Version: 1.0
 ** 		@Date: 20/06/2017
 ** 		This class contains DL Web Elements
 */

public final class DLWebElement {
	
		
	/* @ Declaration about Login Screen Objects */
	public static final String LOGIN_USERNAME = "userName";
	public static final String LOGIN_PASSWORD = "passWord";
	public static final String CAPTCHACODE = "capchaValue";
	public static final String LOGIN_BTN = "//button[text()[contains(.,'Login')] and @ng-click='authLogin()']";		
	public static final String LOGOUT_BTN ="html/body/div[2]/header/nav/div/ul/li/a/i";

	/* navigate to LLR fresh */
	public static final String LICENCE = "//a[text()[contains(.,'Licence')]]";
	public static final String LLRLink = "//a[contains(@href,'#!/llrinstructions')]";	
	public static final String APPLY_LLRbtn ="//button[contains(.,'Click here to apply for Learner Licence')]";
	public static final String APPLY_LLREndorsment_btn ="//label[text()[contains(.,'LLR Endorsement')]]";
	public static final String LLRFreshRadio_BTN ="//label[text()[contains(.,'LLR Fresh (if the applicant not having any DL/LLR)')]]";
	public static final String nationalityDD ="//select[@name='nationality']";
	public static final String authType ="//div[contains(text(),'With Aadhaar')]/input";
	public static final String TypeOfserviceNextBtn ="//button[text()[contains(.,'Next')] and @ng-click='doNext(transactionTypeForm.$valid)']";
	
	public static final String LLRAadhaarbox1 ="guardianAadhaar1";
	public static final String LLRAadhaarphoto ="//img[@id='FPImage1']";
	public static final String SCANbtn ="imagebtndiv";
	public static final String IAgreechkbox="//label[contains(.,'I Agree')]";
	public static final String NEXTbtn="//button[contains(.,'Next')]";
	
	/* Parents/guardiance*/ 
	
	public static final String parent="//h3[contains(text(),'Guardian Details')]";
	public static final String LLRParentAdhaar1="paadhaar1";
	public static final  String LLRParentAdhaar2="paadhaar2";
	public static final  String LLRParentAdhaar3="paadhaar3";
	
	public static final String LLRParentConfirmAdhaar1="confirmpAadhaar1";
	public static final  String LLRParentConfirmAdhaar2="confirmpAadhaar2";
	public static final  String LLRParentConfirmAdhaar3="confirmpAadhaar3";
	
	public static final String LLRParentFirstName="(.//label[text()[contains(.,'First Name')]]/following-sibling::input)[2]"; 
	public static final String LLRParentLastName="(.//label[text()[contains(.,'Last Name')]]/following-sibling::input)[2]";
	public static final String LLRParentCareOf="(.//label[text()[contains(.,'Son/Daughter/Wife/Care of')]]/following-sibling::input)[2]";
	public static final String LLRParentDOB="(.//label[text()[contains(.,'Date of Birth (DD-MM-YYYY)')]]/following-sibling::input)[2]";
	public static final String LLRParentConformDOB="(.//label[text()[contains(.,'Confirm Date of Birth')]]/following-sibling::input)[2]";
//	public static final String LLRParentAdhaarPhoto="(//img[@id='FPImage1'])[2]";
//	public static final String Scanbtn2="(//input[@id='imagebtndiv'])[2]";
	public static final String IAgreeParent="//label[contains(.,'I Agree')]";
	public static final String NextbtnParent="//button[@ng-click='doNext(guardianForm.$valid)']";         // button[@ng-click='doNext(guardianForm.$valid)']
	public static final String DiffAbled="//input[@name='isDifferentlyAbled'and @value='no']";
	public static final String DOBAttachmenttDD="(//select[@name='pdistrict'])[1]";
	public static final String AddAttachmentDDParent="(//select[@name='pdistrict'])[4]";
	
	/* Medical Certificate for above 50 */ 
	
	public static final String medicalcert="//h3[contains(text(),'Medical Certificate')]";
	public static final String identMark="identificationMark1"; 
	public static final String identMark2="identificationMark2";
	public static final String nameofMedicalOfficer="name";
	public static final String desgofMedicalOfficer="designation";
	public static final String regNoOfMedicalOfficer="registrationNo";
	
	
	public static final String Arrange1stName="(.//div[@class='form-group alignFullName'])[1]/div[1]/input[@type='radio']";
	public static final String Arrange2ndName="(.//div[@class='form-group alignFullName'])[2]/div[2]/input[@type='radio']";
	public static final String Arrange3rdName="(.//div[@class='form-group alignFullName'])[3]/div[3]/input[@type='radio']";
	public static final String ArrangeOKbtn="//button[contains(.,'OK') and @ng-click='doSumbitFullName()']";
	//public static final String ArrangeOKbtn="//*[@id='subTab1']/div/div/div[2]/div/div/div/div/form/div[2]/button[2]";
	
	/*Application Details*/
	public static final String Adhaartextbox="//input[@id='aadhaar1' and @name='aadhaar1']";
	public static final String confirmAadhaar="//input[@id='confirmAadhaar1' and @name='confirmAadhaar1']";
	public static final String DisplayName=".//label[text()[contains(.,'Display Name')]]/following-sibling::input";
	public static final String FirstName=".//label[text()[contains(.,'First Name')]]/following-sibling::input";
	public static final String LastName=".//label[text()[contains(.,'Last Name')]]/following-sibling::input";
	public static final String CareOf=".//label[text()[contains(.,'Son/Daughter/Wife/Care of')]]/following-sibling::input";
	public static final String DOB="//input[@name='dob']";
	public static final String ConformDOB=".//label[text()[contains(.,'Confirm Date of Birth')]]/following-sibling::input";
	public static final String Gender="//select[@name='gender']";
	
	public static final String QualificationDD="//div[@name='qualification']";
	public static final String graduate="(//input[@type='search'])[1]";
	public static final String graduateSelect="//span[@class='ui-select-choices-row-inner']";
	
	public static final String BloodGroupDD="//div[@name='bloodGrp']";
	public static final String bloodGrp="(//input[@type='search'])[2]";
	public static final String bloodGrpSelect="//span[@class='ui-select-choices-row-inner']";
	
	public static final String DiffAbledno="//input[@name='isDifferentlyAbled'and @value='no']";
	public static final String DiffAbledyes="//input[@name='isDifferentlyAbled'and @value='yes']";
	public static final String MobNumber=".//label[text()='Mobile Number ']/following-sibling::input";
	public static final String ConfMobNum=".//label[text()[contains(.,'Confirm Mobile Number')]]/following-sibling::input";
	public static final String EmailId=".//label[text()='Email Id']/following-sibling::input";
	public static final String ConfEmailId=".//label[text()[contains(.,'Confirm Email Id')]]/following-sibling::input";
	public static final String NextBtn="//button[text()[contains(.,'Next')] and @ng-click='doNext(applicantDetailesForm.$valid)']";
	public static final String ErrorMsg16Years="//span[contains(.,'16 and Below 16 years not allowed')]";
	/* Application Details end */
	
	/*Address Details*/
	public static final String doorNo="//input[@name='doorNo']";
	public static final String streetName="//input[@name='pstreetName']";
	public static final String selectdistrictDD="//div[@placeholder='Select District']";
	public static final String district="//span[text()='VISHAKAPATNAM']";
	
	public static final String SelectMandalDD="//div[@placeholder='Select Mandal']";
	public static final String Mandal="//span[text()='VISAKHAPATNAM URBAN']";
	
	public static final String SelectVillageDD="//div[@placeholder='Select Village']";
	public static final String Village="//span[text()='[OTHER]']";
	
	public static final String EnterVillage="//input[@name='villageOther']";
	
	public static final String SelectPincodeDD="(//span[@class='btn btn-default form-control ui-select-toggle'])[4]";
	public static final String Pincode="(//input[@type='search'])[4]";
	public static final String PincodeSelect = "//span[@class='ui-select-choices-row-inner']";
	public static final String town="//input[@name='ptownOrCity']";


	/* Address for LLR */
	
	public static final String SelectPincodeDD1="(//span[@class='btn btn-default form-control ui-select-toggle'])[6]";
	public static final String Pincode1="(//input[@type='search'])[6]";
	public static final String PincodeSelect1 = "(//span[@class='ui-select-choices-row-inner'])[1]";
	
	/*Address Details Ends*/
	public static final String PDoorNum=".//label[text()[contains(.,'Door Number')]]/following-sibling::input[@name='pdoorNo']";
	public static final String pstreetName=".//label[text()[contains(.,'Street')]]/following-sibling::input[@name='pstreetName']";
	public static final String pdistrict=".//label[text()[contains(.,'District')]]/following-sibling::select[@name='pdistrict']";
	public static final String pmandal=".//label[text()[contains(.,'Mandal')]]/following-sibling::select[@name='pmandal']";
	public static final String pvillage=".//label[text()[contains(.,'Village/Area')]]/following-sibling::select[@name='pvillage']";
	public static final String ptownOrCity=".//label[text()[contains(.,'Town/City')]]/following-sibling::input[@name='ptownOrCity']";
	public static final String ppincode=".//label[text()[contains(.,'Pincode')]]/following-sibling::select[@name='ppincode']";
	public static final String pNextBtn="//button[text()[contains(.,'Next')] and @ng-click='doNext(applicantAddress.$valid)']";
	
	/* Address for Foreigner */
	
	public static final String doorHouseNo="doorHouseNo";
	public static final String street="street";
	public static final String landMark="landMark";
	public static final String cityArea="cityArea";
	public static final String state="state";
	public static final String country="country";
	public static final String postZipCode="postZipCode";
	
	/* COV */
	
	public static final String covChkbox=".//label[text()[contains(.,'Motor Cycle With Gear')]]";
	public static final String covChkbox1=".//label[text()[contains(.,'Tractor')]]";
	public static final String covChkbox2=".//label[text()[contains(.,'Autorickshaw Non Transport')]]";
	public static final String covChkbox3=".//label[text()[contains(.,'Road roller Non Transport')]]";
	public static final String covChkbox4=".//label[text()[contains(.,'Tractor and Trailer Non Transport')]]";
	public static final String covChkbox5=".//label[text()[contains(.,'Light Motor Vehicle Non Transport')]]";
	

	 
	public static final String covChkboxbelow18=".//label[text()[contains(.,'Motor Cycle Without Gear (Below 50 CC)')]]";
	
	public static final String covInvalidCarriage=".//label[text()[contains(.,'Invalid Carriage')]]";
	
	public static final String classOfVehicleNxtBtn="//button[text()[contains(.,'Next')] and @ng-click='doNext(classOfVehicleForm)']";
	
	//public static final String classOfVehicleNxtBtn="//button[text()[contains(.,'Next')] and @ng-click='doNext(classOfVehicle.$valid)']";
	
	/* Attachments*/ 
	
	public static final String AddAttachmentDD="(//select[@name='pdistrict'])[2]";
	public static final String Form1AAttachmentDD="(//select[@name='pdistrict'])[3]";
	
	public static final String AddAttachmentNextBtn="//button[text()[contains(.,'Next')] and @ng-click='doNext(appEnclosures.$valid)']";
	
	/* PayU Money */
	 public static final String SlotDate="//h3[contains(text(),'Slot Date')]";
    public static final String PayURadioBtn="//img[@src='assets/images/payment/payu-icon.png']";
    public static final String SlotDatePayU="(//input[@ng-value='slotDate'])[1]";
    public static final String IAgreePayU="//label[@for='payUagreement' and contains(text(),'I Agree')]";
    public static final String PayBtnPayU="//button[contains(text(),'Pay')]";
    public static final String PayIntiiationPayU="//input[@value='Pay']";
    public static final String CreditorDebitPayU="//span[contains(text(),'Credit/Debit Card')]";
    public static final String CardNumberPayU="cardnumber";
    public static final String CardMonthYearPayU="expirydate";
    public static final String CardCVVNumberPayU="cvvno";
    public static final String FinalPayBtnPayU="cardDetailsForm.payButton";
    
    /*CCO elements*/
    public static final String CCODashboard="//span[text()[contains(.,'Dashboard')]]";
    public static final String LearnerLicenceLink="//a[@ng-click='getoPendingApplications()']";
    public static final String assignToMeBtn="//input[@ng-click='assignToMe()']";
    public static final String releaseBtn="//input[@ng-click='releaseAssignee()']";
    
    public static final String CCOAdharScan="//span[text()[contains(.,'Aadhaar Validation')]]";
    public static final String CCOAdharNo="aadhaar1";
    public static final String CCOAdharNo2="aadhaar2";
    public static final String CCOAdharNo3="aadhaar3";
    public static final String CCOAdharSearch="//button[contains(text(),'Search')]"; 
    public static final String CCOAdharScanbtn="//input[@id='imagebtndiv']";
    public static final String CCOAdharAuthenticate="//button[@ng-click='getDetailsByAadhaar()']";
    public static final String CCOAdharAuthParent="//button[@ng-click='getGuardianDetailsByAadhaar()']";
    
    
    public static final String allowTest="//input[@name='appStatus' and @ng-click='hideComments()']";
    
    public static final String CCOAdharSubmit="//button[contains(text(),'Submit') and @ng-click='updateStatus(appFormStatus.$valid)']"; 
    
//    public static final String SlotBookingDate="(//td[contains(@class,'Available')])[1]"; 
    public static final String SlotBookingDateFastFilling="(//td[contains(@class,'Fastfilling')])[1]";
    public static final String SlotBookingDateAvailable="(//td[contains(@class,'Available')])[1]";
    public static final String SlotBookingDate="(.//td[@class='uib-day text-center ng-scope Available']/button)[1]";
	public static final String SlotBookingBtn="//button[contains(text(),'Submit')]";
	public static final String getLlrPdfViewBtn="//button[@ng-click='getLlrPdfView()']";
	public static final String APPLICATIONNo="//h4[text()[contains(.,'APPLICATION NO.')]]/following-sibling::p";
	
	public static final String ccoViewBtn="(//button[text()[contains(.,'View')]])";
	public static final String ccoTabAllDetails="//a[contains(.,'All Details')]";
	public static final String ccoTabCheckList="//a[contains(.,'Check List')]";
	public static final String applicantPhotoApproveBtn="//input[@type='radio' and @id='applicantPhotoApprove0']";
	public static final String ccoAttachmentNextBtn="//p[@ng-click='nextStep()']";
	public static final String ccoCkcheckBox="//label[text()[contains(.,'I here by declare that all the checks are fully verified and approved / rejected by me')]]";
	public static final String ccoSubmitBtn="//input[@value='Submit' and @name='submitStatus']";

	//public static final String ArrangeOKbtn="//*[@id='subTab1']/div/div/div[2]/div/div/div/div/form/div[2]/button[2]";
	
	/* navigate to DL fresh */
	public static final String DLLink = "//a[contains(@href,'#!/dlmodule')]";	
	public static final String APPLY_DLbtn ="//button[contains(.,'Click here to apply for Driving Licence')]";
	
	public static final String LLRApplicationNo = "LLRNumber";
	//public static final String DOB = "dt";
	public static final String searchBtn="//button[contains(.,'Search')]";
	public static final String view="//button[contains(.,'View')]";
	public static final String Next="//form/div[3]/button[@type='submit']";
	
	public static final String selectCOV="//label[contains(.,'Light Motor Vehicle Non Transport')]";
	public static final String covNext="//button[contains(.,'Back')]//following-sibling::button";
	
	/* PayU DL*/
	public static final String pay="paymentmethod";
	public static final String payInitialBtn="//input[@value='Pay']";
	public static final String paybtn="//button[contains(.,'Pay')]";
	public static final String expiryYear="expiryYear";
	
	
	
	

	public static final String HomePage="//h3[contains(text(), 'Welcome to RTA Portal'"; 
	public static final String ccoDD="//select[@ng-change='roleChange()']";
	public static final String MVIDlLink="(//p[contains(.,'Driving Licence')])[1]";
	public static final String llrAppNo="applicationNo";
	public static final String LLRApplicationNumber="//tbody/tr[1]/td[2]/span";
	public static final String Searchbtn="//button[contains(.,'Search')]";
	
	public static final String ApplicantDtls="//h3[contains(text(), 'Personal Details')]"; 
	
	public static final String addessbtn="//button[ @ng-click='isAddressFun()']";
	public static final String slotbtn="//button[ @ng-click='isSlotBookingFun()']";
	public static final String feebtn="//button[ @ng-click='isFeeDetailsFun()']";
	public static final String DLResult="applicationAllow";
	public static final String DLTestPass="result0";
	public static final String Comment="vehicleNo0";
	public static final String DLSubmit="//input[ @value='Submit']";
	
	public static final String DLStatus="//div[contains(text(),'DL Generated')]";
	public static final String DLNo="(.//div[@class='ui-grid-cell-contents ng-binding ng-scope'])[2]";
	
	public static final String LLRMelaChkBox ="//label[contains(.,'Indian')]";
	public static final String LLApplicationNumber ="//input[@name='aadhaar1']";
	//public static final String IAgreechkboxTest="//label[contains(.,'I Agree')]";
	public static final String NEXTbtnTest="//button[contains(text(),'Scan')]";
	
//	By rakesh 
	public static final String ScanFinger="//button[contains(.,'Scan')]";
	public static final String ChkBoxTest="//label[contains(.,'I Agree')]";
	public static final String SubmitbtnTest="//button[contains(text(),'Submit')]";
	
	public static final String LanguageTest="lanSelect";
	public static final String StartBtnTest="//a[contains(text(),'Start')]";
	public static final String SelectRadioBtn="//label[@class='radio-inline hindiText hindiTextQuestion unChooseAnswer']/input[@type='radio']";
	public static final String NextBtnTest="//a[contains(text(),'Next')]";
	public static final String TestStatus="//h2[contains(text(),'Result:')]/span";
	
	public static final String FatherName_MelaTest="//label[contains(.,'Son/Daughter/Wife/Care of')]/following-sibling::div/p/span[@class='me ng-binding']";
	public static final String Test_Date="//label[contains(.,'LLR Exam Date')]/..//span";
	
	/* navigate to LLR Re-Test Exam */
	public static final String ccoCheck = "//label[@for='cheDeclaration']";
	public static final String btnCCOSubmit = "//input[@name='submitStatus']";
	public static final String radioIndian = "//label[contains(text(),'Indian')]";
	public static final String ReTestBtn="//button[contains(text(),'Re-Test')]";

	public static final String ApplicationStatusChk="//a[contains(text(),'Application Status')]";
	public static final String ApplicationServiceType = "serviceType";
	public static final String ApplicationNumber="appNo";
	public static final String MobileNumber="mobileNo";
	public static final String SearchBtn="//button[@type='submit']";
	public static final String DownloadPDFBtn="//button[contains(text(),'Download')]";
	public static final String LLRNo="//span[@class='ng-binding ng-scope']";
	
	public static final String LLRIndianTest ="//label[contains(.,'Indian')]";
	public static final String LLRForeignerTest ="//label[contains(.,'Foreigner')]";
	public static final String PassportNumberTest="//input[@name='passportNo']";
	public static final String LLRScanBtnTest ="//button[contains(text(),'Scan')]";
	public static final String SubmitBtnTest="//button[contains(.,'Submit')]";
	public static final String LLRAadharTest ="aadhaar1";
	public static final String LLRAadhaarphotoTest ="//img[@id='FPImage1']";
	public static final String IAgreechkboxTest="//label[contains(.,'I Agree')]";
	/*LLR Mela*/
	public static final String LlrMelaImage ="//img[@src='assets/images/llr-mela.gif']";
	public static final String APPLY_LLRMelabtn ="//button[contains(.,'Click here to apply for Learner Licence')]";
	
	public static final String DistrictLLRMela ="(//span[@class='btn btn-default form-control ui-select-toggle'])[1]";
	public static final String DistrictMela="(//input[@type='search'])[1]";
	public static final String DistrictMelaSelect="//span[@class='ui-select-choices-row-inner']";
	
	public static final String MandalLLRMela ="(//span[@class='btn btn-default form-control ui-select-toggle'])[2]";
	public static final String MandalMela="(//input[@type='search'])[2]";
	public static final String MandalMelaSelect="//span[@class='ui-select-choices-row-inner']";
	
	public static final String TokenlMela="//input[@name='tokenNumber']";
	public static final String CtokenlMela="//input[@name='ctokenNumber']";
	public static final String MelaNxtBtn="//button[contains(text(),'Next')]"; 
	/*LLR Mela*/
	
	/* Details in Retest Exam */
    public static final String AppNumberRetest="//input[@name='appNo']";
    public static final String ConfAppNumberRetest="//input[@name='cappNo']";
    public static final String MobileNumberRetest="//input[@name='mobileNo']";
    public static final String NextBtnDetails="//button[@ng-click='doNext(appSearch.$valid)' and text()[contains(.,'Next')]]";
    public static final String LLRReTestRadio_BTN ="//label[text()[contains(.,'LLR Retest (if you failed the LLR exam)')]]";
    public static final String NationalityReTest ="//select[@name='nationality']";
    public static final String ReTestNextBtn ="//button[text()[contains(.,'Next')] and @ng-click='doNext(transactionTypeForm.$valid)']";

    public static final String freshDLChkbx="//label[contains(text(),'Fresh Driving Licence')]";
    public static final String freshDLNxtBtn="//button[text()[contains(.,'Next')] and @ng-click='doNext()']";
    public static final String DOBtextBx="dob";
    public static final String cntnuBtn="//button[contains(.,'Continue') and @ng-click='grid.appScope.gotoNext()']";
    public static final String DLDetailNxtBtn="//button[text()[contains(.,'Next')] and @ng-click='doNext(servicesForm.$valid)']";
    public static final String PayDLChkBx="//input[@name='paymentmethod' and @type='radio']";
    
    
//    Data validation in Payu Page
    public static final String DetailsValidationsName="(//h3[contains(text(),'Personal Details')])[2]/ancestor::div/.//td[1]";
    public static final String DetailsValidationsValue="(//h3[contains(text(),'Personal Details')])[2]/ancestor::div/.//td[2]";
    public static final String ClassOfVehicleList="//h3[contains(text(),'Chosen Class of Vehicle')]/ancestor::div/.//li[@ng-repeat='cov in llrFreshModel.slotDetailsVO.classVehicles']";
    
    
  //input RTA Admin for LLR MELA
//  public static final String CCOLogin="//button[@ng-click='authLogin()']";
  public static final String LLRMela ="//span[contains(text(),'LLR Mela')]";   //h3[contains(text(),'Guardian Details')]
  public static final String ApplicationSearch="//input[@name='applicationNumber']";
  public static final String AppSearch="//button[@class='btn btn-all submit-green-btn']";
  public static final String AllDetailsSerach="//a[contains(text(),'All Details')]";
  public static final String MELA_PersonalDetails="//h5[contains(text(),'Personal Details')]";
  public static final String DisplayNameMela="(//h5[contains(text(),'Personal Details')]/following-sibling::table/tbody/tr/td/p[@class='ng-binding'])[1]";
  public static final String FirstNameMela ="(//h5[contains(text(),'Personal Details')]/following-sibling::table/tbody/tr/td/p[@class='ng-binding'])[2]";
  public static final String LastNameMela ="(//h5[contains(text(),'Personal Details')]/following-sibling::table/tbody/tr/td/p[@class='ng-binding'])[3]";
  public static final String FatherNameMela ="(//h5[contains(text(),'Personal Details')]/following-sibling::table/tbody/tr/td/p[@class='ng-binding'])[4]";
  public static final String GenderMela ="(//h5[contains(text(),'Personal Details')]/following-sibling::table/tbody/tr/td/p[@class='ng-binding'])[5]";
  public static final String DOBMela ="(//h5[contains(text(),'Personal Details')]/following-sibling::table/tbody/tr/td/p[@class='ng-binding'])[9]";
  public static final String MobileNumberMela ="(//h5[contains(text(),'Personal Details')]/following-sibling::table/tbody/tr/td/p[@class='ng-binding'])[8]";
  public static final String EmailIdMela ="(//h5[contains(text(),'Personal Details')]/following-sibling::table/tbody/tr/td/p[@class='text-break ng-binding'])[1]";
  
  
  public static final String MELA_PresentAddress="//h5[contains(text(),'Present Address')]";
  public static final String Door_Number="(//h5[contains(text(),'Present Address')]/following-sibling::table/tbody/tr/td/p[@class='ng-binding'])[1]";
  public static final String Street_Number="(//h5[contains(text(),'Present Address')]/following-sibling::table/tbody/tr/td/p[@class='ng-binding'])[2]";
  public static final String Village_Area="(//h5[contains(text(),'Present Address')]/following-sibling::table/tbody/tr/td/p[@class='ng-binding'])[3]";
  public static final String Town_Area="(//h5[contains(text(),'Present Address')]/following-sibling::table/tbody/tr/td/p[@class='ng-binding'])[4]";
  public static final String Mandal_Area="(//h5[contains(text(),'Present Address')]/following-sibling::table/tbody/tr/td/p[@class='ng-binding'])[5]";
  public static final String Distric_Area="(//h5[contains(text(),'Present Address')]/following-sibling::table/tbody/tr/td/p[@class='ng-binding'])[6]";
  public static final String State_Area="(//h5[contains(text(),'Present Address')]/following-sibling::table/tbody/tr/td/p[@class='ng-binding'])[7]";
  public static final String Country_Area="(//h5[contains(text(),'Present Address')]/following-sibling::table/tbody/tr/td/p[@class='ng-binding'])[8]";
  public static final String Pincode_Area="(//h5[contains(text(),'Present Address')]/following-sibling::table/tbody/tr/td/p[@class='ng-binding'])[9]";
  
  
  
  public static final String ChooseVehicle="//h3[contains(text(),'Chosen Class of Vehicle')]";
  public static final String Vehicle1="//h3[contains(text(),'Chosen Class of Vehicle')]/following-sibling::div//li[contains(.,'')][1]";
  public static final String Vehicle2="//h3[contains(text(),'Chosen Class of Vehicle')]/following-sibling::div//li[contains(.,'')][1]";
  public static final String Vehicle3="//h3[contains(text(),'Chosen Class of Vehicle')]/following-sibling::div//li[contains(.,'')][1]";
  
  
  public static final String Test_Center="//h5[contains(text(),'Test Center')]";
  public static final String Test_CenterName="//h5[contains(text(),'Test Center')]/following-sibling::div/div/p[@class='ng-binding']";
  
  
  public static final String Check_List="//a[contains(text(),'Check List')]";
  public static final String Next_Button1="//p[contains(text(),'Next')]";
  public static final String Next_Button2="//p[contains(text(),'Next')]";
  public static final String Next_Button3="//p[@ng-click='nextStep()']";
  public static final String FitnessYes="//p[contains(text(),'Next')]";
  
  public static final String Medical_Certificate="//h3[contains(.,'Submitted Details')]";
  public static final String Name_of_Medical="//b[contains(text(),'Name of Medical Officer/Practitioner')]/../../following-sibling::div";
  public static final String Designation="//b[contains(text(),'Designation')]/../../following-sibling::div";
  public static final String Reg_No="//b[contains(text(),'Reg. No.')]/../../following-sibling::div";
  public static final String Identification_mark1="//b[contains(text(),'Identification mark 1')]/../../following-sibling::div"; 
  public static final String Identification_mark2="//b[contains(text(),'Identification mark 2')]/../../following-sibling::div";
  
  public static final String Check_box="//label[contains(text(),'I here by declare that all the checks are fully verified and approved / rejected by me')]";
  public static final String Submit="//input[contains(@name,'submitStatus')]";
  public static final String isDisabled="//td/p[contains(text(),'Is Differently Abled')]/../following-sibling::td/p";

  	public static final String CCOLogin="//button[@ng-click='authLogin()']";
	public static final String linkDashBoard = "//span[contains(text(),'Dashboard')]";
	public static final String linkLearnerLicence = "//p[contains(text(),'Learner Licence')]";
	public static final String linkLLREndorsement = "//p[contains(text(),'LLR Endorsement')]";
	public static final String btnRelease = "//input[@value='Release']";
	public static final String btnAssign = "//input[@value='Assign']";
  
//application search
	public static final String linkApplicationSearch = "//span[contains(text(),'Application Search')]";
	public static final String listBoxSelectModule = "//select[@name='servicelistcodes']";
	public static final String inputApplicationNum = "//input[@name='applicationNumber']";
	public static final String  btnSearch = "//button[@type='submit' and contains(text(),'Search')]";
	public static final String textReqAppNum = "//tbody/tr[@ng-repeat='acs in llrgriddata']/td[1]";
	
//  Aadhar Validation
	
	public static final String linkAadhaarValidation = "//span[contains(text(),'Aadhaar Validation')]";
	public static final String editAadhaar = "//input[@name='aadhaar1']";
	public static final String btnAadhaarSearch = "//button[@type='submit' and contains(text(),'Search')]";
	public static final String textActSlotDate = "//b[contains(text(),'Slot Date')]/..";
	public static final String btnScanFinger = "//input[@type='button' and @value='SCAN FINGER']";
	public static final String btnScanFinger1="//button[@ng-click='getDetailsByAadhaar()']";
	public static final String btnAuthenticate= "//button[@role='button' and contains(text(),'Authenticate')]";
	public static final String modalDialog = "//div[@class='modal-content']";
	public static final String dobPopupYes = "//div[@class='modal-content']/.//button[@type='submit' and contains(text(),'YES')]";
	public static final String btnPopupOK = "//button[@type='submit' and contains(text(),'OK')]";
	public static final String btnSubmitFinal = "//button[@type='submit' and contains(text(),'Submit')]";
	public static final String popupRadioCollection = "//div[@class='modal-content']/.//input[@type='radio']";
  
	public static final String LLRParentFirstNameReject="(.//label[text()[contains(.,'First Name')]]/following-sibling::input)[1]"; 
	public static final String LLRParentLastNameReject="(.//label[text()[contains(.,'Last Name')]]/following-sibling::input)[1]";
	public static final String LLRParentCareOfReject="(.//label[text()[contains(.,'Son/Daughter/Wife/Care of')]]/following-sibling::input)[1]";
	public static final String LLRParentDOBReject="(.//label[text()[contains(.,'Date of Birth (DD-MM-YYYY)')]]/following-sibling::input)[1]";
	public static final String LLRParentConformDOBReject="(.//label[text()[contains(.,'Confirm Date of Birth')]]/following-sibling::input)[1]";
//	public static final String LLRParentAdhaarPhoto="(//img[@id='FPImage1'])[2]";
//	public static final String Scanbtn2="(//input[@id='imagebtndiv'])[2]";
	public static final String IAgreeParentReject="//label[contains(.,'I Agree')]";
	public static final String NextbtnParentReject="(//button[contains(.,'Next')])[1]";
	
	public static final String Selected_DropDwon="//select[@name='lanSelect']";
	public static final String Language_Selected="//option[contains(.,'Telugu')]";
	public static final String Test_Start="//a[contains(text(),'Start')]";
		

	public static final String Application_Status="//a[contains(text(),'Application Status')]";
	public static final String re_Test="//select[@name='serviceType']";
	public static final String application_Number="//input[@name='appNo']";
	public static final String dateOfBirth="//input[@name='dob']";
	public static final String application_Search="//button[contains(text(),'Search')]";
	public static final String Mela_Re_test="//button[@class='btn btn-block btn-all btn-sm submit-btn ng-binding ng-scope']";



	//Citizen- Application Status
		public static final String linkAppStatus = "//a[contains(text(),'Application Status')]";
		public static final String radioWithAppNum = "//input[@type='radio' and @value='appNo']";
		public static final String radioWithOutAppNum = "//input[@type='radio' and @value='other']";
		public static final String listBoxSelectService = "//select[@name='serviceType']";
		public static final String inputAppNum = "//input[@name='appNo']";
		public static final String dtDOB = "//input[@name='dob']";
		public static final String inputFirstName = "";
		public static final String inputLastName = "";
		public static final String inputMobileNumber = "'";
		public static final String inputDOBwithOutApp = "//input[@name='dt']";
		public static final String errorDialog = "//div[@class='small-chat-box fadeInRight animated active']";
		public static final String textNoRecords = "//div[contains(text(),'No Records found')]";
		public static final String textAppStatus = "//tbody/tr/td/div/span";
		public static final String btnDownloadLLR = "//button[contains(text(),'Download LLR')]";
		public static final String LLRFreshPdfDownloadBtn ="//button[@ng-click='downloadLLRPdf(search.llrApplicationFormNo)']";
		
		public static final String btnReTest = "//button[contains(text(),'Re-Test')]";
		public static final String textTotalFee = "//tfoot/tr/td[2]/strong";
		public static final String radioPayU = "//input[@type='radio']";
		public static final String chkPayUAgree = "//label[@for='payUagreement']";
		public static final String btnPay = "//button[contains(text(),'Pay')]";
		public static final String btnRePay = "//button[contains(text(),'Re-Pay')]";
		public static final String btnVerifyPayment = "//button[contains(text(),'Verify Payment')]";
		public static final String btnTryAgain = "//button[contains(text(),'Try again')]";
		
		public static final String btnPay2 = "//input[@type='submit' and value = 'Pay']";
		
		public static final String debitOrCredit = "//span[contains(text(),'Credit/Debit Card')]";
		public static final String editCardNumber  = "//input[@name='cardNumber']";
		public static final String editExpiryDate = "//input[@name='expiryDate']";
		public static final String editExpiryYear = "//input[@name='expiryYear']";
		public static final String editCvv = "//input[@name='cvv']";
		public static final String btnPayUPay = "//button[@name='cardDetailsForm.payButton']";
		
		public static final String btnBookYourSlot = "//button[contains(text(),'Book Your Slot')]";
		public static final String textSlotBooking = "//h1[contains(text(),'Slot Booking')]";
		public static final String dtCalender = "//div[@ng-switch-when='day']/table[@role='grid']";
		public static final String textSelectedDate = "//b[contains(text(),'Selected Date :')]/following-sibling::span";
		public static final String textMonthName = "//button[@role='heading']/strong";
		public static final String btnCalenderPrevious = "//th/button/span[contains(text(),'previous')]";
		public static final String btnCalenderNext = "//th/button/span[contains(text(),'next')]/..";
		public static final String btnSubmit  = "//button[contains(text(),'Submit')]";
		
		
		
//		public static final String DLLink  ="//a[contains(@href,'#!/llrinstructions')]";
		public static final String FreshDLchkbx  ="//label[contains(text(),'Fresh Driving Licence')]";
		public static final String DLEndorsmentchkbx  ="//label[contains(text(),'Endorsement Driving Licence')]";
		public static final String DLNxtBtn="//button[@ng-click='doNext(serviceTypeForm.$valid)']";
		public static final String DLApplyBtn="//button[contains(text(),'Click here to apply for Driving Licence')]";
		public static final String DLllrNo="//input[@name='LLRNumber']";
		public static final String DLDOB="//input[@name='dob']";
		public static final String DLserchBtn="//button[@ng-click='searchByLlrDlApplicationNo(fresh_form.$valid)']";
		
		public static final String DLcontinue="//button[@ng-click='grid.appScope.gotoNext()']";
//		public static final String DLcontinue="(//div[@role='gridcell'])[6]/button";
		public static final String DLdetailNxtBtn="//button[@ng-click='doNext(servicesForm.$valid)']";
//MVI
		public static final String SelectRoleDD="//select[@ng-model='selectedRole']";
		public static final String DLGeneration="//span[contains(text(),'DL Generation')]";
		public static final String MVIappNoTxtBox="//input[@name='applicationNo']";
		public static final String MVIappSearchBtn="//button[@ng-click='searchApplication()']";
		public static final String MVAdhaarBtn="//input[@ng-click='doCheckAadhaar()']";
		public static final String MVAdhaarAuthBtn="//button[@ng-click='getDetailsByAadhaar()']";
		public static final String MVIEnterResultradioBtn="//label[contains(text(),'Enter Results')]";
		
		public static final String MVIAdhaarAuthdone="//b[contains(text(),'AADHAR AUTHENTICATED')]";
		public static final String MVIVichle1="//input[@name='vehicleNo0']";
		public static final String MVIVichle2="//input[@name='vehicleNo1']";
		public static final String MVIVichle3="//input[@name='vehicleNo2']";
		public static final String MVIPassRadioBtn1="//input[@id='result0']";
		public static final String MVIPassRadioBtn2="//input[@id='result1']";
		public static final String MVIPassRadioBtn3="//input[@id='result2']";
		public static final String MVISubmitBtn="//input[@ng-click='updateTestResult(examResult.$valid)']";

		public static final String editAppNum = "//input[@name='appNo']";
        public static final String editConfirmAppNum = "//input[@name='cappNo']";
        public static final String editMobileNum = "//input[@name='mobileNo']";
        public static final String btnNext2 = "(//button[contains(text(),'Next')])[2]";
        
        public static final String linkLicence = "(//a[contains(text(),'Licence')])[1]";
		public static final String linkLlrLicence = "//a[contains(@href,'#!/llrinstructions')]";
		public static final String btnApplyLLRLicence = "//button[contains(text(),'Click here to apply for Learner Licence')]";
		public static final String radioLlrReTest = "//input[@type='radio' and @value='llrretest']";
		public static final String btnNext =  "//button[contains(text(),'Next')]"; 
		
		public static final String MVIDLActionsServices="//span[contains(text(),'DL Actions Services')]";
		public static final String officeNumberField = "//select[@name='office']"; 
		public static final String MVIsearchBtn = "//button[@type='submit']";
		public static final String dlNumber = "//input[@name='dlNumber']";
		
		/*MVI Suspension,revocation and cancellation*/
		public static final String officMemoNumber = "//input[@name='officeMemoNumber']";
		public static final String clickMemoDateOnCal ="//button[@ng-click='open1()']";
		public static final String clickFromDateOnCal ="//button[@ng-click='open2()']";
		public static final String clickToDateOnCal ="//button[@ng-click='open3()']";
		public static final String clickReferenceDateOnCal ="//button[@ng-click='open4()']";
		public static final String clickOrderDateOnCal ="//button[@ng-click='open5()']";
		public static final String clickOnRevokeDateOnCal ="//button[@ng-click='open6()']";

		
		public static final String selectkDateinCal ="//button[@class='btn btn-default btn-sm active']";
		public static final String MVIRevokeReasonTxtBox = "//textarea[@name='reason']";
		public static final String fromDate = "//input[@name='fromDate']";
		public static final String toDate = "//input[@name='toDate']";
		public static final String source = "//input[@name='source']";
		public static final String refNumber = "//input[@name='referenceNumber']";
		public static final String refDate = "//input[@name='referenceDate']";         
		public static final String secRule = "//input[@name='sectionOrRule']";
		public static final String punishmentYesRadio = "//input[@name='punishment' and @value='true']";
		public static final String punishmentNoRadio = "//input[@name='punishment' and @value='false']";
		public static final String showCauseYesRadio = "//input[@name='showCauseIssued' and @value='true']";
		public static final String showCauseNoRadio  = "//input[@name='showCauseIssued' and @value='false']";
		public static final String orderNum = "//input[@name='orderNumber']";
		public static final String orderDate = "//input[@name='orderDate']";
		public static final String mviName = "//input[@name='mviName']";
		public static final String remarks = "//textarea[@name='remarks']";
		public static final String revocationDate = "//input[@name='revocationDate']";
		public static final String reason = "//input[@name='reason']";
		public static final String clear = "//button[@type='button']";
		public static final String suspensnSubmit = "//button[@ng-click='updateDLStatus(dlAction,suspensionForm.$valid)']";
		
		public static final String appSearchField = "//span[contains(text(),'Application Search')]";
		public static final String withApplicationNum = "//input[@type='radio' and @name='appsearch' and @value='appNo']";
		public static final String selectModule = "//select[@name='servicelistcodes']";
		public static final String appNumberSearchField = "//input[@ng-model='appNo']";
		public static final String appStatusField = "//div[@role='row']/div[4]/div";
		/* END of MVI Suspension,revocation and cancellation*/
		
		/*Renewal Sahu*/

		public static final String DLChangeOfAdd ="//label[contains(.,'Change Of Address')]";
		public static final String DLNext ="//button[@ng-click='doNext(serviceTypeForm.$valid)']";
		public static final String DLSearch_Btn="//button[@ng-click='searchByLlrDlApplicationNo(fresh_form.$valid)']";//doNext(appSearch.$valid)
		public static final String DL_endosment_Btn="//button[@ng-click='doNext(appSearch.$valid)']";
		public static final String endosment_nxt_Btn="//button[@ng-click='searchByLlrDlApplicationNo(fresh_form.$valid)']";
		public static final String linkDLCOA = "//p[contains(text(),'DL COA')]";		
		public static final String DLDuplicate ="//label[contains(.,'Duplicate of Licence')]";	
		public static final String DLEndorse ="//label[contains(.,'Endorsement Driving Licence')]";	
		public static final String linkDLDuplicate = "//p[contains(text(),'DL Duplicate')]";	
		public static final String DLRenewal ="//label[contains(.,'Renewal of Licence')]";	
		public static final String linkDLRenewal = "//p[contains(text(),'DL Renewal')]";
		
		public static final String IssueOfficeDD="//span[@class='btn btn-default form-control ui-select-toggle']";
		public static final String IssueOffice="(//input[@type='search'])[1]";
		public static final String IssueOfficeName="//span[@class='ui-select-choices-row-inner']";
		public static final String LLRExpNext_Btn="//button[@ng-click='doNext(appSearch.$valid)']";
		public static final String LLRExpApp_Btn="//button[@ng-click='doNext(basicApplicantDetailesForm.$valid)']";
		
		/*end of Renewal */
}


