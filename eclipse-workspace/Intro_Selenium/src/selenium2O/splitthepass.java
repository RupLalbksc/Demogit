package selenium2O;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class splitthepass {

	public static void main(String[] args) throws InterruptedException {
		String name ="Kumar";
		
		System.setProperty("webdriver.chrome.driver", "/Users/rkp/eclipse-workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String password = getpass(driver);
		driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		//driver.quit();

		
		
	}		
		
public static  String getpass(WebDriver driver) throws InterruptedException
{
	

		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		String PassText = driver.findElement(By.cssSelector("form p")).getText();
		String [] PassArr = PassText.split("'");
		String pass = PassArr[1];
		return pass;
		
	
}
}
