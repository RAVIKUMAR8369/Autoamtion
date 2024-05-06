package Prrograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Draganddrop {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver= new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("https://practice.expandtesting.com/drag-and-drop");
     WebElement saurce= driver.findElement(By.xpath("//div[@id='column-a']"));
     WebElement Drag= driver.findElement(By.xpath("//div[@id='column-b']"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(saurce,Drag).perform();


    }
}
