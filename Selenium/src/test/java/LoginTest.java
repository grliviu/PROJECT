import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    WebDriver driver;

    @Before
        public void init() {


    System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(" http://testfasttrackit.info/selenium-test/");
}

@Test

public void loginTestMethod1(){


    driver.findElement(By.cssSelector("a.logo img.large")).click();
    driver.findElement(By.cssSelector("a.skip-account .label")).click();
    driver.findElement(By.cssSelector("#header-account div.links ul li.last a")).click();
    driver.findElement(By.cssSelector("#email")).sendKeys("liviugraur@zohomail.com");
    driver.findElement(By.cssSelector("#pass")).sendKeys("12345A");
    driver.findElement(By.cssSelector("#send2 ")).click();


String welcomeText = driver.findElement(By.cssSelector("div.page div.header-language-background " +
        "div p")).getText();
    Assert.assertEquals("WELCOME, LIV OV GR!", welcomeText);
}
@Test
public void invalidUserName(){

    driver.findElement(By.cssSelector("a.logo img.large")).click();
    driver.findElement(By.cssSelector("a.skip-account .label")).click();
    driver.findElement(By.cssSelector("#header-account div.links ul li.last a")).click();
    driver.findElement(By.cssSelector("#email")).sendKeys("@zohomail.com");
    driver.findElement(By.cssSelector("#pass")).sendKeys("12345A");
    driver.findElement(By.cssSelector("#send2")).click();
    String invalidLogin = driver.findElement(By.cssSelector("h1")).getText();
    Assert.assertEquals("Invalid login or password.", invalidLogin);

}
@Test
public void invalidPassword(){


    driver.findElement(By.cssSelector("a.logo img.large")).click();
    driver.findElement(By.cssSelector("a.skip-account .label")).click();
    driver.findElement(By.cssSelector("#header-account div.links ul li.last a")).click();
    driver.findElement(By.cssSelector("#email")).sendKeys("liviugraur@zohomail.com");
    driver.findElement(By.cssSelector("#pass")).sendKeys("0000");
    driver.findElement(By.cssSelector("#send2")).click();
    String invalidPassword = driver.findElement(By.cssSelector("h1")).getText();
    Assert.assertEquals("Invalid login or password.", invalidPassword);





}


}

