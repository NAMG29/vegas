package framework;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class reports {
	
	 static ExtentReports extent;
	 static ExtentTest logger;
	    
	    public static  void main(String [] args) {
	    	extent =new ExtentReports("C:\\Users\\naman\\Downloads\\name.html",true);
	    	extent.loadConfig(new File("C:\\Users\\naman\\eclipse-workspace\\maven_Project\\extent-config.xml"));
	    	extent.addSystemInfo("hi", "value");
	    	//logger.addScreenCapture("C:\\Users\\naman\\Downloads\\name.html");
	    //	logger.log(logStatus. stepName, details);
	    	//Select s1 = new Select(null);
	    	logger.log(LogStatus.PASS, "stepName", "details");
	    	//WebDriver driver = new ChromeDriver();
//	    	Actions a1 = new Actions(driver);
//	    	WebElement we= null;
//	    	a1.click(we).build().perform();
//	    	JavascriptExecutor js = (JavascriptExecutor) driver;
//
//	        // Launch the application		
//	        driver.get("http://demo.guru99.com/test/guru99home/");
//
//	        //This will scroll the web page till end.		
//	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    
	    }
	       
}
