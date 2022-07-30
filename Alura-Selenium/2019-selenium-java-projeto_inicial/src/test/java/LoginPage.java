import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    private static final String URL_Login = "http://localhost:8080/login";
    private WebDriver browser;

    public LoginPage() {
        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");
        this.browser = new ChromeDriver();
        browser.navigate().to(URL_Login);
    }

    public void fechar() {
        this.browser.quit();
    }

    public void preencheFormularioDeLogin(String userName, String userpassword) {
        browser.findElement(By.id("username")).sendKeys( userName);
        browser.findElement(By.id("password")).sendKeys(userpassword);
    }

    public void efetuaLogin() {
        browser.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
    }

    public boolean isPaginaDeLogin() {
            return browser.getCurrentUrl().equals(URL_Login);
    }

    public Object getNomeUsuarioLogado() {
        try{
            return browser.findElement(By.id("usuario-logado")).getText();
        }catch (NoSuchElementException e){
            return null;
        }
    }

    public void navegaParPaginaDeLances() {
       this.browser.navigate().to("http://localhost:8080/leiloes/2");
    }

    public boolean contemTexto(String texto) {
        return browser.getPageSource().contains(texto);

    }
    public boolean isPaginaDeLoginComDadosInvalidos(){
        return browser.getCurrentUrl().equals(URL_Login+ "?error");
    }
}
