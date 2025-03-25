import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

CustomKeywords.'packages_001.login.goToLogin'()

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.delay(5)


WebUI.enhancedClick(findTestObject('Emplyoee_Objects/All Leaves Section/All Leaves Tab'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('Manager_Objects/Select Dropdown trigger'))

WebUI.enhancedClick(findTestObject('Manager_Objects/Select Approvals'))

WebUI.enhancedClick(findTestObject('Manager_Objects/Select Pending Approval'))


WebUI.delay(5)


String Emp_Name = WebUI.getAttribute(findTestObject('Object Repository/Manager_Objects/Page_Employee Leave EL-4385/div_EmployeeChaithra K N'), 'value')
String Duration = WebUI.getAttribute(findTestObject('Object Repository/Manager_Objects/Page_Employee Leave EL-4385/div_Duration(In days)3.00'), 'value')
String S_Date = WebUI.getAttribute(findTestObject('Object Repository/Manager_Objects/Page_Employee Leave EL-4385/div_Start Date332025'), 'value')
String  E_Date = WebUI.getAttribute(findTestObject('Object Repository/Manager_Objects/Page_Employee Leave EL-4385/div_End Date352025'), 'value')
String L_Type = WebUI.getAttribute(findTestObject('Object Repository/Manager_Objects/Page_Employee Leave EL-4385/div_Leave TypePrivilegeAnnual Leave'), 'value')

System.out.println(Emp_Name, Duration, L_Type, S_Date, E_Date)

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('Manager_Objects/button_Reject'))

WebUI.enhancedClick(findTestObject('Manager_Objects/textarea__Message'))

CustomKeywords.'packages_001.EmployeeKeyword001.setSummaryText'(Emp_Name, Duration, L_Type, S_Date, E_Date)

WebUI.setText(findTestObject('Manager_Objects/textarea__Message'), 'Rejected , Only Work')

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.delay(5)

WebUI.closeBrowser()

