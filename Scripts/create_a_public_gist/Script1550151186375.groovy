import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.url)

WebUI.click(findTestObject('dashboard/new_gist_button'))

WebUI.setText(findTestObject('create_gist_file/create_gist'), 'Test Create New Gist')

WebUI.setText(findTestObject('create_gist_file/gist_description_field'), 'Hallo Semua saya Eko Adi Prabowo')

WebUI.delay(5)

WebUI.click(findTestObject('create_gist_file/public_gist_button'))


WebUI.setText(findTestObject('create_gist_file/set_text'), 'saya Create Test Via Katalon Studio')


WebUI.delay(5)

WebUI.verifyTextPresent('Test Create New Gist', false)

WebUI.verifyTextPresent('Hallo Semua saya Eko Adi Prabowo', false)

WebUI.acceptAlert()

