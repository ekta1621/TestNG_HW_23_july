package xpath_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_title_menu {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		//ancestor - grandfathers 
				//parent
				//preceding
				//sibling - preceding 
				//child --- element 
				//following - sibling
				//sibling
				//descendant
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		//Rediffmail
		//parent- driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[@class='mailicon']")).click();
		//preceding - driver.findElement(By.xpath("//a[@class='moneyicon relative']/preceding::a[@class='mailicon']")).click();
		//preceding-sibling - driver.findElement(By.xpath("//a[@class='moneyicon relative']/preceding-sibling::a[@class='mailicon']")).click();
		//following - driver.findElement(By.xpath("//div[@class='cell']/following::a[@class='mailicon']")).click();
		//ancestor - driver.findElement(By.xpath("//div[@id='div_advt_right']/ancestor::div[@id='red_container_main']/preceding::a[@class='mailicon']")).click();
		//descendant - driver.findElement(By.xpath("//div[@class='logobar']/descendant::a[@class='mailicon']")).click();
		
		//Money
		//parent- driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[@class='moneyicon relative']")).click();
		//preceding - driver.findElement(By.xpath("//a[@class='bmailicon relative']/preceding::a[@class='moneyicon relative']")).click();
		//preceding-sibling - driver.findElement(By.xpath("//a[@class='bmailicon relative']/preceding-sibling::a[@class='moneyicon relative']")).click();
		//following - driver.findElement(By.xpath("//div[@class='cell']/following::a[@class='moneyicon relative']")).click();
		//following-sibling - driver.findElement(By.xpath("//a[@class='moneyicon relative']/following-sibling::a[@class='moneyicon relative']")).click();
		//ancestor - driver.findElement(By.xpath("//div[@id='div_advt_right']/ancestor::div[@id='red_container_main']/preceding::a[@class='moneyicon relative']")).click();
		//descendant - driver.findElement(By.xpath("//div[@class='logobar']/descendant::a[@class='moneyicon relative']")).click();
	
		//Business Email
		//parent- driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[@class='bmailicon relative']")).click();
		//preceding - driver.findElement(By.xpath("//a[@class='vdicon']/preceding::a[@class='bmailicon relative']")).click();
		//preceding-sibling - driver.findElement(By.xpath("//a[@class='vdicon']/preceding-sibling::a[@class='bmailicon relative']")).click();
		//following - driver.findElement(By.xpath("//div[@class='cell']/following::a[@class='bmailicon relative']")).click();
		//following-sibling - driver.findElement(By.xpath("//a[@class='moneyicon relative']/following-sibling::a[@class='bmailicon relative']")).click();
		//ancestor - driver.findElement(By.xpath("//div[@id='div_advt_right']/ancestor::div[@id='red_container_main']/preceding::a[@class='bmailicon relative']")).click();
	    //descendant - driver.findElement(By.xpath("//div[@class='logobar']/descendant::a[@class='bmailicon relative']")).click();
	
		//Videos link
		//parent - //parent - driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[@class='bmailicon relative']")).click();
		//preceding-sibling - driver.findElement(By.xpath("//a[@class='shopicon relative']/preceding-sibling::a[@class='vdicon']")).click();
		//following-sibling - driver.findElement(By.xpath("//a[@class='bmailicon relative']/following-sibling::a[@class='vdicon']")).click();
		//ancestor - driver.findElement(By.xpath("//div[@id='div_advt_right']/ancestor::div[@id='red_container_main']/preceding::a[@class='vdicon']")).click();
		//descendant - driver.findElement(By.xpath("//div[@class='logobar']/descendant::a[@class='vdicon']")).click();
		//following - driver.findElement(By.xpath("//div[@class='cell']/following::a[@class='vdicon']")).click();
	
		//Shopping
		// parent to child - driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[@class='shopicon relative']")).click();
		//following sibling - driver.findElement(By.xpath("//a[@class = 'vdicon']/following-sibling::a[@class= 'shopicon relative']\")).click();
		//following - driver.findElement(By.xpath("//div[@class='cell']/following::a[@class='shopicon relative']")).click();
		//preceding - driver.findElement(By.xpath("//div[@class='cell alignR toprlinks']/preceding::a[@class='shopicon relative']")).click();
		//descendant - driver.findElement(By.xpath("//div[@class='logobar']/descendant::a[@class='shopicon relative']")).click();
		//ancestor - driver.findElement(By.xpath("//div[@id='div_advt_right']/ancestor::div[@id='red_container_main']/preceding::a[@class='shopicon relative']")).click();
	
		//Create account
		// parent to child - driver.findElement(By.xpath("//p[@id='signin_info']/child::a[contains(text(),'Create Account')]")).click(); 	
		// following sibling - driver.findElement(By.xpath("//a[text()='Sign in']/following-sibling::a[text()='Create Account']")).click();
		// preceding - driver.findElement(By.xpath("//div[starts-with(@id,'div_advt_x')]/preceding::a[text()='Create Account']")).click();
		// descendant - driver.findElement(By.xpath("//div[(@class='logobar')]/descendant::a[text()='Create Account']")).click();
		// following - driver.findElement(By.xpath("//span[(@class='username')]/following::a[text()='Create Account']")).click();
		// preceding sibling - driver.findElement(By.xpath("//a[text()='Create Account']/preceding-sibling::a[text()='Sign in']")).click();
		// ancestor  - driver.findElement(By.xpath("//form[@id="queryTop"]/ancestor::div[@class="srchbar clear-fix relative"]/preceding::a[text()='Create Account']")).click();
		//div[@class='srchbar clear-fix relative']/preceding-sibling::div[@class='logobar']/descendant::a[text()='Create Account']

		



	
	
	}

}
