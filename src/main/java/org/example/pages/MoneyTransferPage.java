package org.example.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class MoneyTransferPage {
    public Locator remittanceFee,enterAmount,chooseCurrency,chooseCountry,euroLocator,countryLocator,resultSection;

    public MoneyTransferPage (Page page){
        this.remittanceFee = page.locator("//span[contains(text(),'Remittance Fee Calculation')]");
        this.enterAmount = page.locator("//input[contains(@class,'input ng-pristine ng-valid ng-touched')]");
        this.chooseCurrency = page.locator("//div[contains(@class,'tbcx-dropdown-selector__selection-text__slot__container ng-star-inserted')]");
        this.chooseCountry = page.locator("//div[contains(@class,'tbcx-label ng-star-inserted')]");
        this.euroLocator = page.locator("//div[contains(text(),'EUR')]");
        this.countryLocator = page.locator("//div[contains(text(),'Greece')]");
        this.resultSection = page.locator("//div[contains(@class,'tbcx-pw-money-transfer-fee-calculator__cards')]//div[contains(@class,'tbcx-pw-money-transfer-system-card')]");

    }

}

