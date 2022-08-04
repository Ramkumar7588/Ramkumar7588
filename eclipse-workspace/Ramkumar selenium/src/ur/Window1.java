package ur;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver\\chromedriver_102.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		
		//window1
		String oldwindow=driver.getWindowHandle();
		WebElement homepage=driver.findElement(By.id("home"));
		homepage.click();
		Set<String>handles=driver.getWindowHandles();
		for(String newwindow:handles) {
			driver.switchTo().window(newwindow);
		}
		WebElement editbox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		editbox.click();
		driver.close();
		driver.switchTo().window(oldwindow);
		//window2
		WebElement multiwindow=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		multiplewindow.
		
		}
		
	}

}
