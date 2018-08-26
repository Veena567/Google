package actiTIMEPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import actiTIMELIB.Basepage;

public class ActitimeHomepagePO extends Basepage{
	public ActitimeHomepagePO(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="logoutLink")
	private WebElement logoutbtn;
	public WebElement logoutbtn() {
		return logoutbtn;
	}
	public void logout() {
		logoutbtn().click();
	}

}
