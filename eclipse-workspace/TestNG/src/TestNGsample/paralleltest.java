package TestNGsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class paralleltest {
	@Test
	public void opengoogle() {
	
	System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver\\chromedriver_102.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
}
@Test
public void openyahoo() {

System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver\\chromedriver_102.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.yahoo.com/");
}
}