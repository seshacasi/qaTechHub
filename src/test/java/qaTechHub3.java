import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class qaTechHub3 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        String url = "https://flipkart.com";
        driver.get(url);

        int numberOfLinks = driver.findElements(By.tagName("a")).size();

        System.out.println("Number of links on web page - " + numberOfLinks);

        List<WebElement> allLink = driver.findElements(By.tagName("a"));

        for(WebElement link:allLink) {
            System.out.println("Link Text :: " + link.getText());
            System.out.println("Link URL  :: " + link.getAttribute("href"));

            System.out.println("-------------------------------------------");
        }

    }
}
