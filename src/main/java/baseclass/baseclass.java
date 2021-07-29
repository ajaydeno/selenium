package baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.runtime.StepDefinition;

public class baseclass  {
	
	public static WebDriver driver;
	public static WebDriver ajaydeno(String str) {
		if (str.equalsIgnoreCase("chrome")) {
			
			
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		

	}
		return driver;

	}
	public static void  navigateto(String str) {
		driver.navigate().to(str);
	}
	public static void navigateforward() {
		driver.navigate().forward();
	}
	public static void gettitle(String url) {
		driver.getTitle();
	}
	public static void getcurrenturl(String currenturl) {
		driver.getCurrentUrl();
	}
	public static void sendkeys(WebElement ajay,String str) {
		ajay.sendKeys(str);
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void get(WebDriver driver,String str) {
	    
		driver.get(str);

	}
	public static void dropdownselection(WebElement element,String option,String input) {
	  Select s=new Select(element);
	  if (option.equals("index")) {
		int parseint=Integer.parseInt(input);
		s.selectByIndex(parseint);
	}else if (option.equals("value")) {
		s.selectByValue(input);
	}else if (option.equals("text")) {
		s.selectByVisibleText(input);
	}
	  
		
	}
	public static void clickonelement(WebElement element) {
		element.click();

	}
	public static WebDriver geturl(String url) {
		 
		driver.get(url);
		return driver;
		
	
	}
    public static void SingledropDown(WebElement element,int i) {
    	 Select s=new Select(element);
    	 s.selectByIndex(5);
    	 
    	// WebElement element= driver.findElement(By.xpath("(//select[@class='search_combobox'])[1]"));
 	    // Select s=new Select(element);
 	    // s.selectByIndex(5);
 	     
    	 
    	

	}
    public static void implicttime() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

    public static void dropdownselectionn(WebElement element,String option,String input) {
  	  Select s=new Select(element);
  	  if (option.equals("index")) {
  		int parseint=Integer.parseInt(input);
  		s.selectByIndex(parseint);
  	  }
    }

}
