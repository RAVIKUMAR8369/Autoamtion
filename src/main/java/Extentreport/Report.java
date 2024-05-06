package Extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.bouncycastle.util.test.TestResult;
import org.testng.Assert;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.*;
public class Report {
    //First i will make Three class object
    ExtentSparkReporter htmlReporter;
    ExtentReports reports;
    ExtentTest test;

    @BeforeTest
    public void Startreport() {
        htmlReporter = new ExtentSparkReporter("ExtentreportDemo.html");//name&path dena hi jaha report save karni hi
        reports = new ExtentReports();    //report ko initilize karna
        reports.attachReporter(htmlReporter);   //atteche karna hi report ko

        //Envionmet setup
        reports.setSystemInfo("Machine", "Testpc");
        reports.setSystemInfo("os", "Window");
        reports.setSystemInfo("User", "ravi");
        reports.setSystemInfo("Browser", "edge");
        //Configure look and feel
        htmlReporter.config().setDocumentTitle("Extent report demo");
        htmlReporter.config().setReportName("Test report");
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setTimeStampFormat("EEEE,MMMM,dd,yyyy,hh:mm a'('zzz')'");
    }

    @Test
    public void launchBrowser() {
        //Create test
        test = reports.createTest("Launcg Browser and Open url");
        Assert.assertTrue(true);  //passed
    }
@Test
    public void verifytitle() {
        //Create test
        test = reports.createTest("Launcg Browser and Open url");
        Assert.assertTrue(false);  //failled
    }
@Test
    public void verifylogo() {
        //Create test
        test = reports.createTest("Launcg Browser and Open url");
        Assert.assertTrue(true);  //passed
    }
@Test
    public void verifyemail() {
        //Create test
        test = reports.createTest("Launcg Browser and Open url");
        throw new SkipException("skip this test case");

    }
@Test
    public void verfyusername() {
        //Create test
        test = reports.createTest("Launcg Browser and Open url");
        Assert.assertTrue(true);  //passed
    }
    @AfterMethod
    public void gettestresult(ITestResult result){
        if (result.getStatus()== ITestResult.FAILURE){  // fail ho jata hi to
            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() +"Failed", ExtentColor.RED));

        }else if(result.getStatus()==ITestResult.SUCCESS){
            test.log(Status.PASS, MarkupHelper.createLabel(result.getName() +"pass", ExtentColor.GREEN));
        }else if(result.getStatus()==ITestResult.SKIP){
            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() +"Skip", ExtentColor.YELLOW));
        }

    }
    @AfterTest
    public void teardown(){
        reports.flush();  //this method mandetory
    }
}