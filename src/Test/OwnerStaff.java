package Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.chrome.ChromeDriver;


public class OwnerStaff {
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
        driver.findElement(By.xpath("//div[contains(text(),'Owners')]")).click();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

//        WebElement ele1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]/div[1]/span[1]"));
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("arguments[0].click()", ele1);
        driver.findElement(By.xpath("//span[contains(text(),'Add owner')]")).click();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/input[@id='defaultCommission']")).sendKeys("30");
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#producerCode")).sendKeys("333333");
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("UNIq");
        driver.findElement(By.id("eventsEmail")).sendKeys("test@gmail.com");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("wholesalerNewPolicyEmailRecipient")).sendKeys("test@gmail.com");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='businessName']")).sendKeys("New Owner");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//input[@id='fein']")).sendKeys("123456789");
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='streetAddress']")).sendKeys("Maple St");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#city")).sendKeys("Phoenix");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("state")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[contains(text(),'Arizona')]")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("85001");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Admin");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Stafff");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='mobilePhone']")).sendKeys("1234567890");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anamika.kumari+owner234@jellyfishtechnologies.com");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath(("//span[contains(text(),'Submit Form')]"))).click();


    }
}
