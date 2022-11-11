import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;



public class Intro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/rkp/eclipse-workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.getTitle());
		driver.findElement(By.id("inputUsername")).sendKeys("kumar@wipro.com");
		driver.findElement(By.name("inputPassword")).sendKeys("12345");
		driver.findElement(By.className("signInBtn")).click();	
		Thread.sleep(2000);
		//System.out.println(driver.findElement(By.className("error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("input[placeholder=\"Name\"]")).sendKeys("Ruplal");
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("anonymous@hacker.com");
		driver.findElement(By.cssSelector("input[placeholder=\"Phone Number\"]")).sendKeys("991551971");
		driver.findElement(By.cssSelector("button[class=\"reset-pwd-btn\"]")).click();
		String Temp_pwd = driver.findElement(By.cssSelector("p[class=\"infoMsg\"]")).getText();
		String pwd[]= Temp_pwd.split("'");
		//System.out.println(pwd[1]);
		driver.findElement(By.cssSelector("button[class=\"go-to-login-btn\"]")).click();
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("inputUsername")).clear();
		driver.findElement(By.id("inputUsername")).sendKeys("user");
		driver.findElement(By.name("inputPassword")).sendKeys(pwd[1]);
		

		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		Thread.sleep(2000);
		//String ActualTitle=driver.findElement(By.cssSelector("div[class='login-container'] p")).getText();
		//Assert.assertEquals(actual1,"You are successfully logged in");
		//String ExpectedTitle = "You are successfully logged i.";
		driver.findElement(By.cssSelector("button[class=\"logout-btn\"]")).click();

		//AssertEquals(ExpectedTitle, ActualTitle); test ng is now eworkig
		
		
		
		//driver.quit();
		
		
		
		
		
		
		
		
		
		
		//driver.close();
		
		

	}

}
