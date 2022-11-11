import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ekart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/rkp/eclipse-workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> Items = driver.findElements(By.cssSelector("h4.product-name"));
		String[] itemlist= {"Cucumber","Carrot"};
		List<String> Itemneeded = Arrays.asList(itemlist);
		String n;
		for(int i=0;i<Items.size();i++)
		{
			n =Items.get(i).getText();
			String[] an=n.split("-");
			String jj= an[0].trim();
			
			if(Itemneeded.contains(jj))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			}
			
		}
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.cssSelector("div[class='cart-preview active'] button[type='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/div /following-sibling::button[1]")).click();
		WebElement staticdropdown=driver.findElement(By.xpath("//div/div/div/div/div/div//select"));
		Select list = new Select(staticdropdown);
		List<WebElement> ddlist = list.getOptions();
		for(int i=0;i<ddlist.size();i++)
		{
			
			if ((ddlist.get(i).getText())=="India");
			{
				System.out.println(ddlist.get(i).getText());
			}
			
		}
		

	}
	

}
