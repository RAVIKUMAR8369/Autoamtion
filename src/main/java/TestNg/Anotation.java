package TestNg;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Anotation {



    @Test(invocationCount = 4)            //Invacationcount  anotation are used to run one method multiple time
    public void Meth1() {
        System.out.println("Before one");
    }

    @Test(priority = 1)                     // priority you can set prority your according
    public void Meth2() {
        System.out.println("Method Two");
    }

    @Test(enabled = true)
    public void Love() {
        System.out.println("love");
    }

    @Test(groups ="ravi")
    public void Zone() {
        System.out.println("love");
    }
}
