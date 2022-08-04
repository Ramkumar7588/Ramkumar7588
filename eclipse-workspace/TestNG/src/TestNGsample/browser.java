package TestNGsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class browser {
	@Test
	public void openbrowser()
	{
		long starttime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver\\chromedriver_102.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
		long endtime=System.currentTimeMillis();
		long totaltime=endtime-starttime;
		System.out.println(totaltime);

	}
}
