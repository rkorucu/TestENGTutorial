package test;

import org.testng.annotations.*;

public class Day3 {

    @Parameters({ "URL","APIKey/username" })
    @Test
    public void WebloginCarLoan(String urlname,String key)
    {
        //selenium
        System.out.println("weblogincar");
        System.out.println(urlname);
        System.out.println(key);

    }
    @BeforeClass
    public void befoclas() {
        System.out.println("before executing any methods in the class");
    }
    @Test
    public void MobileLoginCarLoan(){
        //Appium
        System.out.println("MobileLoginCarLoan");
    }
    @AfterMethod
    public void afterevery(){
        System.out.println("I will execute after every test all test method in day 3 class ");
    }
    @Test
    public void  LoginApiCarLoan(){
    //Rest Api automation
        System.out.println("LoginApiCarLoan");
    }
    @Test(groups = {"smoke"})
    public void MobileLoginSing(){
        //Appium
        System.out.println("MobileLoginSing");
    }
    @Test(dataProvider ="getData")
    public void  LoginApiSignOut(String username, String password){
        //Rest Api automation
        System.out.println("Mobile sing Out ");
        System.out.println(username);
        System.out.println(password);
    }
    @DataProvider
    public Object[][] getData()
    {
        //1st combiantion - username password - good credit history= row
        //2nd - username password  - no crdit history
        // 3rd - fraudelent credit history
        Object[][] data= new Object[3][2];
        //1st set
        data[0][0]="firstsetusername";
        data[0][1]="firstpassword";
        //couloumns in the row are nothing but values for that particualar combination(row)

        //2nd set
        data[1][0]= "secondsetusername";
        data[1][1]= "secondpassword";

        //3rd set
        data[2][0]="thirdsetusername";
        data[2][1]="thirdpassword";
        return data;

    }


}
