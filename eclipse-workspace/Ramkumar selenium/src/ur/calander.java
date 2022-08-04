package ur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver\\chromedriver_102.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		
		WebElement datasend=driver.findElement(By.id("datepicker"));
		datasend.click();
		
		WebElement nextbutton=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span"));
		nextbutton.click();
		
		WebElement datato=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[4]/a"));
		datato.click();
	}

}
