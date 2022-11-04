package FridayProjects1.Project2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test extends BaseDriver {
    @org.junit.Test
    public void Case1() {
        driver.get("https://shopdemo.e-junkie.com/");
        WebElement eBook = driver.findElement(By.linkText("Ebook"));
        eBook.click();

        WebElement addToCard = driver.findElement(By.className("view_product"));
        addToCard.click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']"));
        wait.until(ExpectedConditions.visibilityOf(iframe));
        driver.switchTo().frame(iframe);


        WebElement promoCode = driver.findElement(By.cssSelector("button[class='Apply-Button Show-Promo-Code-Button']"));
        promoCode.click();

        WebElement code = driver.findElement(By.cssSelector("[placeholder='Promo Code']"));
        code.sendKeys("We dont have a valid code");

        WebElement apply = driver.findElement(By.cssSelector("button[class='Promo-Apply']"));
        apply.click();

        WebElement invalid = driver.findElement(By.xpath("//*[text()='Invalid promo code']"));
        Assert.assertEquals("Invalid promo code", invalid.getText());

        driver.switchTo().defaultContent();



    }
@org.junit.Test
public void Case2(){

    driver.get("https://shopdemo.e-junkie.com/");
    WebElement eBook = driver.findElement(By.linkText("Ebook"));
    eBook.click();

    WebElement addToCard = driver.findElement(By.className("view_product"));
    addToCard.click();


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    WebElement iframe = driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']"));
    wait.until(ExpectedConditions.visibilityOf(iframe));
    driver.switchTo().frame(iframe);

    WebElement debit=driver.findElement(By.cssSelector("[class='Payment-Button CC']"));
    debit.click();


    WebElement pay=driver.findElement(By.xpath("//*[text()='Pay 0.50 USD']"));
    pay.click();
    MyFunc.Bekle(1);
    WebElement invalidMessages=driver.findElement(By.cssSelector("[id='SnackBar'] > :nth-child(2)"));

    Assert.assertTrue(invalidMessages.getText().contains("Invalid Email"));




}
    @org.junit.Test
public void Case3(){

    driver.get("https://shopdemo.e-junkie.com/");
    WebElement eBook = driver.findElement(By.linkText("Ebook"));
    eBook.click();

    WebElement addToCard = driver.findElement(By.className("view_product"));
    addToCard.click();


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    WebElement iframe = driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']"));
    wait.until(ExpectedConditions.visibilityOf(iframe));
    driver.switchTo().frame(iframe);

    WebElement debit=driver.findElement(By.cssSelector("[class='Payment-Button CC']"));
    debit.click();


    WebElement iframe2=driver.findElement(By.xpath("//div[@class='__PrivateStripeElement']//iframe"));
    wait.until(ExpectedConditions.visibilityOf(iframe2));
    driver.switchTo().frame(iframe2);



    WebElement cardNumber=driver.findElement(By.name("cardnumber"));
    cardNumber.sendKeys("1111111111111111");

    driver.switchTo().parentFrame();
    WebElement message=driver.findElement(By.xpath("//*[text()='Your card number is invalid.']"));
    Assert.assertTrue(message.getText().contains("Your card number is invalid"));


}
    @org.junit.Test
public void Case4(){
        driver.get("https://shopdemo.e-junkie.com/");
        WebElement eBook = driver.findElement(By.linkText("Ebook"));
        eBook.click();

        WebElement addToCard = driver.findElement(By.className("view_product"));
        addToCard.click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']"));
        wait.until(ExpectedConditions.visibilityOf(iframe));
        driver.switchTo().frame(iframe);

        WebElement debit=driver.findElement(By.cssSelector("[class='Payment-Button CC']"));
        debit.click();

        WebElement email=driver.findElement(By.xpath("//input[@placeholder='Email']"));
        email.sendKeys("email");

        WebElement confEmail=driver.findElement(By.cssSelector("[placeholder='Confirm Email']"));
        confEmail.sendKeys("email");


        WebElement name=driver.findElement(By.cssSelector("[placeholder='Name On Card']"));
        name.sendKeys("Group2");

        WebElement phone=driver.findElement(By.cssSelector("[class='Billing-Phone Inline']>input"));
        phone.sendKeys("Group2Phone");

        WebElement company=driver.findElement(By.cssSelector("[class='Billing-Company']>input"));
        company.sendKeys("Group2Company");


        WebElement iframe2=driver.findElement(By.xpath("//div[@class='__PrivateStripeElement']//iframe"));
        wait.until(ExpectedConditions.visibilityOf(iframe2));
        driver.switchTo().frame(iframe2);

        WebElement cardNumber=driver.findElement(By.name("cardnumber"));
        cardNumber.sendKeys("42424242424242421222000");

        driver.switchTo().defaultContent();
        driver.switchTo().frame(iframe);
        WebElement pay=driver.findElement(By.xpath("//*[text()='Pay 0.50 USD']"));
        pay.click();

        wait.until(ExpectedConditions.urlContains("rdffc=true"));
        WebElement message=driver.findElement(By.xpath("//*[text()=' your order is confirmed. Thank you!']"));
        Assert.assertTrue(message.getText().contains("confirmed"));










}
    @org.junit.Test
public void Case5(){

        driver.get("https://shopdemo.e-junkie.com/");
        driver.manage().deleteAllCookies();
        WebElement contactUs = driver.findElement(By.linkText("Contact Us"));
        contactUs.click();

        WebElement name=driver.findElement(By.id("sender_name"));
        name.sendKeys("Group2");


        WebElement email=driver.findElement(By.xpath("//*[@id='sender_email']"));
        email.sendKeys("group2@gmail.com");

        WebElement subject=driver.findElement(By.name("sender_subject"));
        subject.sendKeys("Selenium Project 2!!");

        WebElement message=driver.findElement(By.xpath("//*[@id='sender_message']"));
        message.sendKeys("A bit hard one !!");



         WebElement submit=driver.findElement(By.xpath("//*[@id='send_message_button']"));
        submit.click();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();


        finishDriver();



}

}

