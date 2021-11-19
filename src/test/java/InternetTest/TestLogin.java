package InternetTest;

import driver.DriverFactory;
import org.openqa.selenium.WebDriver;

public class TestLogin implements Urls {

    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get(baseURL);
    }

}
