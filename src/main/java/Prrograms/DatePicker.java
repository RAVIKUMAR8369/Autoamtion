package Prrograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DatePicker {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get("https:classic.freecrm.com");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rrvautomation");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("rrvautomation");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='mainpanel']")));
        Actions actions = new Actions(driver);
        WebElement mar = driver.findElement(By.xpath("//a[@title='Tasks']"));
        WebElement apr = driver.findElement(By.xpath("//a[@title='New Task']"));
        actions.moveToElement(mar).moveToElement(apr).click().build().perform();
        driver.findElement(By.xpath("//img[@id='f_trigger_c_deadline']")).click();
        List<WebElement> cal = driver.findElements(By.xpath("//div[@class='calendar']//tr[@class='daysrow']//td[@class='day']"));
        for (int a = 0; a <= cal.size() - 1; a++)
            if (cal.get(a).getText().equals("11")) {
                cal.get(a).click();
                break;

            }
    }
}