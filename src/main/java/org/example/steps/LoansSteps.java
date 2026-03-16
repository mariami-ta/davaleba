package org.example.steps;

import com.microsoft.playwright.Page;
import org.example.pages.LoansPage;

public class LoansSteps {

    private final Page page;
    private final LoansPage loansPage;

    public LoansSteps(Page page){
        this.page = page;
        this.loansPage = new LoansPage(page);
    }

    public LoansSteps openLoansPage(){
        page.navigate("https://tbcbank.ge/en/loans/consumer-loan");
        return this;
    }

    public LoansSteps openConsumerTerms(){
        loansPage.customerTerms.waitFor();
        loansPage.customerTerms.click();

        return this;
    }

    public LoansSteps clickApply(){
        loansPage.applyButton.scrollIntoViewIfNeeded();
        loansPage.applyButton.click();
        return this;
    }

}