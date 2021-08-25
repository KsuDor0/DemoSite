import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectList {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/");
        driver.findElement(By.cssSelector(".tree-branch:nth-child(1) > .glyphicon-chevron-right")).click();
        driver.findElement(By.linkText("Select Dropdown List")).click();
        driver.findElement(By.id("select-demo")).click();
        {
            WebElement dropdown = driver.findElement(By.id("select-demo"));
            dropdown.findElement(By.xpath("//option[. = 'Sunday']")).click();
        }
        {
            WebElement dropdown = driver.findElement(By.id("multi-select"));
            dropdown.findElement(By.xpath("//option[. = 'Florida']")).click();
        }
        {
            WebElement dropdown = driver.findElement(By.id("multi-select"));
            dropdown.findElement(By.xpath("//option[. = 'Florida']")).click();
        }
        {
            WebElement dropdown = driver.findElement(By.id("multi-select"));
            dropdown.findElement(By.xpath("//option[. = 'Ohio']")).click();
        }
        driver.findElement(By.id("printAll")).click();
        driver.quit();
    }
    }

