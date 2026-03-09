package davaleba;

import baseTests.BaseTest;
import org.example.steps.LoanCalculationSteps;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.example.data.Constants.LOAN_URL;

public class FirstSession extends BaseTest {
    private LoanCalculationSteps loanSteps;

    @BeforeClass

    public void  setup() {

        loanSteps= new LoanCalculationSteps(getPage());
        page.navigate(LOAN_URL);

    }


    @Test
    public void loanCalculator() throws InterruptedException {
 loanSteps.enterLoanamount("3000")
         .enterLoanDuration("48")
         .tapLoanButton()
         .enterLoanamount("8000")
         .enterLoanDuration("48")
         .tapLoanButton();
          Thread.sleep(5000);

    }


}

