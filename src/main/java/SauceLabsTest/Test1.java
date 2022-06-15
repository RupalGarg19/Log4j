package SauceLabsTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test1 {
	
	public static final String USERNAME = "oauth-rupal.garg-f60fb";
	public static final String ACCESS_KEY = "da4db2e9-95a2-46b9-a7a6-0f40cc980d15";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserName", "Chrome");
		caps.setCapability("platformName", "Windows 10");
		caps.setCapability("browserVersion", "101");
		caps.setCapability("name", "SauceLabsTest1");

		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal.garg\\Desktop\\drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		
		System.out.println("--- Test Started ---");
//		driver.get("https://www.google.co.in/");
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.makemytrip.com/");		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
//		driver.findElement(By.name("q")).sendKeys("amazon");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		List<WebElement> s = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
//		for(WebElement s1 : s) {
//			if(s1.getText().equalsIgnoreCase("amazon")) {
//				s1.click();
//				break;
//			}
//		}
		System.out.println("Title : "+driver.getTitle());
		driver.quit();
		System.out.println("--- Test Completed ---");
		
	}
	  
	
}
