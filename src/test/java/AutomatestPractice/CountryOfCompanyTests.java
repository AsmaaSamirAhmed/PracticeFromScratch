package AutomatestPractice;

import Pages.CountryCompany;
import Templates.TestCase;
import org.testng.annotations.Test;

@Test
public class CountryOfCompanyTests extends TestCase {
    public void CheckCountryOfCompany() {
        CountryCompany countryCompnay = new CountryCompany(bot);
        bot.navigateTo("https://www.w3schools.com/html/html_tables.asp");
        countryCompnay.GetCountryOfCompany();

    }
}
