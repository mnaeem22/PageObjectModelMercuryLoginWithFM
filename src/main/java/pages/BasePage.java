package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import utils.Utils;

public class BasePage {

    public static WebDriver driver;


    public static void initialize(){
        String browser = Utils.browser;
        switch (browser.toUpperCase()){
            case "EDGE":
                driver = new EdgeDriver();
                break;
            case "FIREFOX":
                driver = new FirefoxDriver();
                break;
            case "SAFARI":
                driver = new SafariDriver();
                break;
            case "IEDRIVER":
                driver = new InternetExplorerDriver();
                break;
            default:
                driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(Utils.BASE_URL);
    }


    public static void terminate(){
        driver.manage().deleteAllCookies();
        driver.close();
    }


}
