package Prrograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Slidermove {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.w3schools.com/howto/howto_js_rangeslider.asp");
          WebElement slider=driver.findElement(By.xpath("//body/div[@id='belowtopnav']/div[@class='w3-row w3-white']/div[@id='main']/div[@id='slidecontainer']/input[1]"));

        Actions actions=new Actions(driver);
        actions.dragAndDropBy(slider,102,14).perform();
        System.out.println("location of slider" +slider.getLocation());
        System.out.println("hight & width of element" + slider.getSize());
    }

        }


