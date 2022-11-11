import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_locator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/rkp/eclipse-workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bookmyshow.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("wzrk-cancel")).click();
		driver.findElement(By.cssSelector("input[placeholder*=\"Search for your city\"]")).click();
		driver.findElement(By.cssSelector("input[placeholder*=\"Search for your city\"]")).sendKeys("bokaro");
		driver.findElement(By.xpath("//div/ul/li/span/strong")).click();
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		
		
		
		
		
		
		
		driver.quit();

	}

}
