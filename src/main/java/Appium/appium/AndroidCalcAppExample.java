/*package Appium.appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AndroidCalcAppExample {
	WebDriver driver;
    AppiumDriverLocalService appiumService;
    String appiumServiceUrl;
    
	@BeforeTest
	public void setUp() throws MalformedURLException {
		
		String Appium_Node_Path="C:/Program Files/Appium/node.exe";
		String Appium_JS_Path="C:/Program Files/Appium/node_modules/appium/bin/appium.js";
		AppiumDriverLocalService appiumService;

		appiumService = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().
			                usingAnyFreePort().usingDriverExecutable(new File(Appium_Node_Path)).
			                withAppiumJS(new File(Appium_JS_Path)));
		appiumService.start();
        
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "8d75c47d");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		
	//	driver = new AndroidDriver<>(new URL(appiumServiceUrl), capabilities);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void Sum() {
		System.out.println("Calculate sum of two numbers");
		// Locate elements to enter data and click +/= buttons
		driver.findElement(By.xpath("//*[@text='1']")).click();
		driver.findElement(By.xpath("//*[@text='+']")).click();
		driver.findElement(By.xpath("//*[@text='2']")).click();
		driver.findElement(By.xpath("//*[@content-desc='equals']")).click();

		// Get the result text
		WebElement sumOfNumbersEle = driver.findElement(By.className("android.widget.EditText"));
		String sumOfNumbers = sumOfNumbersEle.getText();

		// verify if result is 3
		Assert.assertTrue(sumOfNumbers.endsWith("3"));
	}

	@AfterTest
	public void End() {
		System.out.println("Stop driver");
		driver.quit();
		System.out.println("Stop appium service");
		appiumService.stop();
	}

}*/
