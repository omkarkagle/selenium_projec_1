package orangehrm.library;

import org.openqa.selenium.By;

import Utils.AppUtils;

public class LoginPage {

	public void login(String uid,String pwd) {
		
		AppUtils.driver.findElement(By.id("txtUsername")).sendKeys(uid);
		AppUtils.driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		AppUtils.driver.findElement(By.id("btnLogin")).click();
		
	}
	
}
