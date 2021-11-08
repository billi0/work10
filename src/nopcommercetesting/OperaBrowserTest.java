package nopcommercetesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperaBrowserTest {



        public static void main(String [] args){
            String baseUrl = "https://demo.nopcommerce.com/";
            System.setProperty("webdriver.opera.driver","driver/operadriver.exe");
            WebDriver driver = new OperaDriver();
            driver.get(baseUrl);
            String getTitle = driver.getTitle();
            System.out.println(getTitle);
            driver.close();
        }
    }

