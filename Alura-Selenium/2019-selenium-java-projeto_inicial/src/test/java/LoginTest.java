import org.junit.After;
import org.junit.Assert;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver browser;

    @BeforeAll
    public static void beforeall(){
        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");
    }
    @BeforeEach
    public void beforeEach(){

        this.browser = new ChromeDriver();
        browser.navigate().to("http://localhost:8080/login");
    }
    @AfterEach
    public void afterEach(){
        this.browser.quit();
    }

    @Test
    public void logarComDadosValidos(){

        browser.findElement(By.id("username")).sendKeys("fulano");
        browser.findElement(By.id("password")).sendKeys("pass");
        browser.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
        Assert.assertFalse(browser.getCurrentUrl().equals("http://localhost:8080/login"));

    }
    @Test
    public void logarComDadosInvalidos(){


        browser.findElement(By.id("username")).sendKeys("invalido");
        browser.findElement(By.id("password")).sendKeys("123123");
        browser.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();

        Assert.assertTrue(browser.getCurrentUrl().equals("http://localhost:8080/login?error"));
        Assert.assertTrue(browser.getPageSource().contains("Usuário e senha inválidos."));
        Assert.assertThrows(NoSuchElementException.class, () -> browser.findElement(By.id("usuario-logado")));

    }
}
