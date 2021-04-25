package de.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
class MyFirstTest {

	
	/*
	 * @Test public void site_header_is_on_home_page() {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\mkubi\\eclipse-workspace\\SelemiumTest\\chromelib\\chromedriver.exe"
	 * ); WebDriver browser = new ChromeDriver();
	 * browser.get("https://www.saucelabs.com"); WebElement href =
	 * browser.findElement(By.xpath("//a[@href='https://accounts.saucelabs.com/']"))
	 * ; assertTrue((href.isDisplayed())); browser.close(); }
	 */
	
	@Test
	public void login() { // TODO Auto-generated method stub 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mkubi\\eclipse-workspace\\SelemiumTest\\chromelib\\chromedriver.exe");  
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		WebElement username=driver.findElement(By.id("username")); 
		WebElement password=driver.findElement(By.id("password")); 
		WebElement login=driver.findElement(By.xpath("//button[contains(.,'Einloggen')]")); 
		//button[contains(.,'Einloggen')]
		username.sendKeys("josiasyoumbi@yahoo.fr"); password.sendKeys("PasswordEigeben"); 
		login.click(); 
		String actualUrl="https://www.linkedin.com/feed/"; 
		String expectedUrl= driver.getCurrentUrl(); 
		assertEquals(expectedUrl,actualUrl);
	  }


}


