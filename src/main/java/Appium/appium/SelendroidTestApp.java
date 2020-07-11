package Appium.appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Hello world!
 *
 */
public class SelendroidTestApp 
{
	File file=new File(System.getProperty("user.dir"));
	File app= new File(file,"selendroid-test-app.apk");
	
	
	
//	@Test
	public  void bmsTest() throws MalformedURLException, InterruptedException
    {
		
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "pixel 2l");
        capabilities.setCapability("platformVersion", "8.1.0");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "50");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
       
      
       AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

  
       
     driver.findElement(By.id("buttonStartWebviewCD")).click();
     driver.findElement(By.id("io.selendroid.testapp:id/spinner_webdriver_test_data")).click();

     
     List<MobileElement> li=driver.findElements(By.id("android:id/text1"));
     System.err.println(li.size());
     
     li.get(4).click();
    
     
     driver.findElement(By.id("io.selendroid.testapp:id/goBack")).click();
     driver.findElement(By.id("my_text_fieldCD")).sendKeys("madhur");
     
     driver.findElement(By.id("buttonTestCD")).click();
     
     driver.findElement(By.id("android:id/button1")).click();
     
     driver.quit();
     
     
     
       
       
    }
}
