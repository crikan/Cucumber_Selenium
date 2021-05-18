package definitions;

import components.WebElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class FacebookLogin<data, webelemens> {

    @Managed
    WebDriver driver;

    // serializadp de los elementos del yaml
    Yaml yaml = new Yaml();
    InputStream inputStream = this.getClass()
    .getClassLoader()
    .getResourceAsStream("components/WebElement.java");
    WebElement data = (WebElement) yaml.load(inputStream);
    ArrayList<WebElement> elementos = (ArrayList<WebElement>) yaml.load(inputStream);


    @Given("I navigate to the page {url}")
    public void navigateTo(String url) {

        //for (WebElement element: elementos)
        driver.get(url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("consent_cookies_title")));

    }

    // @Todo:serialice yaml and redefine
    @When("I close the modal {modalName} by pressing the {element_name} element)")
    public void accept_and_close_cookies_modal(String element_name) {
        String MainWindow = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        while (i1.hasNext()) {
            String ChildWindow = i1.next();
            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                driver.findElement(By.xpath("//button[@data-cookiebanner=\"accept_button\"]")).click();
                driver.switchTo().window(MainWindow);
            }
        }
    }

   // @When("At the page {url}, I insert the value {value} into the field {locators_name}")
   // public void write_into_field_at_any_page(String url, String value, String locator_name) {
   //     //temporalmente y hasta logre serializar el
   //
   //     driver.get(url);
   //     WebDriverWait wait = new WebDriverWait(driver, 10);
   //     wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-testid=\"royal_login_button\"]")));
   //
   //     WebElement inputElement = driver.find_element_by_id("email");
   // }
}






