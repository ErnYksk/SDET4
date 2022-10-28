package HomeWork.XPath;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestOne extends BaseDriver {
    @Test
    public void Test() {
        driver.get("http://demoqa.com/text-box");
//Name
        String fullName = "Automation";
        String mailAddress = "Testing@gmail.com";
        WebElement name = driver.findElement(By.xpath("//*[@id='userName']"));
        name.sendKeys(fullName);
        MyFunc.Bekle(2);
//Email
        WebElement eMail = driver.findElement(By.xpath("//*[@type='email']"));
        eMail.sendKeys(mailAddress);
        MyFunc.Bekle(2);
//Current Address
        WebElement curAddress = driver.findElement(By.xpath("//*[@placeholder='Current Address']"));
        curAddress.sendKeys("Testing Current Address");
        MyFunc.Bekle(2);
//Permanent Address
        WebElement perAddress = driver.findElement(By.xpath("//*[@rows='5' and @id='permanentAddress']"));
        perAddress.sendKeys("Testing Permanent Address");
        MyFunc.Bekle(2);
//Submit
        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();
        MyFunc.Bekle(2);
//Check Full name contains "Automation" is displayed without isDisplayed!!
        WebElement checkName = driver.findElement(By.xpath("//*[@class='border col-md-12 col-sm-12']//*[@id='name']"));
        Assert.assertTrue(fullName + " is not displayed!!", checkName.getText().contains(fullName));
        MyFunc.Bekle(2);
//Check Email contains "Testing" is displayed without isDisplayed!!
        WebElement checkEmail = driver.findElement(By.xpath("//*[@class='border col-md-12 col-sm-12']//*[@id='email']"));
        Assert.assertTrue(mailAddress + " is not displayed!!", checkEmail.getText().contains(mailAddress));
        MyFunc.Bekle(2);


        finishDriver();


    }


}
