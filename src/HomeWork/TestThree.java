package HomeWork;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestThree extends BaseDriver {

    @Test
public void soru3(){

        String cont="We've got";
        driver.get("https://www.snapdeal.com/");


        WebElement searchBox=driver.findElement(By.cssSelector("[class='topBar  top-bar-homepage  top-freeze-reference-point']>div>:nth-child(2)>div~input"));
        searchBox.sendKeys("teddy bear");

        WebElement click=driver.findElement(By.cssSelector("[class='header_wrapper']>:nth-child(2)>:nth-child(4)"));
        click.click();

        WebElement check=driver.findElement(By.cssSelector("[class='search-result-txt-section  marT12']>span"));
        Assert.assertTrue("Does not contain ! ",check.getText().contains(cont));

        finishDriver();

    }

}
