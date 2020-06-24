package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.uniqlo.Assignment2.Resources.Base;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.interactions.Actions;


import com.uniqlo.Assignment2.Pages.EntryPageObjects;

public class StepDefinition extends Base {
	
@Given("Navigating to the flight boooking page of Goibibo")
public void navigating_to_the_flight_boooking_page_of_Goibibo() throws Exception {
	
	driver=initializeDriver();
	driver.get(prop.getProperty("BASE_URL_Goibibo"));
	logger.info("Verifying Opening page Goibibo");
	

}

@When("Entering {string} and {string} and Searching for the trip details")
public void entering_and_and_Searching_for_the_trip_details(String src,String dest) throws Throwable {
//	List<Map<String,String>> list=dataTable.asMaps(String.class,String.class);
	logger.info("Verifying Entering required details Goibibo");
	EntryPageObjects.OneWay(driver).click();
	
	EntryPageObjects.FromSrc(driver).click();
	EntryPageObjects.FromSrc(driver).sendKeys(src);
	Actions actions = new Actions(driver);
	actions.moveToElement(EntryPageObjects.Chennai(driver)).click(EntryPageObjects.Chennai(driver)).build().perform();
	EntryPageObjects.DestinationTo(driver).click();
	EntryPageObjects.DestinationTo(driver).sendKeys(dest);
	actions.moveToElement(EntryPageObjects.Kochi(driver)).click(EntryPageObjects.Kochi(driver)).build().perform();
	EntryPageObjects.departureCalendar(driver).click();
	EntryPageObjects.DatValue(driver).click();
	EntryPageObjects.Traveller(driver).click();
	EntryPageObjects.Travellercount(driver).click();
	EntryPageObjects.Search(driver).click();
	System.out.println(driver.getTitle());
	logger.info("Verifying entering to search for the trip");
}

@Then("Shows the details of the trip with booking option")
public void shows_the_details_of_the_trip_with_booking_option() {
	logger.info("Verifying Showing trip details Goibibo");
	EntryPageObjects.Price(driver).click();
	EntryPageObjects.Book(driver).click();
	System.out.println(driver.getTitle());
	logger.info("Verifying trip with less price and book for the trip");
	
	driver.quit();
}


}
