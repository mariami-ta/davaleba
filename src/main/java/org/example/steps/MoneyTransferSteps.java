package org.example.steps;

import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;
import org.example.pages.MoneyTransferPage;

public class MoneyTransferSteps extends MoneyTransferPage {
    private final  Page page;

    protected MoneyTransferPage moneyTransferPage;
    public MoneyTransferSteps(Page page) {
        super(page);
        this.page = page;
        this.moneyTransferPage = new MoneyTransferPage(page);

    }


    public  MoneyTransferSteps clickAndEnterAmount (String string){
        moneyTransferPage.remittanceFee.scrollIntoViewIfNeeded();
        moneyTransferPage.remittanceFee.click();


        return this;



    }
    public MoneyTransferSteps changeCurrency () {
        chooseCurrency.waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        chooseCurrency.click();
        euroLocator.click();


        return this;

    }


public MoneyTransferSteps enterAmountField () {
    enterAmount.fill("3000");

    return this;
}
public MoneyTransferSteps enterChooseCountrey(){
        chooseCountry.click();
        return this;
}

    public MoneyTransferPage enterCountryLocator(){
        countryLocator.click();
        return this;
    }
   // public MoneyTransferSteps waitTransferCards(){

     //   return this;

   // }
}




