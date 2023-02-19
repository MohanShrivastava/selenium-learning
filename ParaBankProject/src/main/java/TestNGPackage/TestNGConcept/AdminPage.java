package TestNGPackage.TestNGConcept;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AdminPage {
    @Test(testName = "We can see this Test")
    public void clickAdminPage() {
        System.out.println("We clicked on Admin Page");
        Reporter.log("Admin page Clicked in Reports");
    }
    @Test(groups ={"process1"})

            public void clickLoanProcessor() {
        System.out.println("We clicked on Loan Processor");
        Reporter.log("LoanProcessor Clicked in reports");
    }
    @Test(groups ={"process2","process1"})
    public void clickLoanProvider() {
        System.out.println("We clicked on Loan Provider");
        Reporter.log("LoanProvider Clicked in reports");
    }

}
