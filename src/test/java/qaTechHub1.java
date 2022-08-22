import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class qaTechHub1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        driver.get("http://qatechhub.com");

        String titleOfThePage = driver.getTitle();

        if (titleOfThePage.equals("QA Automation Tools Trainings and Tutorials | QA Tech Hub")) {
            System.out.println("Test case PASSED");
        } else {
            System.out.println("Test case FAILED");
        }

        driver.get("https://www.facebook.com");
        driver.navigate().back();
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL - " + currentUrl);
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();

    }
}
