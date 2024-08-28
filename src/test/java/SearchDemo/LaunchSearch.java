package SearchDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchSearch {

	public static void main(String[] args) {

		System.out.print("Automation Task Running");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anshumaan.singh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	 
	    driver.manage().window().maximize();
	 
	    driver.get("https://www.google.co.in/");
	    
	    WebElement p=driver.findElement(By.name("q"));
	    
	    p.sendKeys("Selenium Java");
	    
	    p.submit();
	    
	    
	}

}
