package listners;

import Utility.Screenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestListners implements ITestListener {
    public void onTestStart(ITestResult iTestResult) {
        Reporter.log("Test cases has been started");
    }

    public void onTestSuccess(ITestResult iTestResult) {
        Reporter.log("Test cases is green");
        Screenshot.takeScreenShot(iTestResult.getName());
    }

    public void onTestFailure(ITestResult iTestResult) {
        Reporter.log("Test cases is failed");
        Screenshot.takeScreenShot(iTestResult.getName());
    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}

