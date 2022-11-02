package HomeWork.Action.Soru2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class TestTwo extends BaseDriver {
    @Test

    public void Test() {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        List<WebElement> students = driver.findElements(By.cssSelector("[id='allItems']>li"));
        List<WebElement> teams = driver.findElements(By.cssSelector("[id='dhtmlgoodies_mainContainer']>div>[id*='box']"));

        Actions actions = new Actions(driver);


        for (WebElement student : students) {
            for (int j = 0; j < teams.size(); j++) {
                actions.clickAndHold(student).build().perform();
                MyFunc.Bekle(1);
                actions.moveToElement(teams.get(j)).release().build().perform();
                MyFunc.Bekle(1);
                if (teams.get(j).getText().contains(student.getText())) {

                    break;
                }
                teams.remove(teams.get(j));
            }
        }
    finishDriver();
    }
}




