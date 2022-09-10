package appiumpractice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalculatorPractices {
	
	@Test
	public void calculatorpractices() throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9 PKQ1.180904.001");
		dc.setCapability(MobileCapabilityType.UDID, "f5da163e");
		dc.setCapability("appPackage", "com.mini.calculator");
		dc.setCapability("appActivity", ".cal.DefaultCalculatorActivity");
	    URL url =new URL("http://localhost:4723/wd/hub");
	    AndroidDriver driver=new AndroidDriver(url, dc);
	     driver.findElement(By.id("com.miui.calculator:id/btn_5_s")).click();
	     driver.findElement(By.id("com.miui.calculator:id/btn_plus_s")).click();
	     driver.findElement(By.id("com.miui.calculator:id/btn_7_s")).click();
	     driver.findElement(By.id("com.miui.calculator:id/btn_equal_s")).click();
	    String value = driver.findElement(By.id("com.miui.calculator:id/listView")).getText();
	    System.out.println(value);
	    
	    
		
	}

}
