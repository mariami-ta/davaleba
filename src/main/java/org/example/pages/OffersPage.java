package org.example.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class OffersPage {

    public Locator filterPanel;
    public Locator offerCardList;
    public Locator partnerOffer;
    public Locator visaOffer;
    public Locator noResultTitle;
    public Locator offerCardItems;
    public Locator clearFilterButton;

    public OffersPage(Page page) {

        filterPanel = page.locator("//div[contains(@class,'filters')]");
        offerCardList = page.locator("//div[contains(@class,'marketing__cards-list')]");
        partnerOffer = page.locator("//div[contains(text(),'პარტნიორების შეთავაზება')]");
        visaOffer = page.locator("//div[contains(text(),'ვიზა')]");
        noResultTitle = page.locator("//h3[contains(@class,'offers__empty-state-title')]");
        offerCardItems = page.locator("//div[contains(@class,'marketing__cards-list')]//a");
        clearFilterButton = page.locator("//button[contains(@class,'filter__button')]");

    }

}
