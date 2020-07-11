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
import io.appium.java_client.ios.IOSDriver;

public class iOSTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "iOS");
			
		// we can give platformVersion or we can give udid also 
		
		desiredCapabilities.setCapability("platformVersion", "13.5");
		//desiredCapabilities.setCapability("udid", "emulator-5554");
		
		desiredCapabilities.setCapability("deviceName", "iPhone 11");
		
		desiredCapabilities.setCapability("automationName", "XCUITest");
		
	//	desiredCapabilities.setCapability("bundleId", "com.apple.mobilecal");
	
		// app will be installed externally in every run
		desiredCapabilities.setCapability("app", "/Users/maddy/eclipse-workspace/AppiumFrameworkSuper/apps/iOS_SauceLabs.app");

		// server url for appium
		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		// Android driver to work with android devices
		IOSDriver driver = new IOSDriver(url, desiredCapabilities);
		

		// for getting the session id
		String sessionId = driver.getSessionId().toString();
		System.out.println(sessionId);
	
		
		System.out.println("Madhur is Hero");

	    

	}

}
