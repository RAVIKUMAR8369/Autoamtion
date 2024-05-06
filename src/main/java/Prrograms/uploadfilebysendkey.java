package Prrograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

public class uploadfilebysendkey {
    public static void main(String[] args) throws IOException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("https://demoqa.com/upload-download");     //SendKey() method are used where type=file Xpath ho
        driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\Ravi8\\OneDrive\\Desktop\\Ravi AM resume.docx");

    }
}
