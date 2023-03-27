package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.LoginPage;

//this 
public class LoginTest extends BaseClass{
@Test(priority=1)
	public void LoginwithValidCredentials1() {
	LoginPage login=new LoginPage(driver);
	login.Login();
	login.EmailButton();
	login.EmailId(prop.getProperty("Email"));
	login.Password(prop.getProperty("Password"));
	login.LoginButton();
	}
@Test(priority=2)
	public void LoginwithInvalidCredentials() {
	LoginPage login=new LoginPage(driver);
	login.Login();
	login.EmailButton();
	login.EmailId(prop.getProperty("Email"));
	login.Password(prop.getProperty("InvalidPass"));
	login.LoginButton();
	}

}
