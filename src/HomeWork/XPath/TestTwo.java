package HomeWork.XPath;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestTwo extends BaseDriver {

    //1) Bu siteye gidin. -> https://demo.applitools.com/
//2) Username kısmına "ttechno@gmail.com" girin.
//3) Password kısmına "techno123." girin.
//4) "Sign in" buttonunan tıklayınız.
//5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.
    @Test
    public void Test() {

        driver.get("https://demo.applitools.com/");
//UserName
        WebElement userName = driver.findElement(By.xpath("//*[@id='username']"));
        userName.sendKeys("ttechno@gmail.com");
        MyFunc.Bekle(2);

//Password
        WebElement password = driver.findElement(By.xpath("//*[@class='form-group']//*[@id='password']"));
        password.sendKeys("techno123.");
        MyFunc.Bekle(2);

//SignIn
        WebElement signIn = driver.findElement(By.xpath("//*[@class='auth-box-w']//*[@class='buttons-w']//*[@id='log-in']"));
        signIn.click();
        MyFunc.Bekle(2);

//Check the text
        String text = "Your nearest branch closes in: 30m 5s";
        WebElement check = driver.findElement(By.xpath("//*[@id='time']"));
        Assert.assertTrue(text + " is not displayed!! ", check.getText().contains(text));


        finishDriver();


    }


}
