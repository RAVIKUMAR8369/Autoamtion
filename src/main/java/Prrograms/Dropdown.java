package Prrograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement element = driver.findElement(By.xpath("//select[@ id='dropdown']"));
        Select select = new Select(element);
        // select.selectByIndex(2);
        // select.selectByVisibleText("Option 1");
        //  select.selectByValue("1");

        // if drop down write the multiple value
        //   if(select.isMultiple()==true){
        //     System.out.println("Dropdown is multiple");
        // }else {
        //   System.out.println("Not multiple");

        //If you want how much dropdown list present in dropdown
        List<WebElement> alloption =select.getOptions();
        for(WebElement el:alloption){
            System.out.println(el.getText());
        }
    }
}
