/*
 * Set of test script for testing Website Guru99 Bank
 * The test scripts is developed using Selenium Framework
 *
 */
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * 
 * @author Krishna Rungta
 *        Test Script 01
 *        ************** 
 *        Test Steps
 *        1)  Go to http://www.demo.guru99.com/V4/
          2) Enter valid UserId
          3) Enter valid Password
          4) Click Login
 */

public class TestScript01 {

    

    public static void main(String[] args) throws Exception {	  
	
    	//Setup Chrome driver    	
    	System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    	String baseUrl = "http://www.demo.guru99.com/V4/";
    	
    	// launch Firefox and direct it to the Base URL
    	driver.get(baseUrl);


	    // Enter username
	    driver.findElement(By.name("uid")).sendKeys("mngr1336");


      // git working day1

            system.out.println("i am rajesh")
            system.out.println("i am tester")
            system.out.println(" i am sandesh")
	    system.out.println(" i am sandesh")
           
          system.out.println(" i am tester1")
          i am tester 2 
          i am tester 3
        i am developer 1
        i am developer 2
		    i am developer 3
		    i am developer 4
   
		    








































































































	    // Enter Password
	    driver.findElement(By.name("password")).sendKeys("dAnavUq");
   
	    // Click Login
	    driver.findElement(By.name("btnLogin")).click();


	    }
	

    }

