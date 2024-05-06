package Net;

import TestNg.Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Opera {
    public static WebDriver driver = Demo.getDriver();
    @Test
        public void fileupload () {
            driver.get("https://the-internet.herokuapp.com");
        JavascriptExecutor javascriptExecutor=((JavascriptExecutor)driver );
        WebElement element=driver.findElement(By.xpath("//a[@href='/windows']"));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",element);


           // driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Ravi8\\OneDrive\\Desktop\\Ravi pic");
          //  System.out.println(driver.getWindowHandle());
      //  Actions actions=new Actions(driver);
         //   driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        }
    }
