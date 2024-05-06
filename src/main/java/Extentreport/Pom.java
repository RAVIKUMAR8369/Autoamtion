package Extentreport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Pom {

    public class Orangehrm {

        public String baseurl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        public WebDriver driver;
        @BeforeTest
        public void launch() {
            //WebDriverManager.edgedriver().setup();
            driver=new ChromeDriver();
            driver.get("baseurl");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
    	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
    	 driver.findElement(By.xpath("//button[@type='submit']")).click();
		String expectedresult="OrangeHRM";
    	String actualresult= driver.getTitle();
    	Assert.assertEquals(actualresult, expectedresult);*/

        }
        @Test
        public void Login() {
            driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
            driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            String expectedresult="OrangeHRM";
            String actualresult= driver.getTitle();
            Assert.assertEquals(actualresult, expectedresult);

        }
    }

}
