package ups.bdd.utility;

import cucumber.api.java.After;

public class AfterActions {

	@After
	public void afterActions() throws Exception {
		Thread.sleep(10000);
		InvokeDriver.tearDown();
		System.out.println("Application TearDown Successfully.");
		
	}
}
