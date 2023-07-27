package login_logout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/");
	
	
	String actualTitle = driver.getCurrentUrl();
	String expectedTitle = "Your Store";	
	String actualCurrentUrl = driver.getCurrentUrl();
	String expectedCurrentUrl = "https://tutorialsninja.com/demo/";
	if(expectedTitle.equals(actualTitle) && expectedCurrentUrl.equals(actualCurrentUrl)) {
	WebElement Myaccount = driver.findElement(By.linkText("My Account"));
     Myaccount.isDisplayed();
     Myaccount.click();
     WebElement Register = driver.findElement(By.linkText("Register"));
     Register.isDisplayed();
     Register.click();
	}
	else {
		driver.quit();
	}
	WebElement usernameTextbox=driver.findElement(By.id ("input-firstname"));
	WebElement usernameTextbox1=driver.findElement(By.id ("input-lastname"));
	WebElement usernameTextbox2=driver.findElement(By.id ("input-email"));
	WebElement usernameTextbox3=driver.findElement(By.id ("input-telephone"));
	WebElement passwordTextbox=driver.findElement(By.id ("input-password"));
	WebElement passwordTextbox1=driver.findElement(By.id ("input-confirm"));
	//WebElement keepMeSignedInCheckbox = driver.findElement(By.className("newsletter"));
	WebElement signInButton = driver.findElement(By.className ("agree"));
		if (usernameTextbox.isEnabled() && usernameTextbox1.isEnabled() && usernameTextbox2.isEnabled() &&
				usernameTextbox3.isEnabled() && passwordTextbox.isDisplayed() && passwordTextbox1.isDisplayed() &&
				 signInButton.isDisplayed() ) {
			usernameTextbox.sendKeys("Ekta");
			usernameTextbox1.sendKeys("Patel");
			usernameTextbox2.sendKeys("ektapatel1621@gmail.com");
			usernameTextbox3.sendKeys("2269616242");
			passwordTextbox.sendKeys("12345");
			passwordTextbox1.sendKeys("12345");
			signInButton.click();
		}
		else {
			driver.quit();
			
			
		}
	}

}
