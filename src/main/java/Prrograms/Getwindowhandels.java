package Prrograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Getwindowhandels {
    public static void main(String[] args) {
       WebDriverManager.edgedriver().setup();
       WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
    //    System.out.println(driver.getWindowHandles());
        //second method
        Set<String> windowids=driver.getWindowHandles();//Set used to window set

       Iterator<String> id=windowids.iterator();   //itrater interface used
             String parentid=id.next();
             String childid=id.next();
        System.out.println("parent.."+ parentid);
        System.out.println("child.."+childid);


    }
}
