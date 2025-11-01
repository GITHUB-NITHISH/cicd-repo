package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
    private WebDriver driver;
    
    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    private  By emailField = By.id("ap_email");
    private  By continueButton = By.className("a-button-input");
    private  By passwordField = By.id("ap_password");
    private  By signInButton = By.id("auth-signin-button");
    private  By passwordErrorMessage = By.id("auth-error-message-box");
    private  By emailErrorMessage = By.id("invalid-email-alert");
    private  By emailErrorIcon   = By.className("a-icon a-icon-alert");

  

    public  void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSignIn() {
        driver.findElement(signInButton).click();
    }

    public String getPasswordError() {
        WebElement passerror = driver.findElement(passwordErrorMessage);
        return passerror.isDisplayed() ? passerror.getText() : "";
    }
    
    public String getEmailError() {
    	WebElement emailerror = driver.findElement(emailErrorMessage);
    	WebElement emailerroricon = driver.findElement(emailErrorIcon);
    	   return emailerror.isDisplayed() && emailerroricon.isDisplayed() ? emailerror.getText() : "";
    }
    
}
