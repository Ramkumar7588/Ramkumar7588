package ur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver\\chromedriver_102.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");
		
		WebElement upload=driver.findElement(By.name("filename"));
		upload.sendKeys("C:\\Users\\RAMKUMAR\\Downloads\\Olympic Athletes.xlsx");
		
	}

}