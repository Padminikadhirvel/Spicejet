package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.RoundTripPage;

public class RoundTripTest extends BaseClass{

	@Test
	public void RoundTripOperation() {
		RoundTripPage roundtrip=new RoundTripPage(driver);
		roundtrip.Roundtripbtn();
		roundtrip.Onboarding(prop.getProperty("From"));
		roundtrip.departure(prop.getProperty("Place"));
		roundtrip.boardingdate(prop.getProperty("Board"));
		roundtrip.returningdate(prop.getProperty("Board"));
		roundtrip.addpassengers(1, 1, 2);
		roundtrip.searchflight();
	}

}
