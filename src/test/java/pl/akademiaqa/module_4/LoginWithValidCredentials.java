package pl.akademiaqa.module_4;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.Test;
import pl.akademiaqa.common.BaseTest;

public class LoginWithValidCredentials extends BaseTest {

    @Test
    void should_login_with_valid_credentials() {
        page.getByLabel("Username").fill("tomsmith");
        page.getByLabel("Password").click();
        page.getByLabel("Password").fill("SuperSecretPassword!");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
        PlaywrightAssertions.assertThat(page.locator("text=You logged into a secure area")).isVisible();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Logout")).click();
        PlaywrightAssertions.assertThat(page.locator("text=You logged out of the secure area")).isVisible();
//        page.fill("#username", "tomsmith");
//        page.fill("#password", "SuperSecretPassword!");
//        page.click("#login button");
//
//        PlaywrightAssertions.assertThat(page.locator("text=You logged into a secure area")).isVisible();
//        page.click("//i[contains(text(),'Logout')]");
//
//        PlaywrightAssertions.assertThat(page.locator("text=You logged out of the secure area!")).isVisible();
        //page.waitForNavigation();
        //Assertions.assertThat(page.url()).isEqualTo("https://akademiaqa.pl/moje-konto/");


    }

    @Test
    void should_username_is_valid()
    {

        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
        PlaywrightAssertions.assertThat(page.locator("text=Your username is invalid!")).isVisible();
    }
    @Test
    void should_login_with_invalid_credentials() {

        page.getByLabel("Username").fill("tomsms");
        page.getByLabel("Password").click();
        page.getByLabel("Password").fill("SuperSecretPasswors!");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
        PlaywrightAssertions.assertThat(page.locator("text=Your username is invalid!")).isVisible();
    }

}
