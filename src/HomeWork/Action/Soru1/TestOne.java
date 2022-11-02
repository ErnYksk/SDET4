package HomeWork.Action.Soru1;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class TestOne extends BaseDriver {
    @Test

    public void Soru1() {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        List<WebElement> cities = driver.findElements(By.xpath("//*[@id='answerDiv']//*[@class='dragDropSmallBox']"));
        List<WebElement> target = driver.findElements(By.xpath("//*[@id='questionDiv']//*[@class='destinationBox']"));


        Actions aksiyonlar = new Actions(driver);

        for (int i = 0; i < cities.size(); i++) {
            for (int j = 0; j < target.size(); j++) {
               aksiyonlar.clickAndHold(cities.get(i)).build().perform();
               MyFunc.Bekle(1);
               aksiyonlar.moveToElement(target.get(j)).release().build().perform();
               if(cities.get(i).getAttribute("class").equals("correctAnswer")){
                   MyFunc.Bekle(1);
                   target.remove(target.get(j));
                   break;
               }

            }
        }
        finishDriver();
    }

}