package ua.com.stikers;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class WebDriver {
    public ChromeDriver driver;
    public WebDriverWait wait;

    Random rn = new Random();
    int x = rn.nextInt(6) + 1;
    String Negative = String.valueOf(-1);
    String Letters = "eee";


    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/prog/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,15);
        System.out.println("Start");

    }



    @After
    public void setDown() throws InterruptedException {
        System.out.println("End");
        driver.wait(5);
        driver.quit();
    }

}
