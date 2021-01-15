package Test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusinessNameChangeEndorse
{
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/home/jft-/Downloads/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://dev.qbis.co");
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        driver.findElement(By.id("signIn-Email")).sendKeys("admin+markel@qbisins.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("signIn-Password")).sendKeys("password");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[contains(text(),'SIGN IN')]")).click();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/header[1]/div[1]/button[1]")).click();
        driver.manage().timeouts().implicitlyWait(220, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[contains(text(),'Policies')]")).click();
        driver.manage().timeouts().implicitlyWait(220, TimeUnit.SECONDS);
        WebElement wele = driver.findElement(By.xpath("//span[contains(text(),'AK_151_7 >> Policy')]"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", wele);
        // driver.findElement(By.xpath("//span[contains(text(),'AK_141_4 >> QUOTE CHECK')]")).click();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//div[contains(text(),'Policy Change')]/button/div"));
        JavascriptExecutor jse1 = (JavascriptExecutor)driver;
        jse1.executeScript("arguments[0].click()", ele);
       // driver.findElement(By.xpath("//div[contains(text(),'Policy Change')]/button/div")).click();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//span[contains(text(),'Create new change')]")).click();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        WebElement ele1 = driver.findElement(By.xpath("//span[contains(text(),'Create new change')]"));
        JavascriptExecutor jse2 = (JavascriptExecutor)driver;
        jse2.executeScript("arguments[0].click()", ele1);
        WebElement ele2 = driver.findElement(By.xpath("//span[contains(text(),'Change Business Name')]"));
        JavascriptExecutor jse3 = (JavascriptExecutor)driver;
        jse3.executeScript("arguments[0].click()", ele2);
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//input[@id='applicant_company']")).clear();
//        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//input[@id='applicant_company']")).sendKeys("Policy");
//        driver.findElement(By.xpath("//span[contains(text(),'Complete change')]")).click();
        driver.findElement(By.xpath("//input[@id='applicant_company']")).sendKeys(Keys.CONTROL + "a");
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='applicant_company']")).sendKeys(Keys.DELETE);
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='applicant_company']")).sendKeys("Policy App");
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        WebElement ele3 = driver.findElement(By.cssSelector("div.wrap div.container2:nth-child(5) div.src-containers-ChangeBusinessInfo-styles--styles div.container-fluid div.qbisStepWizard div.row div.middleBar.col-xs-12.col-sm-12.col-md-12.col-lg-8 div.col-xs-12.col-sm-12.col-md-12.col-lg-12 div.row div.wizardContent div.ChangeBusinessInfo div.wrapper div.row div.col-xs-12 div.qbisForm div.buttonRow:nth-child(2) div.formButtons:nth-child(2) div.qbisButton div.btn button:nth-child(1) div.touchRipple div:nth-child(1) > span:nth-child(1)"));
        JavascriptExecutor jse4 = (JavascriptExecutor)driver;
        jse4.executeScript("arguments[0].click()", ele3);
      //  WebElement button1 = driver.findElement(By.cssSelector("div.wrap div.container2:nth-child(5) div.src-containers-ChangeBusinessInfo-styles--styles div.container-fluid div.qbisStepWizard div.row div.middleBar.col-xs-12.col-sm-12.col-md-12.col-lg-8 div.col-xs-12.col-sm-12.col-md-12.col-lg-12 div.row div.wizardContent div.ChangeBusinessInfo div.wrapper div.row div.col-xs-12 div.qbisForm div.buttonRow:nth-child(2) div.formButtons:nth-child(2) div.qbisButton div.btn button:nth-child(1) div.touchRipple div:nth-child(1) > span:nth-child(1)"));
        //that new element will point to the same element in the new DOM
       // button1.click();//        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Complete change')]"));
//        element.click();
        //page is refreshed
        //element.click();







    }
}
