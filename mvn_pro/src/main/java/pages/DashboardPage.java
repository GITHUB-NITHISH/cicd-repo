package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    WebDriver driver;
    By agentsModule = By.xpath("//a[contains(text(),'Agents')]");
    By logoutBtn = By.id("logoutBtn");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToAgents() {
        driver.findElement(agentsModule).click();
    }

    public boolean isAgentPresent(String agentName) {
        return driver.getPageSource().contains(agentName);
    }

    public void logout() {
        driver.findElement(logoutBtn).click();
    }
}
