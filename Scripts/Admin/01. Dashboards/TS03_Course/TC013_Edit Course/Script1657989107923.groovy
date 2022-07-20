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

WebUI.click(findTestObject('Admin/Dashboards/Course/Edit Course/btn_edit'))

WebUI.setText(findTestObject('Admin/Dashboards/Course/Edit Course/update_course name'), 'testing')

WebUI.setText(findTestObject('Admin/Dashboards/Course/Edit Course/update_course url'), 'https://commons.wikimedia.org/wiki/File:Common_moorhen_building_nest.webm')

WebUI.click(findTestObject('Admin/Dashboards/Course/Edit Course/update_course category'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin/Dashboards/Course/Add Course/btn_uiux'))

WebUI.setText(findTestObject('Admin/Dashboards/Course/Edit Course/update_deskripsi'), 'ini cuma testing doang')

WebUI.setText(findTestObject('Admin/Dashboards/Course/Edit Course/update_total video'), '4')

WebUI.setText(findTestObject('Admin/Dashboards/Course/Edit Course/update_time'), '3h 8m')

WebUI.click(findTestObject('Admin/Dashboards/Course/Edit Course/submit_update course'))

WebUI.click(findTestObject('Admin/Dashboards/Course/Edit Course/update_ok'))

