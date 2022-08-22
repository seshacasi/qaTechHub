import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class qaTechHub4 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://ebay.com/");

        driver.findElement(By.id("gh-ac")).sendKeys("Apple watch");
        Select dropDownCategory = new Select(driver.findElement(By.id("gh-cat")));

        dropDownCategory.selectByVisibleText("Cell Phones & Accessories");
        driver.findElement(By.id("gh-btn")).click();

        String result = driver.findElement(By.className("listingscnt")).getText();
        System.out.println("Result - " + result);


    }
}
