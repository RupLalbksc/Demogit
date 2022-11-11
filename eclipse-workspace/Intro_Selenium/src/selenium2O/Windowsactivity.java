package selenium2O;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowsactivity {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/rkp/eclipse-workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.indiabix.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();		
	}

}
