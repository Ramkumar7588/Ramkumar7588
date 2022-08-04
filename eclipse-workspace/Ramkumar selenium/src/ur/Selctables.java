package ur;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selctables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver\\chromedriver_102.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		List<WebElement> selctable=driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		int listsize=selctable.size();
		System.out.println(listsize);
		
		WebElement action=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li"));
		Actions actions=new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(((List<WebElement>)selctable).get(6))
		.click(((List<WebElement>)selctable).get(2))
		.click(((List<WebElement>)selctable).get(3)).build().perform();
		
		
		
		
	}

}
