package HomeWork.XPath;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestFiveAndSix extends BaseDriver {

    @Test
    public void Test() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
//Click Fake Alerts
        WebElement fakeAllerts = driver.findElement(By.xpath("//*[@id='fakealerttest']"));
        fakeAllerts.click();
        MyFunc.Bekle(2);
//Click Show Alert Box
        WebElement showAllertBox = driver.findElement(By.xpath("//*[@id='fakealert']"));
        showAllertBox.click();
        MyFunc.Bekle(2);
//Click Ok
        WebElement ok = driver.findElement(By.xpath("//*[@id='dialog-ok']"));
        ok.click();
        MyFunc.Bekle(2);

//Soru 6

//Click Show Modal Dialog
        WebElement showModalDialog = driver.findElement(By.xpath("//*[@id='modaldialog']"));
        showModalDialog.click();
        MyFunc.Bekle(2);
//Click Ok
        ok.click();


        finishDriver();


    }
}
