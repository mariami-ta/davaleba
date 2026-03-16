package org.example.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class OffersPage {

    public Locator filterPanel,offerCardList,partnerOffer,visaOffer,noResultTitle,offerCardItems,clearFilterButton;

    public OffersPage (Page page){
        this.filterPanel = page.locator("//div[contains(@class,'filters ng-star-inserted')]");
        this.offerCardList = page.locator("//div[contains(@class,'marketing__cards-list ng-star-inserted')]");
        this.partnerOffer = page.locator("//div[contains(text(),'პარტნიორების შეთავაზება')]");
        this.visaOffer = page.locator("//div[contains(text(),'ვიზა')]");
        this.noResultTitle = page.locator("//h3[@class='offers__empty-state-title']");
        this.offerCardItems = page.locator("//div[contains(@class,'marketing__cards-list')]//a");
        this.clearFilterButton = page.locator("//button[contains(@class,'filter__button ng-star-inserted')]");




    }
}
