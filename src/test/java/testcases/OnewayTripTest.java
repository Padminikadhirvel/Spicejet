package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.OnewayTripPage;




public class OnewayTripTest extends BaseClass{
	@Test
	public void SearchFlightOperation()
	{
		OnewayTripPage oneway=new OnewayTripPage(driver);
		oneway.Onewaybtn();
		oneway.Onboarding(prop.getProperty("From"));
		oneway.departure(prop.getProperty("Place"));
		oneway.boardingdate(prop.getProperty("Board"));
		oneway.addpassengers(2, 2, 1);
		oneway.searchflight();
		
	}

	

}
