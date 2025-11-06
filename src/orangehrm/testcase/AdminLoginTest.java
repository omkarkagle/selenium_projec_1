package orangehrm.testcase;

import Utils.AppUtils;
import orangehrm.library.LoginPage;

public class AdminLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AppUtils.launchApp("http://orangehrm.qedgetech.com");
        LoginPage lp=new LoginPage();
        lp.login("Admin", "Qedge123!@#");
        
	}

}
