package HomeWork.Action.Soru3;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class TestThree extends BaseDriver {
@Test
    public void Test(){
    driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");

    List<WebElement> objects=driver.findElements(By.cssSelector("[id*='node']"));
    List<WebElement> boxes=driver.findElements(By.cssSelector("[id*='box']"));
    Actions actions=new Actions(driver);
    for(WebElement belongs:objects){
        for(WebElement to:boxes){
            actions.clickAndHold(belongs).build().perform();
            MyFunc.Bekle(1);
            actions.moveToElement(to).release().build().perform();
            MyFunc.Bekle(1);
            if(belongs.getAttribute("class").contains("correctAnswer")){

                break;
            }
        }
    }
    MyFunc.Bekle(2);
    driver.switchTo().alert().accept();

    finishDriver();
}
}
