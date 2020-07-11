package Appium.appium;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AndroidScroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void androidScrollTouchAction(AndroidDriver driver) {
		
		//getting the screensize
		Dimension dim = driver.manage().window().getSize();
		//getting the x coordinate 
		int x = dim.getWidth()/2;
		// for scrolling up
		int startY= (int)(dim.getHeight()*0.8);
		int endY = (int)(dim.getHeight()*0.2);
		
		//creating the object of touchaction class
		TouchAction objTA = new TouchAction(driver);
		
		/* it will press the starting coordinates and then wait for 1000 milisec 
		and then it will move to ending elemwnt */
		objTA.press(PointOption.point( x,startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		.moveTo(PointOption.point(x,endY)).release().perform();
		
		
		// Touch Action: The Appium way - Not reliable though!
		// we need to call it more time if we wanto to scroll more
		
	}
	
	public static void androidScrollTouchAction(AndroidDriver driver,String direction) {
		//getting the screensize
		Dimension dim = driver.manage().window().getSize();
		//getting the x coordinate 
		int x = dim.getWidth()/2;
		int startY= 0;
		int endY = 0;
		
		switch(direction) {
		case "up":
			startY= (int)(dim.getHeight()*0.8);
			endY = (int)(dim.getHeight()*0.2);
			break;
		case "down":
			startY= (int)(dim.getHeight()*0.2);
			endY = (int)(dim.getHeight()*0.8);
			break;
		}
		
		//creating the object of touchaction class
		TouchAction objTA = new TouchAction(driver);
				
		/* it will press the starting coordinates and then wait for 1000 milisec 
		and then it will move to ending elemwnt */
		objTA.press(PointOption.point( x,startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		.moveTo(PointOption.point(x,endY)).release().perform();
	
	}
	
	public static MobileElement scrollToElement(AndroidDriver driver) {
		
		return (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().text(\"Arcs\")).scrollIntoView(new UiSelector().text(\"Patterns\"));"));
		
	}
	
	
	

}
