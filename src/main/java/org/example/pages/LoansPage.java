package org.example.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class LoansPage {

    public Locator loansMenu;
    public Locator customerTerms;

    public Locator applyButton;
    public Locator creditForm;

    public LoansPage(Page page){

        loansMenu = page.locator("//a[contains(@href,'loans')]");
        customerTerms = page.locator("//button[text()='Terms']").first();
        applyButton = page.locator("//button[text()='Apply']");
        creditForm = page.locator("//form");

    }
}