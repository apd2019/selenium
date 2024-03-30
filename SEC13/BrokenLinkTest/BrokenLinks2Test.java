package section13;

import java.net.HttpURLConnection;
import java.net.URL;
import java.security.PublicKey;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		//Navigate to the site
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//find all the available links on webpage
		WebElement foot = driver.findElement(By.id("gf-BIG"));
		
		List<WebElement>links = foot.findElements(By.tagName("a"));
		
		for(WebElement link : links) {
			String url = link.getAttribute("href");
			System.out.println(url);
			verifyLink(url);
		}
	}
		
		public static void verifyLink(String url) {
			try {
				URL link = new URL(url);
				HttpURLConnection conn = (HttpURLConnection) link.openConnection();
				conn.setConnectTimeout(3000);
				conn.connect();
				
				if (conn.getResponseCode()==200) {
					System.out.println(url + "=" + conn.getResponseMessage());
				}
				else {
					System.out.println(url + "=" + conn.getResponseMessage()+ "=" + "is a broken link");
				}
			}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println(url + "=" + "is a broken link");
				}
			
			
			
			
		
	}

}
