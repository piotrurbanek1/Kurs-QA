package pl.akademiaqa.module_5;

import org.junit.jupiter.api.Test;
import pl.akademiaqa.common.BaseTest;

public class _2inputTest extends BaseTest {

    @Test
    void input_test() {
        page.navigate("http://localhost:7080/login");
        page.fill("#username", "tomsmith");//wkleja cały tekst
        page.type("#password", "SuperSecretPassword!");//wpisuje tekst literka po literce
        //page.fill("#password", "SuperSecretPassword!", new Page.FillOptions().setForce(true));//wpisuje tekst literka po literce z opóźnieniem
    }
}
