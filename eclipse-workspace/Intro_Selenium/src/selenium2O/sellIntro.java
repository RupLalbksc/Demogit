package selenium2O;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sellIntro {

	public static void main(String[] args) {
		
		//invoking an browser
		System.setProperty("webdriver.chrome.driver", "/Users/rkp/eclipse-workspace/chromedriver");
		//System.setProperty("webdriver.gecko.driver", "/Users/rkp/eclipse-workspace/chromedriver");
		//System.setProperty("webdriver.edge.driver", "/Users/rkp/eclipse-workspace/chromedriver");


		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		

	}

}
