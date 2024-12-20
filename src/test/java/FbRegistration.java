import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class FbRegistration {

    @Test
    public void fbReg(){
        open("https://www.facebook.com/");
        SelenideElement newaCbtn = $(byText("Create new account"));
        newaCbtn.click();

        SelenideElement firstName = $(byName("firstname"));
        firstName.setValue("Rusa");

        SelenideElement lastName = $(byName("lastname"));
        lastName.setValue("Korinteli");

        SelenideElement eMail = $(byName("reg_email__"));
        eMail.setValue("korintelirusudanO@gmail.com");

        SelenideElement passWord = $(byName("reg_passwd__"));
        passWord.setValue("password123");

        $("#day").selectOption("10");
        $("#month").selectOption("Nov");
        $("#year").selectOption("2000");
        $(byText("Custom")).click();
        SelenideElement pronoun = $("#preferred_pronoun");
        pronoun.shouldBe(visible);
        pronoun.selectOption(1);
        $("#custom_gender").shouldBe(visible);

        $(byText("Female")).click();
        pronoun.shouldNotBe(visible);
        $("#custom_gender").shouldNotBe(visible);
       // sleep(5000);




 }
}
