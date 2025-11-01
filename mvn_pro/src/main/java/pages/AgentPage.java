package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AgentPage {
    WebDriver driver;

    By newAgentButton = By.id("createAgent");
    By agentNameField = By.id("agentName");
    By saveButton = By.id("saveAgent");
    By successAlert = By.className("alert-success");

    public AgentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void createNewAgent(String agentName) {
        driver.findElement(newAgentButton).click();
        driver.findElement(agentNameField).sendKeys(agentName);
        driver.findElement(saveButton).click();
    }

    public boolean validateSuccessAlert() {
        return driver.findElement(successAlert).isDisplayed();
    }
}
