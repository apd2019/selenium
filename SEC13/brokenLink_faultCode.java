String url;

		URL link = new URL(url); //URL is deprecated 
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		System.out.println(url);
		
		//chap 110
		
		
//		HttpURLConnection cnctn = (HttpURLConnection)new URL(url).openConnection();
		HttpURLConnection httpcon = (HttpURLConnection)link.openConnection();
