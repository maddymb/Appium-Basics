package Appium.appium;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

/**
 * Hello world!
 *
 */
public class DialerTest 
{
    
	//@Test
	public  void start() throws MalformedURLException
    {
		DesiredCapabilities capabilities = new DesiredCapabilities();
        
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "moto");
        capabilities.setCapability("platformVersion", "8.0.0");
        capabilities.setCapability("noreset", "false");
        
        //phone book 
    //    capabilities.setCapability("appPackage", "com.android.contacts");
      //  capabilities.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
        
        
        // dialer	
      //  capabilities.setCapability("appPackage", "com.android.dialer");
       // capabilities.setCapability("appActivity", "com.android.dialer.DialtactsActivity");
        
       // capabilities.setCapability("appPackage", "com.flipkart.android");
        //capabilities.setCapability("appActivity", "com.flipkart.android.SplashActivity");
        
      //  capabilities.setCapability("appPackage", "com.bt.bms");
      //  capabilities.setCapability("appActivity", "com.movie.bms.design_v3.ui.activities.MainActivity_v3");
        
        
       AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
     //  driver.get("https://www.google.com.mx/");
      // System.out.println(driver.getTitle());
       

       //driver.findElement(By.className("android.view.View")).click();
    	
       
       
       
        
    }
}
