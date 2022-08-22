import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class qaTechHub2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("http://www.fb.com");

        driver.findElement(By.xpath("//*[@title='Only allow essential cookies']")).click();
        driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
        driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("John");
        driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Snow");
        driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("johnsnow@gmail.com");
        driver.findElement(By.xpath("//*[@name='reg_email_confirmation__']")).sendKeys("johnsnow@gmail.com");
        driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys("iFDSF1#$mvs");
        Select dropDownMonth = new Select(driver.findElement(By.id("month")));
        dropDownMonth.selectByVisibleText("Jun");
        Select dropDownDay = new Select(driver.findElement(By.id("day")));
        dropDownDay.selectByValue("14");
        Select dropDownYear = new Select(driver.findElement(By.id("year")));
        dropDownYear.selectByValue("1997");
        driver.findElement(By.xpath("//*[@type='radio' and @value='2']")).click();
        driver.findElement(By.xpath("//*[@name='websubmit']")).click();

        driver.quit();


    }
}
