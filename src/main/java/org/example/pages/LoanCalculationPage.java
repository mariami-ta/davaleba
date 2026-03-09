package org.example.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class LoanCalculationPage {
    public Locator loanAmountTextField, enterLoanDuration,calculatedValue,loanButton;

    public LoanCalculationPage (Page page) {
        this.loanAmountTextField = page.locator("//div[contains(@class,'input-with-label')]//input").first();
        this.enterLoanDuration = page.locator("//div[contains(@class,'input-with-label')]//input").last();
        this.loanButton = page.locator("//button[contains(@class,'primary size-l ng-star-inserted state-initial')]");
        this.calculatedValue=page.locator("//span[contains(@id,'standard-calculator-result-payment')]");
    }
}
