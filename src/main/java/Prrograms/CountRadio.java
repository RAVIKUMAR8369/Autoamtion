package Prrograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CountRadio {
    public static void main(String[] args) {                  // Progrrame of count Radio button
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
       List<WebElement> button=driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println(button.size());



    }
}
