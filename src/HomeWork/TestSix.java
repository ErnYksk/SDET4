package HomeWork;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestSix extends BaseDriver {

    @Test
    public void soru6(){
        driver.get("https://testpages.herokuapp.com/styled/index.html ");

        WebElement fakeAlert=driver.findElement(By.cssSelector("[class='page-body'] >:nth-child(6)>:nth-child(5)>ul>:nth-child(2)>a"));
        fakeAlert.click();
        MyFunc.Bekle(2);

        WebElement click=driver.findElement(By.cssSelector("[class='centered']~div>input"));
        click.click();
        MyFunc.Bekle(2);

        WebElement ok=driver.findElement(By.cssSelector("[id='dialog']>:nth-child(2)>div>button"));
        ok.click();
        MyFunc.Bekle(2);

        finishDriver();



    }
}
