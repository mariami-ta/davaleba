package org.example.steps;

import com.microsoft.playwright.Page;
import org.example.pages.LoanCalculationPage;
import com.microsoft.playwright.assertions.LocatorAssertions;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class LoanCalculationSteps extends LoanCalculationPage {

    private final Page page;

    public LoanCalculationSteps(Page page) {
        super(page);
        this.page = page;
    }
    public LoanCalculationSteps enterLoanamount (String string) {
        loanAmountTextField.scrollIntoViewIfNeeded();
        loanAmountTextField.fill(string);

        return this;
    }
    public  LoanCalculationSteps enterLoanDuration (String string) {
        enterLoanDuration.fill(string);

        return this;
    }
    public LoanCalculationSteps tapLoanButton () {
        loanButton.click();
//        assertThat(calculatedValue).hasText("76");
        return this;

    }

}


