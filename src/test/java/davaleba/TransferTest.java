package davaleba;

import baseTests.BaseTest;
import org.example.pages.MoneyTransferPage;
import org.example.steps.MoneyTransferSteps;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.example.data.Constants.TRANSFER_URL;

public class TransferTest extends BaseTest {


    private MoneyTransferSteps moneyTransferSteps ;
    private MoneyTransferPage moneyTransferPage;

    @BeforeClass

    public void setup() {

        moneyTransferPage = new MoneyTransferPage(getPage());
        moneyTransferSteps = new MoneyTransferSteps(getPage());
        page.navigate(TRANSFER_URL);


    }
    @Test
    public void moneytransfer() throws  InterruptedException{

        moneyTransferSteps
                .clickAndEnterAmount("1000")
                .changeCurrency()
                .enterAmountField()
                .enterChooseCountrey()
                .enterCountryLocator();
        Assert.assertTrue(moneyTransferPage.resultSection.count()>0);
        Thread.sleep(5000);

    }


}



