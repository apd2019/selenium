package section13;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotTest {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://google.com");	
		
		//typecast driver to TakesScreenshot
		//get the screenshot as and output file
		//store the screenshot file to a src object
		//copy that file to the local machine 
		//to use copy method, use FileUtils class
		//save the file on the local machine with an extension
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D://seleniumtestfiles/screenshot.png"));
	}

}
