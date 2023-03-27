package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RoundTripPage {
	public WebDriver driver;
	public RoundTripPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[contains(text(),'round trip')]")
	WebElement Roundtripbtn;
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement boardingFrom;
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement destination;
	@FindBy(xpath="(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[1]")
	WebElement departuredate;
	@FindBy(xpath="(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[2]")
	WebElement returndate;
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")
	WebElement addpassenger;
	@FindBy(xpath="//div[@data-testid='Adult-testID-plus-one-cta']")
	WebElement increaseadult;
	@FindBy(xpath="//div[@data-testid='Children-testID-plus-one-cta']")
	WebElement increasechild;
	@FindBy(xpath="//div[@data-testid='Infant-testID-plus-one-cta']")
	WebElement increaseinfant;
	@FindBy(xpath="//div[@data-testid='home-page-flight-cta']")
	WebElement searchflightbtn;
	public void Roundtripbtn() {
		Roundtripbtn.click();
		
	}
	public void Onboarding(String From) {
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(boardingFrom));
		boardingFrom.click();
		boardingFrom.sendKeys(From);
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert=driver.switchTo().alert();
////		String alertmsg=alert.getText();
//		alert.accept();
//		driver.switchTo().defaultContent();
	}
	public void departure(String Place) {
		destination.click();
		destination.sendKeys(Place);
//		destination.sendKeys(To);
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(destination));
	}
	public void boardingdate(String Board) {
		departuredate.click();
		departuredate.sendKeys(Board);
	}
	public void returningdate(String Board) {
		returndate.click();
		returndate.click();
		departuredate.sendKeys(Board);
	}
	public void addpassengers(int adult, int child, int infant) {
		addpassenger.click();
		for(int i=1;i<adult;i++) {
			increaseadult.click();
		}
		for(int i=0;i<child;i++) {
			increasechild.click();
		}
		for(int i=0;i<infant;i++) {
			increaseinfant.click();
		}
	}
	public void searchflight() {
		searchflightbtn.click();
	}
	
}
