import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class cssSelector_practise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/rkp/eclipse-workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Kumar");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("1234");
		driver.findElement(By.cssSelector("input#chkboxTwo")).click();
		driver.findElement(By.cssSelector("button[class*='submit']")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Kumar");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("email.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("991555");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
		String s1 = driver.findElement(By.cssSelector("p[class='infoMsg']")).getText();
		String [] s2 = s1.split("'");
		System.out.println(s2[1]);
		driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Kumar");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(s2[1]);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		//System.out.println(driver.findElement(By.cssSelector("div[class='login-container']")).getText());
		
		
		
		
				
				
		//driver.close();
		
		
		
		
		

	}

}
