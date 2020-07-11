package Appium.appium;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AppiumServer {

	private static AppiumDriverLocalService server;
	
	// losf -P | grep ':4723' | awk '{print $2}' | xargs kill -9
	
	public AppiumDriverLocalService getAppiumServerDefault() {
		return AppiumDriverLocalService.buildDefaultService();
	}
	
	public static AppiumDriverLocalService getAppiumService() {
		HashMap<String, String> environment = new HashMap<String, String>();
		environment.put("PATH", "/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/bin:/Users/Om/Library/Android/sdk/tools:/Users/Om/Library/Android/sdk/platform-tools:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin" + System.getenv("PATH"));
		environment.put("ANDROID_HOME", "/Users/Om/Library/Android/sdk");
		return AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.usingDriverExecutable(new File("/usr/local/bin/node"))
				.withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
				.usingPort(4723)
				.withArgument(GeneralServerFlag.SESSION_OVERRIDE)
	//			.withEnvironment(environment)
				.withLogFile(new File("ServerLogs/server.log")));
	}
	
	public void start() {
		server = getAppiumService();
		server.start();
		System.out.println("Started");
		
	}
	
	
	
	public static void main(String args[]) {
		
		server = getAppiumService();
		server.start();
		System.out.println("Started");
		server.stop();
		System.out.println("Stopped");
		
		
	}

}
