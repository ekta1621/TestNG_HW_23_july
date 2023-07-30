import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Testng_prac {
 
	public WebDriver driver;
	
	@BeforeMethod
	public void loginRediff() {
		driver = new ChromeDriver();
		driver.get("https://rediff.com/demo/");
		
		
		@Test (Priority = 1)
		@Test (Priority = 2)
		@Test (Priority = 3)
	@AfterMethod
	
	}
}
