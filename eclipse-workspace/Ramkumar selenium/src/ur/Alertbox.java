package ur;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver\\chromedriver_102.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.leafground.com/pages/Alert.html");

//alert box1
WebElement alertbox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
alertbox.click();
Alert alertnewbox = driver.switchTo().alert();
Thread.sleep(4000);
alertnewbox.accept();

//alertbox2
WebElement conformbox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
conformbox.click();
Alert conformalert = driver.switchTo().alert();
Thread.sleep(4000);
conformalert.accept();

//alertbox3
WebElement promptbox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
promptbox.click();
Alert prompalert = driver.switchTo().alert();
prompalert.sendKeys("UR SYSTEMS");
prompalert.accept();


	}



}
