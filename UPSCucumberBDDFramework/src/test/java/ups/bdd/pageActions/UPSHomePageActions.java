package ups.bdd.pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ups.bdd.pageElements.UPSSearchPageElements;
import ups.bdd.utility.InvokeDriver;

public class UPSHomePageActions {

	UPSSearchPageElements ElementPage;
	
	public UPSHomePageActions() {
		
		ElementPage = new UPSSearchPageElements();
	
		PageFactory.initElements(InvokeDriver.driver,ElementPage);
	}
	
	public void openBrowser() throws Exception {
	
		InvokeDriver.driver.manage().window().maximize();
		InvokeDriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		InvokeDriver.driver.get("https://www.ups.com/us/en/Home.page");
	}
	
	public void clickLogIn() throws Exception  {
		Thread.sleep(4000);
		ElementPage.LogInBox.click();	
	}
	
	public void useridpassword(String arg1, String arg2) throws Exception {
		Thread.sleep(3000);
		ElementPage.UserIDBox.sendKeys(arg1);
		ElementPage.PasswordBox.sendKeys(arg2);
		
	}
	
	public void LogInButton() throws Exception {
		Thread.sleep(3000);
		ElementPage.LogInButton.click();
	}
	
	public void TrackItem(String arg1) throws Exception {
		Thread.sleep(3000);
		ElementPage.TrackBox.sendKeys(arg1);
	
	}
	public void Submit() throws Exception {
		Thread.sleep(3000);
		ElementPage.TrackBox.submit();
	}
	
	public void ShipmentProgress() throws Exception{
		Thread.sleep(3000);
		ElementPage.ShipmentProgress.click();
	}
	
	public void DetailedView() throws Exception{
		Thread.sleep(3000);
		ElementPage.DetailedView.click();
	}
	
public void ProofofDelivery() throws Exception{
	Thread.sleep(3000);
	ElementPage.ProofDelivery.click();
	Thread.sleep(3000);
	ElementPage.IconX.click();
}
	public void LogOut() throws Exception {
		Thread.sleep(6000);
		ElementPage.LogOutBox.click();
		System.out.println("Page title is ::"+InvokeDriver.driver.getTitle());
		
	}
	
	public void Validation() throws Exception {
		String expectedPageTitle = "Tracking | UPS - United States";
		String actualPageTitle = InvokeDriver.driver.getTitle();
		
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
		
		}
}
