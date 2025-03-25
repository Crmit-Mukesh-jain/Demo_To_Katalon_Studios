package packages_001
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable
import java.awt.TexturePaintContext.Int
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testdata.ExcelData

class EmployeeKeyword001 {
	/**
	 * Refresh browser
	 */
	@Keyword
	def refreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

	@Keyword
	def getTheDropdownValue(String leave_Type_Excel) {
		TestObject dropdown = new TestObject()
		dropdown.addProperty("xpath", ConditionType.EQUALS, "//button[contains(@class, 'slds-combobox__input')]")
		WebUI.click(dropdown)

		// Wait for options to be visible
		WebUI.waitForElementVisible(findTestObject('Object Repository/Emplyoee_Objects/Apply Leave/Drop_Down_Value_Selection'), 5)

		// Select a dynamic option
		String optionText = leave_Type_Excel  // Change this value as needed
		TestObject dropdownOption = new TestObject()
		dropdownOption.addProperty("xpath", ConditionType.EQUALS, "//span[text()='" + optionText + "']")
		WebUI.click(dropdownOption)
	}

	@Keyword
	def setSummaryText(String Emp_Name, Number days, String leave_type, Date fromDate , Date toDate) {
		String text = Emp_Name + 'is applied' + days+','+ leave_type + 'from' + fromDate + 'to' + toDate + 'is rejected because' + Emp_Name + 'have already taken those leaves'

		TestObject dropdownOption = new TestObject()
		dropdownOption.addProperty("xpath", ConditionType.EQUALS, "//span[text()='" + text + "']")
	}
}