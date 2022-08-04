package ur;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver\\chromedriver_102.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.leafground.com/pages/sortable.html");


List<WebElement>selctable=driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
WebElement fromelement=selctable.get(5);
WebElement toelement=selctable.get(2);
Actions action=new Actions(driver);
action.dragAndDrop(fromelement, toelement).build().perform();





		
	}

}
