package br.com.mcoelho.pages;

import br.com.mcoelho.core.Driver;
import br.com.mcoelho.maps.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    LoginMap loginmap;

    public LoginPage() {
        loginmap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginmap);
    }

    public void clickBtnLogin() {
        loginmap.btnLogin.click();
    }

    public void clickBtnFechar() {
        loginmap.btnFechar.click();
    }

    public void clickDivFecharModal() {
        loginmap.divFecharModal.click();
    }

    public void setInpUserName(String username) {
        loginmap.inpUserName.sendKeys(username);
    }

    public void setInpPassword(String password) {
        loginmap.inpPassword.sendKeys(password);
    }

    public void clickInpRemember() {
        loginmap.inpRemember.click();
    }

    public void clickLnkCreateAccount() {
        loginmap.lnkCreateAccount.click();
    }

    public void clickBtnSignIn() {
        loginmap.btnSignIn.click();
    }

    public boolean isBtnSignIn() {
        return loginmap.btnSignIn.isEnabled();
    }
}
