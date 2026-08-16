package AutomatestPractice;

import Pages.CountryCompany;
import Templates.TestCase;
import Utils.ConfigReader;
import org.testng.annotations.Test;

@Test
public class CountryOfCompanyTests extends TestCase {
    public void CheckCountryOfCompany() {
        CountryCompany countryCompnay = new CountryCompany(bot);
        bot.navigateTo(ConfigReader.getProperty("W3SchoolsURL"));
        countryCompnay.GetCountryOfCompany();

    }
}
