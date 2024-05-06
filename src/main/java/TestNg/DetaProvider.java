package TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DetaProvider {

    @DataProvider(name="serachdata")                                                             //indai,Qutabminar
    public Object[][] searchData() {                           //Agra, tajmahal
        Object[][] searchkeyword = new Object[3][2];           //hydrabaad,charminar
        searchkeyword[0][0]="india";
        searchkeyword[0][1]="qutab Minar";

        searchkeyword[1][0]="Agra";
        searchkeyword[1][1]="Taj mahal";

        searchkeyword[2][0]="hydrabad";
        searchkeyword[2][1]="charminar";
        return searchkeyword;

    }



@Test(dataProvider = "serachdata")
    public void Method(String Country,String place){
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
             WebElement searchelement=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
             //enter text in seachelement
             searchelement.sendKeys(Country+" " +place);
             driver.findElement(By.xpath("//input[@value='Google Search']")).click();
    }
}
