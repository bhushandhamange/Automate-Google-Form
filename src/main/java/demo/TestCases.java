package demo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCases {
    WebDriver driver;

    public TestCases() {

        System.out.println("Constructor: TestCases");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
       
    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }
   
    public  void testCase01() throws InterruptedException{

        System.out.println("Start Test case: testCase01");

        HomePage hp = new HomePage(driver);        
        hp.enterDetails();
       
        SuccessPage sp = new SuccessPage(driver);
        sp.printSuccessMessage();
        
        System.out.println("end Test case: testCase01");
    }


}
