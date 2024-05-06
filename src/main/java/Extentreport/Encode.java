package Extentreport;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.util.encoders.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class Encode {
    public static void main(String[] args) {
        String password="admin123";
       byte[] encodepsw= Base64.encode(password.getBytes());
        System.out.println(new String(encodepsw));


        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        //convert encode password to decode
      byte[] decodepsw=  Base64.decode("YWRtaW4xMjM=");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(new String(decodepsw));
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
