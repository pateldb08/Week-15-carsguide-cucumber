package au.com.carsguide.steps;

import au.com.carsguide.pages.FindDealerPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class FindDealerSteps {
    @And("^I click ‘Find a Dealer’ link$")
    public void iClickFindADealerLink() throws InterruptedException {
        Thread.sleep(500);
        new FindDealerPage().clickOnFindADealer();
    }

    @Then("^I see the dealer lists$")
    public void iSeeTheDealerLists(DataTable dataTable) {
        List<String> expectedList = dataTable.asList(String.class);
        for (String data : expectedList) {
            while (new FindDealerPage().gettingNameOfDealer(data) == null) {
                new FindDealerPage().clickOnNextButton();
            }
            Assert.assertEquals("Dealer name not found!", data, new FindDealerPage().gettingNameOfDealer(data));
        }
    }
}
