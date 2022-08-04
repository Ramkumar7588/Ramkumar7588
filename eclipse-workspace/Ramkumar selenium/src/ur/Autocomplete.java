package ur;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver\\chromedriver_102.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		
		WebElement input=driver.findElement(By.id("tags"));
		input.sendKeys("s");
		Thread.sleep(2000);
		List<WebElement>optionslist=driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		
		for(WebElement webElement:optionslist)
		{
		if(webElement.getText().equals("Web Services"));
		{
			webElement.click();
			break;
			
		}
					
		}
	}

}
