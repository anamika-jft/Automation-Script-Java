package Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.chrome.ChromeDriver;
public class AgencyCreation
{
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/home/jft-/Downloads/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://dev.qbis.co");
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());

        driver.findElement(By.id("signIn-Email")).sendKeys("admin+markel@qbisins.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("signIn-Password")).sendKeys("password");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[contains(text(),'SIGN IN')]")).click();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/header[1]/div[1]/button[1]")).click();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[contains(text(),'Policies')]")).click();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[contains(text(),'AK_71_6 >> CHECK QUOTE')]")).click();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@id=\"policyChange\"]/div/div/span/div/div/button")).click();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[contains(text(),'Create new change')]")).click();









    }
}
