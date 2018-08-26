package actiTIMETEST;

import org.testng.annotations.Test;

import actiTIMELIB.BaseTest;
import actiTIMEPO.ActitimeLoginpagePO;

public class Testlogin extends BaseTest{

	@Test
	public void testValidCredentials() {
	driver.get(TEST_URL);
	ActitimeLoginpagePO loginPO=new ActitimeLoginpagePO(driver);
	loginPO.login("veena3628","AzanY2Ug");
	//String eTitle="hai";
	//System.out.println(driver.getTitle());
	}

}
