package br.com.mcoelho.pages;

import br.com.mcoelho.maps.CursoMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CursoPage {
    private WebDriver driver;
    CursoMap cursoMap;

    public CursoPage(WebDriver driver) {
        this.driver = driver;
        cursoMap = new CursoMap();
        PageFactory.initElements(driver, cursoMap);
    }

    public String pegarTitulo(){
        return cursoMap.txtTitulo.getText();
    }

}
