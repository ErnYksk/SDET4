package HomeWork.XPath;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestFour extends BaseDriver {
    @Test
    public void Test() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");
//Click Calculate
        WebElement calculate = driver.findElement(By.xpath("//*[@id='calculate']"));
        calculate.click();
        MyFunc.Bekle(2);
//First Input
        WebElement first = driver.findElement(By.xpath("//*[@id='number1']"));
        first.sendKeys("14");
        MyFunc.Bekle(2);
//First Input
        WebElement second = driver.findElement(By.xpath("//*[@id='number2']"));
        second.sendKeys("36");
        MyFunc.Bekle(2);
//Click to calculate
        WebElement sum = driver.findElement(By.xpath("//*[@id='calculate']"));
        sum.click();
        MyFunc.Bekle(2);
//Get sum
        WebElement getSum = driver.findElement(By.xpath("//*[@id='answer']"));
        System.out.println(getSum.getText());

        finishDriver();


    }
}
