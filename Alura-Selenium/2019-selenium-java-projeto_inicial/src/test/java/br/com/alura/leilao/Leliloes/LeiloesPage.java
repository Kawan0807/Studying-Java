package br.com.alura.leilao.Leliloes;

import br.com.alura.leilao.PageObject;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeiloesPage extends PageObject {

    private static final String URL_Cadastro_Leilao = "http://localhost:8080/leiloes/new";
    private static final String URL_Leiloes = "http://localhost:8080/leiloes";


    public LeiloesPage(WebDriver browser) {
         super(browser);
    }

    public CadastroLeilaoPage carregarFormulario() {
        this.browser.navigate().to(URL_Cadastro_Leilao);
        return new CadastroLeilaoPage(browser);
    }
    public boolean isLeilaoCadastrado(String nome, String valor, String data) {
        WebElement linhaDaTable = this.browser.findElement(By.cssSelector("#tabela-leiloes tbody tr:last-child"));
        WebElement colunaNome = linhaDaTable.findElement(By.cssSelector("td:nth-child(1)"));
        WebElement colunaValorInicial = linhaDaTable.findElement(By.cssSelector("td:nth-child(3)"));
        WebElement colunaData = linhaDaTable.findElement(By.cssSelector("td:nth-child(2)"));
        return colunaNome.getText().equals(nome)
                && colunaData.getText().equals(data)
                && colunaValorInicial.getText().equals(valor);
    }

    public boolean isPaginaAtual() {
        return browser.getCurrentUrl().contentEquals(URL_Leiloes);
    }
}
