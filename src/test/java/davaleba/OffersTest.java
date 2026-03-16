package davaleba;

import baseTests.BaseTest;
import org.example.pages.OffersPage;
import org.example.steps.OffersSteps;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.example.data.Constants.OFFER_URL;

public class OffersTest  extends BaseTest {
    private OffersPage offersPage;
    private OffersSteps offersSteps;


    @BeforeClass
     public void setup(){
        offersPage= new OffersPage(getPage());
        offersSteps = new OffersSteps(getPage());
        page.navigate(OFFER_URL);

    }

    @Test
    public void openOffers() {

        offersPage.filterPanel.waitFor();
        offersPage.offerCardList.waitFor();

        Assert.assertTrue(offersPage.filterPanel.isVisible());
        Assert.assertTrue(offersPage.offerCardList.isVisible());

        offersSteps
                .clickPartnerOffer()
                .clickVisaOffer();

        offersPage.noResultTitle.waitFor();
        Assert.assertTrue(offersPage.noResultTitle.isVisible());

        offersSteps.clearAllFilters();

        offersPage.offerCardItems.first().waitFor();
        Assert.assertTrue(offersPage.offerCardItems.count() > 0);
    }
}
