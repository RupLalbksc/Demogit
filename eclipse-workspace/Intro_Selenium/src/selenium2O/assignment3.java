package selenium2O;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/rkp/eclipse-workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		String UserName = (driver.findElement(By.xpath("//i[text()='rahulshettyacademy']")).getText());
		String PassWord = (driver.findElement(By.xpath("//i[text()='learning']")).getText());
		driver.findElement(By.id("username")).sendKeys(UserName);
		driver.findElement(By.id("password")).sendKeys(PassWord);
		driver.findElement(By.xpath("//span[@class='radiotextsty'][.=' User']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("okayBtn")).click();
		Thread.sleep(1000);
		WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(options);
		dropdown.selectByValue("consult");
		//driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		driver.findElement(By.id("signInBtn")).click();
		Thread.sleep(2000);
		
		List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
		for(int i =0;i<products.size();i++)
		{
			products.get(i).click();
		}
		driver.findElement(By.partialLinkText("Checkout")).click();}


		
		
		

	

}
