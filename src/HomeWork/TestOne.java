package HomeWork;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestOne extends BaseDriver {

    @Test
    public void soru1() {

        driver.get("https://demoqa.com/text-box");

        String name = "Eren YUKSEK";
        String mail = "Testing@gmail.com";
        WebElement fullName = driver.findElement(By.cssSelector("[id='userName-wrapper']>div+div>input"));
        fullName.sendKeys(name);

        MyFunc.Bekle(3);

        WebElement eMail = driver.findElement(By.cssSelector("[id='userEmail-wrapper'] > :nth-child(2)>input"));
        eMail.sendKeys(mail);
        MyFunc.Bekle(3);

        WebElement currentAddress = driver.findElement(By.cssSelector("[id='currentAddress-wrapper'] > :nth-last-child(1)>textarea"));
        currentAddress.sendKeys("Testing Current Address");
        MyFunc.Bekle(3);

        WebElement permanentAddress = driver.findElement(By.cssSelector("[id='permanentAddress-wrapper'] > :nth-last-child(1)>textarea"));
        permanentAddress.sendKeys("Testing Permanent Address");
        MyFunc.Bekle(3);

        WebElement submit = driver.findElement(By.cssSelector("[id='userForm']>:nth-last-child(2)>div>button"));
        submit.click();
        MyFunc.Bekle(3);

        WebElement controlName = driver.findElement(By.cssSelector("[id='userForm']>:nth-last-child(1)>div>p"));
        Assert.assertTrue("Does not contain : " + name, controlName.getText().contains(name));
        WebElement eMailControl = driver.findElement(By.cssSelector("[id='userForm']>:nth-last-child(1)>div>:nth-child(2)"));
        Assert.assertTrue("Does not contain : " + mail, eMailControl.getText().contains(mail));


        finishDriver();
    }
}
