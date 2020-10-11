import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishList {
    public void addToWishlist() {
        WebDriver driver = new ChromeDriver();
        driver.get(" http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > a > img.large")).click();
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.first > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("liviugraur@zohomail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("12345A");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(2) > a")).click();
        

        //driver.quit();


    }
}



