package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage extends BasePage{
	
	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element Library
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]") WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id=\"cid\"]") WebElement COMPANY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]") WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id=\"country\"]") WebElement COUNTRY_DROPDOWN_ELEMENT;
	
	public void enterFullName(String fullName) {
		int randonNumber = randomGenerator(999);
		FULL_NAME_ELEMENT.sendKeys(fullName + randonNumber);
	}
	
	public void selectCompanyDropdown(String company) {
		selectFromDropdown(COMPANY_DROPDOWN_ELEMENT, company);
	}

}
