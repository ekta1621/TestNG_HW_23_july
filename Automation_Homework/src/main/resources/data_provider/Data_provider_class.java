
public class Data_provider_class {
	
import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

	@DataProvider
	
	public static Object[][] getData(Method name){
		System.out.println("Test case result " + name.getName());
		Object[][] data = new object[3][4];
		
		data[0][0] = "Username1";
		data[0][1] = "101";
		data[0][2] = "seleniumpanda23456@gmail.com";
		data[0][3] = "54678973";
		
		data[1][0] = "Username2";
		data[1][1] = "102";
		data[1][2] = "seleniumpanda23457@gmail.com";
		data[1][3] = "54678972";
		
		data[2][0] = "Username3";
		data[2][1] = "103";
		data[2][2] = "seleniumpanda23458@gmail.com";
		data[2][3] = "54678971";
		
		return data;
	}
	
}
