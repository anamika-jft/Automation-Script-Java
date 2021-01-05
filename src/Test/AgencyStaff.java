package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TimeoutException;

import java.util.concurrent.TimeUnit;

public class AgencyStaff {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/home/jft-/Downloads/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://dev.qbis.co");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        System.out.println(driver.getTitle());

        driver.findElement(By.id("signIn-Email")).sendKeys("admin+socius_agency@qbisins.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.id("signIn-Password")).sendKeys("password");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//span[contains(text(),'SIGN IN')]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//header/div[1]/button[1]/div[1]/*[1]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//div[contains(text(),'Staff')]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[contains(text(),'Add staff')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//*[@id=\"flag__admin\"]/div[1]/div/div/div[1]/input")).click();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//*[@id=\"flag__suspended\"]/div[1]/div/div/div[2]/input")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.findElement(By.cssSelector("#flag__readOnly > div.fieldFull > div > div > div:nth-child(2) > input[type=radio]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anamika.kumari+david@jellyfishtechnologies.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Staff");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Admin");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//input[@id='mobilePhone']")).sendKeys("1234567890");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//span[contains(text(),'Submit Form')]")).click();


        //driver.close();


    }
}
