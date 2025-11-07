package orangehrm.testcase;

import Utils.AppUtils;
import orangehrm.library.LoginPage;

public class AdminLoginwithinvalidcredentials {

	public static void main(String[] args) {
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp=new LoginPage();
		lp.login("Admin", "xyz");
		boolean res=lp.isErrorMessageDisplayed();
        if(res)
        {
        	System.out.println("test pass");
        }else {
        	System.out.println("test fail");
        }
        AppUtils.closeApp();
	}

}
