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

WebUI.click(findTestObject('Admin/Dashboards/Member/Add member/btn_add member'))

WebUI.setText(findTestObject('Admin/Dashboards/Member/Add member/txt_lastname'), 'ratna')

WebUI.setText(findTestObject('Admin/Dashboards/Member/Add member/txt_email'), 'ratna3@gmail.com')

WebUI.setText(findTestObject('Admin/Dashboards/Member/Add member/txt_password'), 'qwer1234')

WebUI.setText(findTestObject('Admin/Dashboards/Member/Add member/txt_confirm password'), 'qwer1234')

WebUI.click(findTestObject('Admin/Dashboards/Member/Add member/btn_specialist'))

WebUI.click(findTestObject('Admin/Dashboards/Member/Add member/btn_mobile'))

WebUI.click(findTestObject('Admin/Dashboards/Member/Add member/submit_add member'))

WebUI.click(findTestObject('Admin/Dashboards/Member/Add member/btn_ok'))

