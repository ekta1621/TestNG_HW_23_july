package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_dataprovider {
	
	public WebDriver driver;
	
	@Test (priority = 1, dataProviderClass= Data_provider_class.class , dataProvider = "getData")
	public void data(String username, int emp_id, string email,int emp_no) {
		System.out.println(username + "--" + emp_id + ''--'' + email + "--" + emp_no + "--" );
	}
		
		
	}

	@Test (priority = 2,dataProviderClass= Data_provider_class.class , dataProvider = "getData")
	public void data1(String username, int emp_id, string email,int emp_no){
		System.out.println(username + "--" + emp_id + ''--'' + email + "--" + emp_no + "--" );	
		
	}

	@Test (priority = 3,dataProviderClass= Data_provider_class.class , dataProvider = "getData")
	public void data2(String username, int emp_id, string email,int emp_no){
		System.out.println(username + "--" + emp_id + ''--'' + email + "--" + emp_no + "--" );	
		
	}
	@Test (priority = 4,dataProviderClass= Data_provider_class.class , dataProvider = "getData")
	public void data3(String username, int emp_id, string email,int emp_no){
		System.out.println(username + "--" + emp_id + ''--'' + email + "--" + emp_no + "--" );	
		