package Base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {

	
	
		public static void main(String[] args) throws InterruptedException {
			//WebDriverManager.chromedriver().setup();
			System.setProperty("WebDriver.Chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://sakshingp.github.io/assignment/login.html");		
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.findElement(By.id("username")).sendKeys("Admin");
	        driver.findElement(By.id("password")).sendKeys("admin123");
	        driver.findElement(By.id("log-in")).click();
	        
	        //table
	       List<WebElement> names  = driver.findElements(By.id("transactionsTable"));
	       String[] afterSort_name = new String[names.size()];
	       driver.findElement(By.id("amount")).click();
	      for(int i = 0;i<name.size()i++);
	    	  AfterSort_name[i]=name.get(i).getText().trim();
		}
		
      Assert.assertEquals(afterSort_name, beforeSort_name);
      system.out.print("sort verified properly");
      
	       
	       
	}

}
