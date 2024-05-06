package Prrograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Screenshot {
    public static void main(String[] args) throws IOException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://classic.freecrm.com/");
        TakesScreenshot screenshot=(TakesScreenshot)driver;
            File src= screenshot.getScreenshotAs(OutputType.FILE);
            File dest=new File("C:\\Users\\Ravi8\\OneDrive\\Desktop\\Eclips\\ravi.png");
            FileUtils.copyFile(src,dest);

    }
}
