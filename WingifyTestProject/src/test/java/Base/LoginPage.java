package Base;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage {


// LOGIN PAGE//
	
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
       
        String expected_title= "Demo";
        //checkpoint//
        String actual_title = driver.getCurrentUrl();
        if(expected_title.equals(actual_title)) {
        	System.out.println("Login Successfull");
        } else
        	System.out.println("Login Failed");
        driver.close();
        
       
        
		
       
        }
        
	}


