package pl.akademiaqa.module_5;

import org.junit.jupiter.api.Test;
import pl.akademiaqa.common.BaseTest;

public class _3Text_Test extends BaseTest {

    @Test

    void text_test() {
        page.navigate("http://localhost:7080/login");


        //1.innerHTML()-tags+text
        //System.out.println(page.innerHTML("#content"));


        //2.innerText()-text
        //System.out.println(page.innerText("#content"));

        //3.textContent()-text, widoczny i niewidoczny
        System.out.println(page.textContent("#content"));


        //4.getAttribute()-wartość atrybutu
        System.out.println(page.getAttribute("div-img", "alt"));
    }


}
