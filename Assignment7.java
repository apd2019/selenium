package sec12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\arkap\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//print number of rows = 11 from web table example
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
//		
//		String val = "return document.getElementByxpath(
		
		List<WebElement> tableRows = driver.findElements(By.cssSelector(".table-display tr"));
		
		System.out.println(tableRows.size());
		
		// Number of columns = 3
		
		List<WebElement> tableColumns = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
		
		System.out.println(tableColumns.size());
		
		//print out 2nd row content
		
		List<WebElement> secondRow = driver.findElements(By.cssSelector("table[name='courses'] tbody tr:nth-child(3)"));
		
		
		for(int i = 0;i<secondRow.size();i++)
		{
			System.out.print(secondRow.get(i).getText());
		}
	}

}
