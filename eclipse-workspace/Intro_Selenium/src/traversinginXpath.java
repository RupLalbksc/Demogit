import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class traversinginXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/rkp/eclipse-workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().fullscreen();
		System.out.println(driver.findElements(By.xpath("//a")).size());
		System.out.println(driver.findElements(By.xpath("//div[contains(@class,'footer')]//a")).size());
		driver.navigate().to("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		
		
		driver.quit();

	}

}
