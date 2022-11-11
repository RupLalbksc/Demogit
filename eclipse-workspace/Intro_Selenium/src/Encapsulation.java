import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Encapsulation {

	public WebDriver driver;
	private By signin = By.className("class");

		
		

	
	public WebElement signin()
	{
		return driver.findElement(signin);
	}	
	

}
