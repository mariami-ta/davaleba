package davaleba;

import baseTests.BaseTest;
import com.microsoft.playwright.Page;
import org.example.pages.LoansPage;
import org.example.pages.MoneyTransferPage;
import org.example.steps.LoansSteps;
import org.example.steps.MoneyTransferSteps;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.example.data.Constants.TRANSFER_URL;

public class LoanTest extends BaseTest {
    private LoansPage loansPage ;
    private LoansSteps loansSteps;
    @BeforeClass

    public void setup() {

        loansPage = new LoansPage(getPage());
        loansSteps = new LoansSteps(getPage());


    }

    @Test
    public void applyLoanRedirectTest() {

        loansSteps
                .openLoansPage()
                .openConsumerTerms();

        loansPage.applyButton.waitFor();

        Assert.assertTrue(loansPage.applyButton.isVisible());
        Assert.assertTrue(loansPage.applyButton.isEnabled());

        Page newPage = page.waitForPopup(() -> {
            loansSteps.clickApply();
        });

//        newPage.waitForURL("**tbccredit.ge**");

        Assert.assertTrue(newPage.url().contains("tbccredit"));
        loansPage.creditForm.waitFor();

        Assert.assertTrue(loansPage.creditForm.isVisible());
    }
}