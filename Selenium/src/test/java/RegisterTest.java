import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    WebDriver driver;

    @Before
    public void startIn(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(" http://testfasttrackit.info/selenium-test/");
    }
    @Test
    public void register(){

    driver.findElement(By.cssSelector("a.logo img.large")).click();
    driver.findElement(By.cssSelector("a.skip-account .label")).click();
    driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
    driver.findElement(By.cssSelector("#firstname")).sendKeys("Liviu");
    driver.findElement(By.cssSelector("#middlename")).sendKeys("Ovidiu");
    driver.findElement(By.cssSelector("#lastname")).sendKeys("Graur");
    driver.findElement(By.cssSelector("#email_address")).sendKeys("japos88923@justlibre.com");
             driver.findElement(By.cssSelector("#password")).sendKeys("12345A");
                    driver.findElement(By.cssSelector("#confirmation")).sendKeys("12345A");
                    driver.findElement(By.cssSelector("#is_subscribed")).click();
        String registerText = driver.findElement(By.cssSelector("body > div > div.page > div.main-container." +
                        "col2-left-layout > div > div.col-main > " +
                        "div.my-account > div > ul > li > ul > li > span")).getText();
        Assert.assertEquals("Thank you for registering with Madison Island.", registerText);

                    driver.quit();

}
    @Test
    public void registerWithSameAdress(){

        driver.findElement(By.cssSelector("#header > div > a > img.large")).click();
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Liviu");
        driver.findElement(By.cssSelector("#middlename")).sendKeys("Ovidiu");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Graur");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("liviugraur@zohomail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("12345A");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("12345A");
        driver.findElement(By.cssSelector("#is_subscribed")).click();
        String register2Text = driver.findElement(By.cssSelector("body > div > div.page > div.main-" +
                        "container.col1-layout > div > di" +
                        "v > div.account-create > ul > li > ul > li > span")).getText();
        Assert.assertEquals("There is already an account with this email address.", register2Text);

        driver.quit();
}
