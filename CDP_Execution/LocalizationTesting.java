import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class LocalizationTesting {

	public static void main(String[] args) {

		ChromeDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver-win64\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
		Map<String,Object> geoLocation = new HashMap<String,Object>();
		geoLocation.put("latitude",40);
		geoLocation.put("longitude",3);
		geoLocation.put("latitude",1);
		
		driver.executeCdpCommand("Emulation.setGeolocationOverride", geoLocation);
		
		driver.get("https://www.netflix.com/in/");
	}

}
	
