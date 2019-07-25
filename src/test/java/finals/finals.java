package finals;



import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class finals {
	WebDriver driver;
	@When("Search product")
	public void search_product() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("password123");
		driver.findElement(By.name("Login")).click();
//driver.findElement(By.name("products")).sendKeys("head");
		driver.findElement(By.xpath("//*[@id=\'myInput\']")).sendKeys("head");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		
		//WebElement s=driver.findElement(By.name("val"));
		//Actions a=new Actions(driver);
		//a.sendKeys("Carpet").sendKeys(Keys.ENTER).build().perform();

	}

	@Then("Add to cart")
	public void add_to_cart() throws InterruptedException {
	    driver.findElement(By.xpath("//a[@href='#' and @class='btn btn-success btn-product']")).click();
	    Thread.sleep(5000);
	//    driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\'header\']/div[1]/div/div/div[2]/div/a[2]")).click();
	    Thread.sleep(5000);
	   // driver.findElement(By.xpath("//a[@href='checkout.htm' and @class='btn btn-success btn-block']")).click();
	  //  Thread.sleep(5000);
	    //driver.findElement(By.name("ShippingAdd")).sendKeys("dghshssgfhj");
	   // driver.findElement(By.xpath("html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	    driver.findElement(By.xpath("//*[@id=\'cart\']/tfoot/tr[2]/td[5]/a")).click();
	    Thread.sleep(5000);
	  // 
	//    driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
	  //  Thread.sleep(5000);
		//List<WebElement>Radio=driver.findElements(By.name("gender"));
		//.get(0).click();
	
	// driver.findElement(By.xpath("//a[@id='btn']")).click();

	   	   driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//label[contains(text(),'Andhra Bank')]//i")).click();
	   Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\'btn\']")).click();
	   driver.findElement(By.name("username")).sendKeys("123456");
	 driver.findElement(By.name("password")).sendKeys("Pass@456");
	 driver.findElement(By.xpath("//*[@id=\'horizontalTab\']/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//*[@id=\'horizontalTab\']/div[2]/div/div/div/div/form/input")).sendKeys("Trans@456");
	 driver.findElement(By.xpath("//*[@id=\'horizontalTab\']/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	// driver.findElement(By.xpath("//input[@type='submit' and @value='LOGIN'")).click();
	}

	/*@Then("Payment")
	public void payment() {
	   
	}*/


}
