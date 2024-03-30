//Driver invokation

WebDriver driver = new ChromeDriver();

//pkg (related)
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


WebDriver driver = new FirefoxDriver();
WebDriver driver = new EdgeDriver();
WebDriver driver = new SafariDriver();

===========================================

//Use WebElement if you need to point to a component or element of the page.
//Like if you are targeting the header or footer in most of the cases
//To narrow down the scope to that element or section only
//for searching benefits

WebElement foot = driver.findElement(By.id("gf-BIG")); //[foot = variable or object that holds the section reference]

//pkg (related)
import org.openqa.selenium.WebElement;

===============================================


//List usage
List<WebElement>links = driver.findElements(By.tagName("a"));

//pkg (related) 
import java.util.List;

==============================================



  
