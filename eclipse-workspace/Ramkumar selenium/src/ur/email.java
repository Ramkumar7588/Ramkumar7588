package ur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class email {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver\\chromedriver_102.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Fwww.google.com%2F&hl=en&dsh=S1728816080%3A1657864388463820&biz=false&flowName=G"
				+ "lifWebSignIn&flowEntry=SignUp");
		Thread.sleep(3000);
		
		
		driver.findElement(By.name("firstName")).sendKeys("Ramkumar");
		Thread.sleep(3000);
		
		driver.findElement(By.name("lastName")).sendKeys("shanmugam");
		Thread.sleep(3000);
		
		driver.findElement(By.name("Username")).sendKeys("ramkumarshanmugam1998");
		Thread.sleep(3000);
		
		driver.findElement(By.name("Passwd")).sendKeys("123@123");
		Thread.sleep(3000);
		
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("123@123");
		Thread.sleep(3000);
		
		WebElement showpassword=driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/div[3]/div/div[1]/div/div/div[1]/div/input"));
		showpassword.click();
		Thread.sleep(3000);
		
		WebElement nextbutton=driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/span"));
		nextbutton.click();
		
		
		
		
		
		
		
		
		
		
	}

}
