package appiumpractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Network {
	@Test
	public void network() throws MalformedURLException{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9 PKQ1.180904.001");
	dc.setCapability(MobileCapabilityType.UDID, "f5da163e");
   // dc.setCapability("appPackage","io.appium.android.apis");
  //  dc.setCapability("appActivity",".ApiDemos");
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url, dc);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	Connection connect = driver.getConnection();
	//System.out.println(connect);
	//driver.setConnection(connect.AIRPLANE);
	//driver.setConnection(connect.DATA);
//	driver.setConnection(connect.WIFI);
	
	}
}
