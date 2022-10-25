package HomeWork;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestFour extends BaseDriver {

    @Test
    public void soru4(){

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculate=driver.findElement(By.cssSelector("[class='page-body']>:nth-child(15)>:nth-child(7)>a"));
        calculate.click();
        MyFunc.Bekle(2);

        WebElement firstInput=driver.findElement(By.cssSelector("[action='calculate.php']>input"));
        firstInput.sendKeys("13");
        MyFunc.Bekle(2);

        WebElement secondInput=driver.findElement(By.cssSelector("[action='calculate.php']>:nth-child(3)"));
        secondInput.sendKeys("22");
        MyFunc.Bekle(2);

        WebElement click=driver.findElement(By.cssSelector("[action='calculate.php']>:nth-child(3)+input"));
        click.click();
        MyFunc.Bekle(2);

        WebElement result=driver.findElement(By.id("answer"));
        System.out.println(result.getText());

        MyFunc.Bekle(2);



        finishDriver();


    }
}
