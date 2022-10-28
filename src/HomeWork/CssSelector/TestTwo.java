package HomeWork.CssSelector;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestTwo extends BaseDriver {

    @Test
    public void soru2(){
        driver.get("https://demo.applitools.com/");
        String name="ttechno@gmail.com";
        String pass="techno123";

        WebElement userName=driver.findElement(By.cssSelector("[class='auth-box-w']>:nth-last-child(1)>div>label~input"));
        userName.sendKeys(name);
        MyFunc.Bekle(2);

        WebElement password=driver.findElement(By.cssSelector("[class='auth-box-w']>:nth-last-child(1)>:nth-child(2)>label~input"));
        password.sendKeys(pass);
        MyFunc.Bekle(2);

        WebElement submit=driver.findElement(By.cssSelector("[class='auth-box-w']>:nth-last-child(1)>:nth-last-child(1)>a"));
        submit.click();
        MyFunc.Bekle(2);

        WebElement check=driver.findElement(By.id("time"));

        Assert.assertTrue("Does not contain ",check.getText().contains("Your nearest branch closes in: 30m 5s"));








      finishDriver();

    }
}
