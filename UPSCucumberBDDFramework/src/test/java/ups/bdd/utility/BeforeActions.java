package ups.bdd.utility;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {
	
	@Before
	public void beforeActions(Scenario scen) {

		System.out.println("My 1st execution.");
		InvokeDriver.invokeDriver();
		System.out.println("Driver Trigger Successfully.");
		System.out.println("My Scenario name is  ::"+scen.getName());
		
	}

}
