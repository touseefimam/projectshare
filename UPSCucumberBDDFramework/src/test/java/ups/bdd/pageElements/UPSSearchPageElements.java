package ups.bdd.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UPSSearchPageElements {

	
	@FindBy (xpath="(//*[@class='ups-analytics'])[2]")
	public WebElement LogInBox;
	
	@FindBy (xpath="//*[@id='email']")
	public WebElement UserIDBox;
	
	@FindBy (xpath="//*[@id='pwd']")
	public WebElement PasswordBox;
	
	@FindBy (xpath="//*[@id='submitBtn']")
	public WebElement LogInButton;
	
	@FindBy (xpath="//*[@id='ups-quickStartMenu']")
	public WebElement QuickStart;
	
	
	@FindBy (xpath= "//*[@id='ups-track--qs']")
	public WebElement TrackBox;
	
	@FindBy(id = "stApp_shipmentProgress")
	public WebElement ShipmentProgress;
	
	@FindBy(id = "stApp_lblShipProgressTableViewDetailed")
	public WebElement DetailedView;
	
	@FindBy(id= "stApp_btnProofOfDeliveryonShpmtProg")
	public WebElement ProofDelivery; 
	
	@FindBy(className = "ups-icon-x")
	public WebElement IconX;
	
	@FindBy (xpath="(//*[@class='ups-analytics ups-logout'])[1]")
	public WebElement LogOutBox;
	
}
