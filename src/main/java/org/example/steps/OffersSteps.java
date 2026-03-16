package org.example.steps;

import com.microsoft.playwright.Page;
import org.example.pages.OffersPage;

public class OffersSteps extends OffersPage {
    private final  Page page;

    protected OffersPage offersPage;
    public OffersSteps(Page page){

        super(page);
        this.page=page;
        this.offersPage = new OffersPage(page) ;
    }

    public OffersSteps clickPartnerOffer(){
        offersPage.partnerOffer.scrollIntoViewIfNeeded();
        offersPage.partnerOffer.click();

        return this;
    }
    public OffersSteps clickVisaOffer(){
        offersPage.visaOffer.scrollIntoViewIfNeeded();
        offersPage.visaOffer.click();


        return this;
    }
    public OffersSteps clearAllFilters() {
        offersPage.clearFilterButton.first().click();
        offersPage.clearFilterButton.last().click();


        return this;
    }






}
