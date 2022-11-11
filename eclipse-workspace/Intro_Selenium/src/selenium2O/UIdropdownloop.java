package selenium2O;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UIdropdownloop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/rkp/eclipse-workspace/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//*[text()='1 Adult']")).click();
		int i=1;
		while(i<5)
		{
			driver.findElement(By.cssSelector("div[data-testid=\"Adult-testID-plus-one-cta\"]")).click();
			i++;
		}
		Assert.assertEquals(driver.findElement(By.xpath("//*[text()='5 Adults']")).getText(), "5 Adults");
		
		//driver.switchTo().alert().dismiss();
		driver.quit();
		
		

	}

}
