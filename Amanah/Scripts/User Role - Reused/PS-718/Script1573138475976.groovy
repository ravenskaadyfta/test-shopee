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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'ravenskalib.goToUrl'()

CustomKeywords.'ravenskalib.loginCS'()

WebUI.delay(1)

WebUI.click(findTestObject('menuIdentity'))

WebUI.delay(1)

WebUI.click(findTestObject('Role/userRole'))

WebUI.delay(1)

WebUI.setText(findTestObject('Role/fieldNameSearch'), 'DEFAULT MOBILE')

WebUI.delay(0)

WebUI.click(findTestObject('search'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Role/scroll'), 2)

WebUI.delay(1)

CustomKeywords.'ravenskalib.logout'()

