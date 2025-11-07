package orangehrm.testcase;

import Utils.AppUtils;
import orangehrm.library.Employee;
import orangehrm.library.LoginPage;

public class EmployeeRegTest {

	public static void main(String[] args) {
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		LoginPage lp= new LoginPage();
		lp.login("Admin", "Qedge123!@#");
		
		Employee emp= new Employee();
		boolean res =emp.addEmployee("devid", "raja");
		if(res) {
			System.out.println("new employee registration test pass");
		}else {
			System.out.println("new employee registration test fail");
			
		}
		lp.logout();
		AppUtils.closeApp();
	}

}
