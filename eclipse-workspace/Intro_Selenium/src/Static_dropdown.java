import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Static_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/rkp/eclipse-workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//drop down with static drop down
		WebElement staticDD = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDD); 
		dropdown.selectByIndex(1);
		String Actual1 =dropdown.getFirstSelectedOption().getText();
		Assert.assertEquals(Actual1, "INR");
		dropdown.selectByVisibleText("USD");
		String b =dropdown.getFirstSelectedOption().getText();
		Assert.assertEquals(b,"USD");
		driver.quit();
		
		
		

	}

}
