package selenium2O;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/rkp/eclipse-workspace/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.cssSelector("input[value='Delhi (DEL)']")).click();
		driver.findElement(By.xpath("//*[text()='DEL']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='BLR']")).click();

	}

}
