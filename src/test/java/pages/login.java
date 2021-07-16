package pages;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    @Test
    public void webdriverChrome() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Yandy/IdeaProjects/pruebachoucair/src/test/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sena.territorio.la/index.php?login=true");
        driver.findElement(By.xpath("//select[@id='typeDocument']")).click();
        driver.findElement(By.xpath("//select[@id='typeDocument']/option[2]")).click();
        driver.findElement(By.name("document")).sendKeys("1011568967");
        driver.findElement(By.name("password")).sendKeys("ingreso123");
        driver.findElement(By.name("ingresar")).click();
        driver.findElement(By.xpath("//div[@class='container-config']/a[1]")).click();
        driver.findElement(By.xpath("//div[@class='d-flex justify-content-center align-items-center flex-wrap']/a[1]")).click();
        driver.findElement(By.name("imgbtn")).click();
        driver.findElement(By.id("logo")).click();
        driver.close();
    }
}
