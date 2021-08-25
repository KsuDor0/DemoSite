import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleForDemoTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/");
        driver.manage().window().setSize(new Dimension(1936, 1056));
        driver.findElement(By.cssSelector("ul:nth-child(3) > .tree-branch:nth-child(1) > a")).click();
        driver.findElement(By.linkText("Simple Form Demo")).click();
        driver.findElement(By.id("user-message")).sendKeys("Ввод текста");
        driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
        driver.findElement(By.id("sum1")).click();
        driver.findElement(By.id("sum1")).sendKeys("Яблоко");
        driver.findElement(By.id("sum2")).click();
        driver.findElement(By.id("sum2")).sendKeys("Апельсин");
        driver.findElement(By.cssSelector(".btn:nth-child(3)")).click();
        driver.quit();
    }
}
