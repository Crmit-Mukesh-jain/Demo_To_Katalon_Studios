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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Calendar as Calendar
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testdata.ExcelData as ExcelData

WebUI.openBrowser('')

WebUI.maximizeWindow()

CustomKeywords.'packages_001.login.goToLogin'()

WebUI.enhancedClick(findTestObject('Emplyoee_Objects/My_Leaves'))

//WebUI.enhancedClick(findTestObject('Emplyoee_Objects/Leave_Balance_Selection'))
WebUI.enhancedClick(findTestObject('Emplyoee_Objects/Apply Leave/Start Date Leave'))

// Define the Date Format
SimpleDateFormat sdf = new SimpleDateFormat('MM/dd/yyyy')

// Get Current Date
Calendar calendar = Calendar.getInstance()

String currentDate = sdf.format(calendar.getTime())

// Get Date Two Days Ahead
calendar.add(Calendar.DATE, 2)

String futureDate = sdf.format(calendar.getTime())

// Select Date Picker and Input Values
WebUI.setText(findTestObject('Emplyoee_Objects/Apply Leave/Start Date Leave'), currentDate)

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Emplyoee_Objects/Apply Leave/End Date Leave'))

WebUI.setText(findTestObject('Emplyoee_Objects/Apply Leave/End Date Leave'), futureDate)

WebUI.delay(5)

CustomKeywords.'packages_001.EmployeeKeyword001.getTheDropdownValue'(findTestData('EDEN/QuickEntryData').getValue(3, 1))

WebUI.delay(10)

WebUI.enhancedClick(findTestObject('Emplyoee_Objects/Apply Leave/Leave Reason'))

WebUI.setText(findTestObject('Emplyoee_Objects/Apply Leave/Leave Reason'), Reason)

WebUI.enhancedClick(findTestObject('Emplyoee_Objects/Apply Leave/Infrom Leave'))

WebUI.setText(findTestObject('Emplyoee_Objects/Apply Leave/Infrom Leave'), Inform)

WebUI.delay(5)

WebUI.takeFullPageScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Emplyoee_Objects/Apply Leave/Apply Button'))

WebUI.takeFullPageScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('Emplyoee_Objects/Apply Leave/Confirm Button'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('Emplyoee_Objects/All Leaves Section/All Leaves Tab'))

WebUI.enhancedClick(findTestObject('Emplyoee_Objects/All Leaves Section/Sort an Element'))

WebUI.enhancedClick(findTestObject('Emplyoee_Objects/All Leaves Section/Sort an Element'))

WebUI.click(findTestObject('Emplyoee_Objects/All Leaves Section/Select the first Item'))

WebUI.takeFullPageScreenshot(GlobalVariable.Username)

WebUI.delay(5)

WebUI.closeBrowser()

