package TestNGsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class continuebrowser {
WebDriver driver;
long starttime;
long endtime;
long totaltime;
@BeforeSuite
public void browserlaunch()
{
	long starttime=System.currentTimeMillis();
	System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver\\chromedriver_102.exe");
	 driver=new ChromeDriver();
}
@Test
public void opengoogle()
{
	driver.get("https://www.google.com/");
}

@Test
public void openyahoo()
{
	driver.get("https://www.yahoo.com/");
}
@Test
public void openbing()
{
	driver.get("https://www.bing.com/");
}
@AfterSuite
public void afterlaunch()
{
	long endtime=System.currentTimeMillis();
	long totaltime=endtime-starttime;
	System.out.println(totaltime);
}

}