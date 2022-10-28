package HomeWork.CssSelector;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestFive extends BaseDriver {

    @Test
    public void soru5(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlert=driver.findElement(By.cssSelector("[class='page-body'] >:nth-child(6)>:nth-child(5)>ul>:nth-child(2)>a"));
        fakeAlert.click();
        MyFunc.Bekle(2);

        WebElement click=driver.findElement(By.cssSelector("[class='page-body'] >:nth-child(5)>input"));
        click.click();
        MyFunc.Bekle(2);

        WebElement ok=driver.findElement(By.cssSelector("[id='dialog']>:nth-child(2)>div>button"));
        ok.click();
        MyFunc.Bekle(2);

    finishDriver();

    }


}
