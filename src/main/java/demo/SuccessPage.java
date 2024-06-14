package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessPage {

    private WebDriver driver;
    private By successElement = By.xpath("//div[@class='vHW8K']");

    public SuccessPage(WebDriver driver){
        this.driver = driver;
    }

    public void printSuccessMessage(){
        Wrapper wp = new Wrapper(driver);
        String message = wp.getText(successElement);
        System.out.println(message);
    }
}

