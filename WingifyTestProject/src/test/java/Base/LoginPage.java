package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

public class LoginPage {


	private static final String Assert = null;

	public static void main(String[] args) throws Exception {
		
		 //LOGIN Page
		
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
					 
					 String title = "John Doe customer";
					 String actualTitle=driver.getTitle();
					 
					 System.out.println("Verifying the page title has started");
					 Assert.contentEquals("John Doe custome");
					 System.out.println("The Page title has been successfully verified");
					  
					 
					 driver.quit();
					 
	}

	
					 
					
						
						
						

	}

