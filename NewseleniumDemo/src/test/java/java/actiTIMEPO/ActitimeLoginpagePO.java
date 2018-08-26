package actiTIMEPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import actiTIMELIB.Basepage;

public class ActitimeLoginpagePO extends Basepage {
	public ActitimeLoginpagePO(WebDriver driver) {
		super(driver);
		}
	@FindBy(id="username")
	private WebElement untxtbx;
	public WebElement untxtbx() {
		return untxtbx;
	}
	@FindBy(name="pwd")
	private WebElement pwtxtbx;
	public WebElement pwtxtbx() {
		return pwtxtbx;
	}
	@FindBy(id="loginButton")
	private WebElement loginbtn;
	public WebElement loginbtn() {
		return loginbtn;
	}
	//@FindBy(xpath="//span[@class='errormsg'])[1]");
	public void login(String un,String pw) {
		untxtbx().sendKeys(un);
		pwtxtbx().sendKeys(pw);
		loginbtn().click();
	}

}
