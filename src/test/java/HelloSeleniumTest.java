import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSeleniumTest {
    @Test
    public void firstTest(){
        //Tell system where to find chromedriver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.quit();
    }
}
