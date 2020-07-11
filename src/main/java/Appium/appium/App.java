package Appium.appium;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.ios.IOSDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    
	
	//@Test
	public  void start() throws MalformedURLException
    {
		DesiredCapabilities capabilities = new DesiredCapabilities();
        
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", "iPhone XR");
        capabilities.setCapability("platformVersion", "12.0");
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "safari");
       // IOSDriver driver=new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        driver.get("https://www.google.com.mx/");
        System.out.println(driver.getTitle());
        
        System.err.println(driver.getContext());
        
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"TOP CHARTS\")"));
        
       
       // driver.longPressKey(67);
        
       // AndroidKeyCode.HOME
       /* Scrolling 
        * Swipe Flipboard
        * Tap
        * Zoom
        * Pinch
        * Long Press
        * Key Events -Home, Settings AndroidKeyCode
        * Chrome Scenarios
        * Hybrid and Native App ,,, Switch Context
        * Drag and drop
        * 
        TouchActions action = new TouchActions(driver);
        action.scroll(, 10, 100);
        action.perform();
        https://developer.android.com/reference/android/support/test/uiautomator/UiSelector
        */

    	
        
    }
}
