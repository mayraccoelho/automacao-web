package br.com.mcoelho.automacaoWeb;

import br.com.mcoelho.core.Driver;
import br.com.mcoelho.pages.CursoPage;
import br.com.mcoelho.pages.PrincipalPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class TesteWeb {

    WebDriver driver;
    Driver driverWeb;
    PrincipalPage principalPage;
    CursoPage cursoPage;

    @Before
    public void inicializaTeste(){
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver();
        driver.get("https://www.chronosacademy.com.br");
        principalPage = new PrincipalPage(driver);
        cursoPage = new CursoPage(driver);
    }

    @Test
    public void primeiroTeste(){
        assertEquals("Porque Tempo É Conhecimento", principalPage.pegarTitulo());
    }

    @Test
    public void segundoTeste(){
        principalPage.clicarBotao();
        assertEquals("Conheça todos os nossos cursos", cursoPage.pegarTitulo());
    }

    @After
    public void finalizaTeste(){
        driver.quit();
    }


}