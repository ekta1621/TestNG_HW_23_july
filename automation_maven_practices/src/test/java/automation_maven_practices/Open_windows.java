package automation_maven_practices;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Open_windows {

	public static void main(String[] args) throws InterruptedException {

		 ChromeOptions driver = new ChromeOptions();
		((WebDriver) driver).manage().window().maximize();
		((WebDriver) driver).get("https://facebook.com");
		((WebDriver) driver).findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t"); // Open a new tab
		ArrayList<String> tabs = new ArrayList<>(((WebDriver) driver).getWindowHandles()); // Get all open tabs
		((WebDriver) driver).switchTo().window(tabs.get(1)); // Switch to the new tab
		 ((WebDriver) driver).get("https://www.amazon.ca"); // Open the second website
		 driver.wait();
	}

}
