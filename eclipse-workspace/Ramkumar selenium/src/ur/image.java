package ur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver\\chromedriver_102.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement brokenimage=driver.findElement(By.xpath("//*[@id=\"hplogo\"]"));
		if (brokenimage.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("the image broken");
		}
		else	
		{
			System.out.println("the image is not broken");
		}	
	}

}
	