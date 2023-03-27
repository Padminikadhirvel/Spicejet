package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignupPage {
public WebDriver driver;
	public SignupPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="(//div[@class='css-76zvg2 r-jwli3a r-ubezar'])[2]")
	WebElement signup;
	@FindBy(xpath="//select[@class='form-control form-select ']/ option[@value='MR']")
	WebElement title;
	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstname;
	@FindBy(xpath="//input[@id='last_name']")
	WebElement lastname;
	@FindBy(xpath="//select[@class='form-control form-select']")
	WebElement country;
	@FindBy(xpath="//input[@id='dobDate']")
	WebElement dateofbirth;
	@FindBy(xpath="//input[@type='tel']")
	WebElement mobilenumber;
	@FindBy(xpath="//input[@id='email_id']")
	WebElement email;
	@FindBy(xpath="//input[@id='new-password']")
	WebElement password;
	@FindBy(xpath="//input[@id='c-password']")
	WebElement confirmpassword;
	@FindBy(xpath="//input[@id='defaultCheck1']")
	WebElement agreementcheck;
	@FindBy(xpath="//button[@type='button']")
	WebElement submitbutton;
	public void Signup() {
		signup.click();
	}
	public void SelectTitle() {
		title.click();
	}
	public void Firstname(String FirstName) {
		firstname.sendKeys(FirstName);
	}
	public void Lastname(String LastName) {
		lastname.sendKeys(LastName);
	}
	public void EnterCountry(String Country) {
		country.sendKeys(Country);
	}
	public void DateOfBirth(String DOB) {
		dateofbirth.sendKeys(DOB);
		dateofbirth.click();
	}
	public void MobileNumber(String MobileNumber) {
		mobilenumber.sendKeys(MobileNumber);
	}
	public void Emailid(String Email) {
		email.sendKeys(Email);
	}
	public void EnterPassword(String Password) {
		password.sendKeys(Password);
	}
	public void ConfirmPassword(String Confirmpassword) {
		confirmpassword.sendKeys(Confirmpassword);
	}
	public void agreementCheck() {
		agreementcheck.click();
	}
	public void signupSubmitForm() {
		submitbutton.click();
	}

}
