package Prrograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Switchtowindow {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
     driver.get("https://www.irctc.co.in/nget/train-search");
     driver.findElement(By.xpath("//span[@class='allcircle circletwo']")).click();
        Set<String> handles=driver.getWindowHandles();
        Iterator<String> id=handles.iterator();
       String parentid= id.next();
       String childid=id.next();
       driver.switchTo().window(childid);

     driver.findElement(By.xpath("//a[@title='Bus Tickets']")).click();

        System.out.println("Parentid"+ parentid);
        System.out.println("Child" + childid);

    }
}
