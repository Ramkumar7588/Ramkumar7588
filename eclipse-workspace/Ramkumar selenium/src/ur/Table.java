package ur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver\\chromedriver_102.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		
		List<WebElement> row=driver.findElements(By.tagName("tr"));
		int rowcount=row.size();
		System .out.println(rowcount);

		
		List<WebElement> coloum=driver.findElements(By.tagName("th"));
		int coloumcount=coloum.size();
		System .out.println(coloumcount);
		
		
		List<WebElement> tabledata=driver.findElements(By.tagName("tr"));
		int tabledatacount=tabledata.size();
		System .out.println(tabledatacount);
		
		WebElement getpercent=driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]"));
		String percent=getpercent.getText();
		System.out.println(percent);
		
		List<WebElement> allprograss=driver.findElements(By.xpath("//td[2]"));
		List<Integer> numberlist=new ArrayList<Integer>();
		for(WebElement webElement:allprograss)
		{
			String individualvalue=webElement.getText().replace("%", "");
			numberlist.add(Integer.parseInt(individualvalue));
		}
		System.out.println(numberlist);
		int smallvalue=Collections.min(numberlist);
		System.out.println(smallvalue);
		}
	}
	
	


