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

WebUI.navigateToUrl('https://qaidpserver.azurewebsites.net/Account/Login?ReturnUrl=%2Fconnect%2Fauthorize%2Fcallback%3Fclient_id%3DuBooksweb2%26redirect_uri%3Dhttp%253A%252F%252Ficsqa2664114819000.centralindia.cloudapp.azure.com%253A1025%252Flayout%26response_type%3Dcode%26scope%3Dopenid%2520profile%2520api1%2520offline_access%26state%3D19cad792fa394ee9bc01084301b70d8e%26code_challenge%3DLvd2wSonqiB3hcaFaqE8dqi552b62RCuA9Wcesf-_XY%26code_challenge_method%3DS256%26response_mode%3Dquery')

WebUI.setText(findTestObject('Object Repository/LoginandLogout/input_Username_Username'), 'westside')

WebUI.setEncryptedText(findTestObject('Object Repository/LoginandLogout/input_Password_Password'), 'UKPLWVgKcSv8CzucDgEysg==')

WebUI.click(findTestObject('Object Repository/LoginandLogout/button_Sign In'))

WebUI.verifyElementText(findTestObject('Object Repository/LoginandLogout/label_Dashboard'), 'Dashboard:')

WebUI.click(findTestObject('Object Repository/LoginandLogout/path'))

WebUI.click(findTestObject('Object Repository/LoginandLogout/a_Logout'))

WebUI.closeBrowser()

