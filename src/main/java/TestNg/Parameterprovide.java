package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterprovide {

@Test(priority = 1)
@Parameters({"i","j"})
    public void add(int a, int b){
        System.out.println(a+b);
    }
    @Test(priority = 2)
    @Parameters({"i","j"})
    public void sub(int a,int b){
        System.out.println(a-b);
    }
    @Test(priority = 3)
    @Parameters({"i","j"})
    public void mul(int a,int b){
        System.out.println(a*b);
    }
}
