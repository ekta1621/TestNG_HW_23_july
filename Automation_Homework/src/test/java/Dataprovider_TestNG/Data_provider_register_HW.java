package Dataprovider_TestNG;

import org.testng.annotations.DataProvider;

public class Data_provider_register_HW {


@DataProvider(name = "TN_Register1")
public Object[][] getdata1() {

	Object[][] data = { { "Ekta", "Patel", "ep1@gmail.com" , "123456789", "Ekta@123", "Ekta@123"}};
    return data;
}

@DataProvider(name = "TN_Register2")
public Object[][] getdata2() {

	Object[][] data = { { "Ekta1", "Patel", "ep2@gmail.com" , "123456789", "Ekta@123", "Ekta@123"}};
    return data;
}
@DataProvider(name = "TN_Register3")
public Object[][] getdata3() {

	Object[][] data = { { "Ekta2", "Patel", "ep3@gmail.com" , "123456789", "Ekta@123", "Ekta@123"}};
    return data;
}
@DataProvider(name = "TN_Register4")
public Object[][] getdata4() {

	Object[][] data = { { "Ekta3", "Patel", "ep4@gmail.com" , "123456789", "Ekta@123", "Ekta@123"}};
    return data;
}
@DataProvider(name = "TN_Register5")
public Object[][] getdata5() {

	Object[][] data = { { "Ekta4", "Patel", "ep5@gmail.com" , "123456789", "Ekta@123", "Ekta@123"}};
    return data;
}
@DataProvider(name = "TN_Register6")
public Object[][] getdata6() {

	Object[][] data = { { "Ekta5", "Patel", "ep6@gmail.com" , "123456789", "Ekta@123", "Ekta@123"}};
    return data;
}
}
