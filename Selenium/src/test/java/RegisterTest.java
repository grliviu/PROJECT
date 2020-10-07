import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
public void register(){
    WebDriver driver = new ChromeDriver();
    driver.get(" http://testfasttrackit.info/selenium-test/");
    driver.findElement(By.cssSelector("#header > div > a > img.large")).click();
    driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
    driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
    driver.findElement(By.cssSelector("#firstname")).sendKeys("Liviu");
    driver.findElement(By.cssSelector("#middlename")).sendKeys("Ovidiu");
    driver.findElement(By.cssSelector("#lastname")).sendKeys("Graur");
    driver.findElement(By.cssSelector("#email_address")).sendKeys("liviugraur7@tutanota.com");
             driver.findElement(By.cssSelector("#password")).sendKeys("12345A");
                    driver.findElement(By.cssSelector("#confirmation")).sendKeys("12345A");
                    driver.findElement(By.cssSelector("#is_subscribed")).click();
                    driver.quit();

}
}
