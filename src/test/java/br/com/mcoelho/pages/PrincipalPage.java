package br.com.mcoelho.pages;

import br.com.mcoelho.maps.PrincipalMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PrincipalPage {
    WebDriver driver;
    PrincipalMap principalMap;

    public PrincipalPage(WebDriver driver) {
        this.driver = driver;
        principalMap = new PrincipalMap();
        PageFactory.initElements(driver, principalMap);
        /*
        Caso o PageFactory esteja nessa mesma p?gina
        PageFactory.initElements(driver, this)
         */
    }

    public String pegarTitulo () {
        return principalMap.txtTitulo.getText();
    }

    public void clicarBotao () {
        principalMap.btnConhecaCursos.click();
    }
}
