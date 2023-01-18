package Base;

import org.apache.commons.compress.harmony.pack200.IntList;
import org.apache.commons.compress.utils.Lists;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.w3c.dom.NameList;

public class Homepage {

	private static final String List = null;
	private static final boolean sortFunctionality = false;

	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.Chrome.Driver", "C:\\chromedriver_win32\\Chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
				driver.get("https://sakshingp.github.io/assignment/login.html");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				WebElement Login =driver.findElement(By.className("auth-header"));
				
				System.out.println("Clicking on the login form in the main page");
				Login.click();
			 driver.findElement(By.id("username")).sendKeys("Admin");
			 driver.findElement(By.id("password")).sendKeys("admin123");
			 driver.findElement(By.id("log-in")).click();
			 
			 //HOMEPAGE
			 
			 System.out.println("Headers in table are below");
			
			 driver.findElement(By.xpath("//div[@class='element-wrapper']")).click();
		 driver.findElement(By.name("sortTable(4")).click();
			 
			
			 
			 if(sortFunctionality)
			 {
				 System.out.println("SORT FUNCTIONALITY IS WORKING");
			 }
			 else
			 {
				 System.out.println("SORT FUNCTIONALITY IS NOT WORKING");
				 
				 driver.quit();
			 }
	}
	
			 
				 

	}


