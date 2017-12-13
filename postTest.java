package FacebookPost;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class postTest {
	 public static void main(String[] args) throws InterruptedException {

		  System.setProperty("webdriver.gecko.driver",
		    "C:\\Users\\Ademola Bhadmus\\Documents\\HTC\\Learning Folder\\Facebook Assignment\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  //To get facebook address
		  driver.get("http://www.facebook.com");
		  driver.manage().window().maximize();
		  
		  //To check that the correct site has been displayed
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		  
		  //to insert email in the email field
		  WebElement email = driver.findElement(By.name("email"));
		     email.clear();
		     email.sendKeys("a*******s@hotmail.com");
		     
		     
		     //To insert password in the passowrd field
		     WebElement password = driver.findElement(By.name("pass"));
		     password.clear();
		     password.sendKeys("********");
		     
		     //To log in 
		     WebElement loginbutton = driver.findElement(By.id("loginbutton"));
		     loginbutton.click();
		     System.out.println("Log in milestone passed");
		     Thread.sleep(3000);
		    
		     //To post Hello world Message
		     WebElement status =driver.findElement(By.xpath("//textarea[@name='xhpc_message']"));
		        status.sendKeys("Hello World");
		        WebDriverWait wait = new WebDriverWait(driver,5);
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Post']"))).click();
		        System.out.println("Post message milestone passed!");  
		        Thread.sleep(5000);
		  driver.close();

		 }
	}
