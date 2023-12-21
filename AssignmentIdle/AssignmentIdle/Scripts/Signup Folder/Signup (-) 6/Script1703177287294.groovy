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

WebUI.navigateToUrl('https://www.tokopedia.com/')

WebUI.click(findTestObject('Object Repository/Page_Situs Jual Beli Online Terlengkap, Mud_c2d1e5/button_Daftar'))

WebUI.setText(findTestObject('Object Repository/Page_Daftar  Tokopedia/input_Phone Number or Email_regis-input'), 'testingxl.9030@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Daftar  Tokopedia/span_Daftar'))

WebUI.click(findTestObject('Object Repository/Page_Daftar  Tokopedia/span_Ya, Benar'))

WebUI.click(findTestObject('Object Repository/Page_Verifikasi/div_E-mail ke testingxl.9030gmail.com'))

WebUI.setText(findTestObject('Object Repository/Page_Verifikasi/input_Kode verifikasi telah dikirim melalui_79dd53'), '758587')

WebUI.setText(findTestObject('Object Repository/Page_Daftar  Tokopedia/input_Nama Lengkap_regis-fullname'), 'ab')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Daftar  Tokopedia/input_Kata Sandi_regis-password'), 'GV3tfZxZCWWWSMMPL41DoAAvR7qAl1Yj')

WebUI.verifyElementPresent(findTestObject('Page_Daftar  Tokopedia/p_Nama lengkap terlalu pendek, minimum 3 karakter'), 0)

