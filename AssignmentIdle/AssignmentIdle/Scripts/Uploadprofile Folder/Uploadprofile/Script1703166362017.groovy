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

WebUI.click(findTestObject('Object Repository/Page_Situs Jual Beli Online Terlengkap, Mud_c2d1e5/button_Masuk'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Situs Jual Beli Online Terlengkap, Mud_c2d1e5/button_Masuk'))

WebUI.setText(findTestObject('Object Repository/Page_Situs Jual Beli Online Terlengkap, Mud_c2d1e5/input_Nomor HP atau Email_email-phone'), 
    'cust1xlhome.4371@gmail.com')

WebUI.sendKeys(findTestObject('Object Repository/Page_Situs Jual Beli Online Terlengkap, Mud_c2d1e5/input_Nomor HP atau Email_email-phone'), 
    Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Situs Jual Beli Online Terlengkap, Mud_c2d1e5/input_Kata Sandi_password-input'), 
    'AZYBKPBMNM45FpKXNkFF4w==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Situs Jual Beli Online Terlengkap, Mud_c2d1e5/input_Kata Sandi_password-input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Situs Jual Beli Online Terlengkap, Mud_c2d1e5/div_E-mail ke cg.com'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Situs Jual Beli Online Terlengkap, Mud_c2d1e5/img_Toko_css-13emzbn'))

WebUI.uploadFile(findTestObject('Page_Biodata Diri  Tokopedia/input_Al_profilePicture'), 'C:\\Users\\Hp\\Downloads\\d1bea437-09c3-4e19-9123-3bbc2adf3523-removebg-preview')

