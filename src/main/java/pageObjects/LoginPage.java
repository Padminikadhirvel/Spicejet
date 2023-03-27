package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public WebDriver driver;
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73'])[1]")
	WebElement loginkey;
	@FindBy(xpath="//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa'][normalize-space()='Email']")
	WebElement emailbutton;
	@FindBy(xpath="//input[@type='email']")
	WebElement enteremailid;
	@FindBy(xpath="//input[@type='password']")
	WebElement enterpassword;
	@FindBy(xpath="//input[@type='password']")
	WebElement enterinvalidpassword;
	@FindBy(xpath="//div[@data-testid='login-cta']")
	WebElement loginbutton;
	public void Login() {
		loginkey.click();
	}
	public void EmailButton() {
		emailbutton.click();
	}
	public void EmailId(String Emailid) {
		enteremailid.sendKeys(Emailid);
	}
	public void Password(String Password) {
		enterpassword.sendKeys(Password);
	}
	public void InvalidPassword(String invalidPassword) {
		enterinvalidpassword.sendKeys(invalidPassword);
	}
	public void LoginButton() {
		loginbutton.click();
	}
}

