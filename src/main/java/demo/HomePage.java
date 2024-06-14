package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class HomePage {

    private WebDriver driver;
    private By name = By.xpath("(//input[@type='text'])[1]");
    private By whyAutomation = By.xpath("//textarea");
    private By experience = By.xpath("(//div[@class='AB7Lab Id5V1'])[4]");
    private By java = By.xpath("(//div[@class='uHMk6b fsHoPb'])[1]");
    private By selenium = By.xpath("(//div[@class='uHMk6b fsHoPb'])[2]");
    private By testNG = By.xpath("(//div[@class='uHMk6b fsHoPb'])[4]");
    private By choose = By.xpath("//span[text()='Choose']");
    private By mr = By.xpath("(//div[@data-value='Mr'])[2]");
    private By dateElement = By.xpath("//input[@type='date']");
    private By hrsElement = By.xpath("//div[text()='Time']//following::input[@type='text'][1]");
    private By minsElement = By.xpath("//div[text()='Time']//following::input[@type='text'][2]");
    private By submitButton = By.xpath("//span[text()='Submit']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterDetails() throws InterruptedException{

        Wrapper wp = new Wrapper(driver);

        wp.navigate("https://forms.gle/wjPkzeSEk1CM7KgGA");
        wp.input(name, "Bhushan Dhamange");

        long epoch = System.currentTimeMillis()/1000;
        String message = "I want to be the best QA Engineer! "+ epoch;
      
        wp.input(whyAutomation, message);
        wp.click(experience);
        wp.click(java);
        wp.click(selenium);
        wp.click(testNG);

        wp.click(choose);
        wp.click(mr);
        
        Thread.sleep(2000);

        // driver.findElement(By.xpath("//div[text()='Date']//following::div[6]")).click();
        // driver.findElement(By.linkText("Today")).click();

        String date = Utils.getCurrentDateMinus7Days();        
        wp.input(dateElement, date);

        String time = Utils.getCurrentTime();
        String hrs = time.split("-")[0];
        String mins = time.split("-")[1];
        
        wp.input(hrsElement, hrs);
        wp.input(minsElement, mins);

        // driver.findElement(By.xpath("(//div[@class = 'e2CuFe eU809d'])[2]")).click();
        // driver.findElement(By.xpath("(//span[text()='PM'])[2]")).click();

        driver.navigate().to("https://www.amazon.in/");

        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        
        wp.click(submitButton);
    }
}
