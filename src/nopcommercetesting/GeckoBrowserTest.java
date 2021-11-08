package nopcommercetesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckoBrowserTest {
    public static void main(String [] args){
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);
        String getTitle = driver.getTitle();
        System.out.println(getTitle);
        driver.close();
    }
}
