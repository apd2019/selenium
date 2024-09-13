package apdlearning.ExtentReports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class ExtentReportDemo {
	
	ExtentReports extent;
	
	@BeforeTest
	public void config() throws IOException {
		//ExtentReports, ExtentSparkReporter
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("test automation report");
		reporter.config().setDocumentTitle("testing reports");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "APD");
		extent.flush();
		Desktop.getDesktop().browse(new File(path).toURI());
		
	}
	@Test
	public void demoInit() {
		extent.createTest("demo initial");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		
		
	}
	
//	@AfterTest
//	public void flush() throws IOException {
//		Desktop.getDesktop().browse(new File("index.html").toURI());
//	}
}
