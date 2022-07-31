package br.com.alura.leilao.Login;

import br.com.alura.leilao.Leliloes.LeiloesPage;
import br.com.alura.leilao.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends PageObject {
    private static final String URL_Login = "http://localhost:8080/login";

    public LoginPage() {
        super(null);
        this.browser.navigate().to(URL_Login);
    }


    public void preencheFormularioDeLogin(String userName, String userpassword) {
        browser.findElement(By.id("username")).sendKeys( userName);
        browser.findElement(By.id("password")).sendKeys(userpassword);
    }

    public LeiloesPage efetuaLogin() {
        browser.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
        return new LeiloesPage(browser);
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
