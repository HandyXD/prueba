package pages;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class inicio {
    @Test
    public void webdriverChrome() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Yandy/IdeaProjects/pruebachoucair/src/test/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sena.territorio.la/cms/index.php");
        driver.findElement(By.className("close")).click();
        driver.findElement(By.linkText("Ingresar a cursos")).click();
        driver.close();

    }
}
