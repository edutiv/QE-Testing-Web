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

WebUI.click(findTestObject('Admin/Dashboards/Course/Add Course/btn_add course'))

WebUI.setText(findTestObject('Admin/Dashboards/Course/Add Course/txt_course name'), 'coba coba')

WebUI.setText(findTestObject('Admin/Dashboards/Course/Add Course/txt_course url'), 'https://commons.wikimedia.org/wiki/File:Common_moorhen_building_nest.webm')

WebUI.click(findTestObject('Admin/Dashboards/Course/Add Course/btn_course category'))

WebUI.click(findTestObject('Admin/Dashboards/Course/Add Course/btn_mobile'))

WebUI.setText(findTestObject('Admin/Dashboards/Course/Add Course/txt_deskripsi'), 'pppppppp')

WebUI.setText(findTestObject('Admin/Dashboards/Course/Add Course/txt_total video'), '2')

WebUI.setText(findTestObject('Admin/Dashboards/Course/Add Course/txt_total times'), '2h 34m')

WebUI.click(findTestObject('Admin/Dashboards/Course/Add Course/submit_add course'))

WebUI.setText(findTestObject('Admin/Dashboards/Course/Add Course/txt_section name'), 'testing doang')

WebUI.click(findTestObject('Admin/Dashboards/Course/Add Course/submit_add section'))

WebUI.click(findTestObject('Admin/Dashboards/Course/Add Course/btn_material type'))

WebUI.click(findTestObject('Admin/Dashboards/Course/Add Course/btn_slide'))

WebUI.setText(findTestObject('Admin/Dashboards/Course/Add Course/txt_material name'), 'halooo')

WebUI.setText(findTestObject('Admin/Dashboards/Course/Add Course/txt_material url'), 'https://akuakuakuakua')

WebUI.click(findTestObject('Admin/Dashboards/Course/Add Course/submit_add material'))

WebUI.click(findTestObject('Admin/Dashboards/Course/Add Course/btn_ok'))

