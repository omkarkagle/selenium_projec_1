package orangehrm.testcase;

import Utils.AppUtils;
import orangehrm.library.LoginPage;

public class AdminLoginTestWithValidCredentials {

	public static void main(String[] args) {
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp=new LoginPage();
		lp.login("Admin","Qedge123!@#");
		boolean res= lp.isadminModuleDisplayed();
		if(res)
		{
			System.out.println("Admin Login test pass");
		}else {
			System.out.println("Admin login test fail");
		}
		lp.logout();
		lp.closeApp();
       
        
	}

}
