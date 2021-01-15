package Test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FirstDemo {
    public static <SelectElement> void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/home/jft-/Downloads/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.qbis.co");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        driver.findElement(By.id("signIn-Email")).sendKeys("admin+markel@qbisins.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.id("signIn-Password")).sendKeys("password");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        driver.findElement(By.xpath("//span[contains(text(),'SIGN IN')]")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS) ;

        driver.findElement(By.xpath("//header/div[1]/button[1]/div[1]/*[1]")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[6]/div[1]/div[2]/button[1]/span[1]")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS) ;
        driver.findElement(By.id("name")).sendKeys("Check");
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS) ;
//        WebElement elem = driver.findElement(By.xpath("//span[@id='triggerSelectButton']")); //*[@id="category_select__classCode"]/div[1]/div/div[2]
//        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS) ;
        WebElement wele = driver.findElement(By.id("//span[@id='triggerSelectButton']"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", wele);
      //  driver.findElement(By.xpath("//span[@id='triggerSelectButton']")).click();
//        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS) ;
    //   driver.findElement(By.xpath("driver.findElement(By.xpath(\"//*[@id=\\\"category_select__classCode\\\"]/div[1]/div/div[2]\")).click();")).click();
//        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS) ;
//        driver.findElement(By.xpath("//div[@id='Antique Auto Sales and Repair']")).click();
//        WebElement dropElement = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/fieldset[2]/div[1]/div[1]/div[2]/span[1]"));
//        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS) ;
//        dropElement.click();
//        //Object instantiation for selecting values from dropDown
//        Select dropdown = new Select(dropElement);
//        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS) ;
//
//        //Select value from the  DropDown
//        dropdown.selectByVisibleText("Advertising & Graphic Design");
//
//        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS) ;

        //Clicking on Search button
    //    dropdown.selectByVisibleText("Advertising");



//        driver.findElement(By.id("triggerSelectButton")).click();
//        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS) ;
//        driver.findElement(By.id("Advertising & Graphic Design")).click();
//        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS) ;
//        driver.findElement(By.xpath("//div[@id='Advertising Agencies']")).click();
      //  driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS) ;

        WebElement ele=  driver.findElement(By.xpath("//input[@id='classCode']"));
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.drivers();
        ele.sendKeys("Carpet Repair");
        ele.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("07101");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("test");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Check");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("asdf@bhj.com"); //anamika.kumari+insuredd@jellyfishtechnologies.com
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//input[@id='mobilePhone']")).sendKeys("1234567890");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//div[@class=\"coverageParts\"]/div/div[@class=\"checkbox\"]")).click();
        //driver.findElement(By.xpath("//div[@class=\"ApplicationWizardProductSelection\"]/div[@class=\"wrapper\"]/div[2]/div/div/div[1]/div/div/div/input")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath(("//span[contains(text(),'Continue')]"))).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//input[@id='date__policy_start_date__picker']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//span[contains(text(),'18')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.id("date_business_established_month")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//div[contains(text(),'June')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.id("date_business_established_year")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//div[contains(text(),'2012')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.id("organization_type")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//div[contains(text(),'Private For Profit')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//input[@id='number_of_employees_all']")).sendKeys("55");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//input[@id='company_current_assets']")).sendKeys("100000");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//input[@id='company_current_liabilities']")).sendKeys("100000");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//input[@id='company_total_annual_revenue']")).sendKeys("2500000");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//*[@id=\"flag__company_plans_offered\"]/div[1]/div/div/div[2]/input")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//*[@id=\"flag__is_franchise\"]/div[1]/div/div/div[2]/input")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//*[@id=\"flag__company_acquisition_or_divestiture\"]/div[1]/div/div/div[2]/input")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//input[@id='number_of_d_and_o_claims']")).sendKeys("0");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//*[@id=\"management_ownership\"]/div[1]/div[2]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//div[contains(text(),'90% to 100%')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//*[@id=\"flag__ownership_structure_change\"]/div[1]/div/div/div[2]/input")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//*[@id=\"flag__initial_public_or_coin_offering\"]/div[1]/div/div/div[2]/input")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//div[contains(text(),'90% to 100%')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();





















    }

}
