import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StandaloneTest {

    public static void main(String[] args) {

        //setting the driver executable
        System.setProperty("webdriver.chrome.driver", "C:\\IntellijProjects\\Cucumber_Selenium\\src\\test\\resources\\webdrivers\\chromedriver.exe");

        //Initiating your chromedriver
        WebDriver driver = new ChromeDriver();

        //Applied wait time
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //maximize window
        driver.manage().window().maximize();

        //open browser with desried URL
        driver.get("https://www.facebook.com/");

         //closing the browser
        driver.close();

    }
}


