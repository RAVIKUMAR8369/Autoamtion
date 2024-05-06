package TestNg2;

import org.testng.annotations.*;

public class AnotationBeforeAfter {
    @BeforeSuite
    public void suit(){
        System.out.println("Before Suit");
    }
    @AfterSuite
    public void suit2(){
        System.out.println("After suit");
    }

    @BeforeTest
    public void Nama(){
        System.out.println("Before Test");
    }
    @AfterTest
    public void Nama2(){
        System.out.println("After Test");
    }
    @BeforeMethod               //@Before Method run Before every testcases
    public void Name(){         //After Method can run after every test case
        System.out.println("Before Method");
    }
    @AfterMethod
    public void Name6(){
        System.out.println("After method");
    }

    @BeforeClass             // Beforeclass metthod as the name sugges this method can run first after other test method run
    public void Name2(){
        System.out.println("Before class");
    }
  @Test
    public void Name3(){
        System.out.println("Test1");
    }
    @Test
    public void Name4(){
        System.out.println("Test2");
    }
    @AfterClass
    public void Name5(){
        System.out.println("After class");
    }
}
