package HomeWork.XPath;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestThree extends BaseDriver {
    @Test
    public void Test() {


//Search
        driver.get("https://www.snapdeal.com/");
        WebElement search = driver.findElement(By.xpath("//input[@name='keyword' and @type='text' and @id='inputValEnter']"));
        search.sendKeys("teddy bear");
        MyFunc.Bekle(2);
//Click
        WebElement click = driver.findElement(By.xpath("//*[@class='header_wrapper']//*[@class='searchTextSpan']"));
        click.click();
        MyFunc.Bekle(2);
//Check text
        WebElement check = driver.findElement(By.xpath("//*[@id='searchMessageContainer']//*[@class='nnn']"));
        Assert.assertTrue("Could not find the text!!", check.getText().contains("results for teddy bear"));
        MyFunc.Bekle(2);


        finishDriver();
    }
}
