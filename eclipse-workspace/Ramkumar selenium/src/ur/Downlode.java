package ur;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class Downlode {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver\\chromedriver_102.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement downlodelink=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div/div/div/a[1]"));
		downlodelink.click();
		Thread.sleep(200);
		
	File filelocation=new File("C:\\Users\\RAMKUMAR\\Downloads");
	File[] totalfiles=filelocation.listFiles();
	for(File file:totalfiles)
	{
if(file.getName().equals("testleaf.xlsx"));
{
	System.out.println("file is download");
}
	}
	

	}

}
