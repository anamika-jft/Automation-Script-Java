package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InsuredContactphoneChangeEndorse {
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
        WebElement wele = driver.findElement(By.xpath("//span[contains(text(),'Policy')]"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", wele);
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//div[contains(text(),'Policy Change')]/button/div"));
        JavascriptExecutor jse1 = (JavascriptExecutor)driver;
        jse1.executeScript("arguments[0].click()", ele);
        // driver.findElement(By.xpath("//div[contains(text(),'Policy Change')]/button/div")).click();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        WebElement ele1 = driver.findElement(By.xpath("//span[contains(text(),'Create new change')]"));
        JavascriptExecutor jse2 = (JavascriptExecutor)driver;
        jse2.executeScript("arguments[0].click()", ele1);
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
      //  driver.findElement(By.xpath("//span[contains(text(),'Change Insured Contact Name/Phone #')]")).click();
        WebElement ele2 = driver.findElement(By.xpath("//span[contains(text(),'Change Insured Contact Name/Phone #')]"));
        JavascriptExecutor jse3 = (JavascriptExecutor)driver;
        jse3.executeScript("arguments[0].click()", ele2);
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='applicant_first_name']")).clear();
        driver.findElement(By.xpath("//input[@id='applicant_first_name']")).sendKeys("test");
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[contains(text(),'Complete change')]")).click();


    }
    }
