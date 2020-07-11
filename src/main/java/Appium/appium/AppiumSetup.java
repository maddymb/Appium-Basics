package Appium.appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class AppiumSetup {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		File file=new File(System.getProperty("user.dir"));
		File app= new File(file,"selendroid-test-app.apk");
		
		
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0.0");
		//cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		//cap.setCapability("appPackage", "com.amazon.mShop.android.shopping");
        //cap.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
        cap.setCapability("appPackage", "com.flipkart.android");
        cap.setCapability("appActivity", "com.flipkart.android.SplashActivity");
        
		
       
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		Thread.sleep(10000);
//		driver.findElement(By.id("com.flipkart.android:id/btn_skip")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("com.flipkart.android:id/search_widget_textbox")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("com.flipkart.android:id/search_autoCompleteTextView")).sendKeys("iphone");
		

	}

}
