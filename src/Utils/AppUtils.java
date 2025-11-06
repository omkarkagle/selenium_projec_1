package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppUtils
{
	
	public static WebDriver driver=new ChromeDriver();
	
    public static void launchApp(String url) {
    	
    	//System.setProperty("webdriver.chrome.driver", "chromedriver");
    	driver.manage().deleteAllCookies();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	
    	driver.get(url);
    }
    
    public static void closeApp() {
    	driver.close();
    }
	
}
