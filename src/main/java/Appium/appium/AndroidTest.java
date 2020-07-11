package Appium.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AndroidTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		
		// we can give platformVersion or we can give udid also 
		
		//desiredCapabilities.setCapability("platformVersion", "8.0.0");
		desiredCapabilities.setCapability("udid", "emulator-5554");
		
		desiredCapabilities.setCapability("deviceName", "Nexus");
		
/*		Appium UiAutomator2 Driver is a test automation framework for Android devices. 
		Appium UiAutomator2 Driver automates native, hybrid and mobile web apps, tested on emulators and real devices. 
		Appium UiAutomator2 Driver is part of the Appium mobile test automation tool.*/
		
		desiredCapabilities.setCapability("automationName", "UiAutomator2");
	
		// app will be installed externally in every run
		desiredCapabilities.setCapability("app", "/Users/maddy/Downloads/ApiDemos-debug.apk");

		//desiredCapabilities.setCapability("app", "/Users/maddy/eclipse-workspace/Appium Basics/BookMyShow.apk");

		
		// if the app is already installed then we can work with appPackage and appActivity
		//desiredCapabilities.setCapability("appPackage", "io.appium.android.apis");
		//desiredCapabilities.setCapability("appActivity", ".ApiDemos");
		
		// by giving avd it will automatically open the emulator , no need to open it manually
		desiredCapabilities.setCapability("avd", "Nexus_5X_API_26");
		
		//to work with browsers
		//desiredCapabilities.setCapability("browserName", "Chrome");
		
		// server url for appium
		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		// Android driver to work with android devices
		AndroidDriver driver = new AndroidDriver(url, desiredCapabilities);
		
		// for getting the session id
		String sessionId = driver.getSessionId().toString();
		System.out.println(sessionId);
	
		System.out.println(driver.getStatus());
		System.out.println(driver.getBatteryInfo());
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[5]\n")).click();;
		
		// for working with text available on element
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Graphics\")")).click();
		
		
		Thread.sleep(2000);
		AndroidScroll.androidScrollTouchAction(driver);
		AndroidScroll.androidScrollTouchAction(driver,"down");
		AndroidScroll.androidScrollTouchAction(driver,"up");
		AndroidScroll.androidScrollTouchAction(driver,"up");
		Thread.sleep(2000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Patterns\")")).isDisplayed();
		
		//AndroidScroll.scrollToElement(driver);
		
		
	//	MobileElement ele = AndroidScroll.scrollToElement(driver);
	//	ele.getLocation();
		
		
		Thread.sleep(2000);
		// for working with keys
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		Thread.sleep(4000);
		driver.pressKey(new KeyEvent(AndroidKey.CONTACTS));
		
		/*
		Thread.sleep(5000);
		
		MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("Chrome");
	    el6.click();
	    MobileElement el7 = (MobileElement) driver.findElementById("com.android.chrome:id/search_box_text");
	    el7.sendKeys("123");
	    
	    MobileElement el8 = (MobileElement) driver.findElementByXPath("//android.support.v7.widget.RecyclerView[@content-desc=\"New tab\"]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[5]");
	    el8.click();*/
		
		System.out.println("Madhur is Hero");

	    

	}

}
