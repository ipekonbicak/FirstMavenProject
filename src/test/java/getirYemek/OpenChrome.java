package getirYemek;

import browser.ChromeBrowser;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class OpenChrome {
    private ChromeBrowser getChrome = new ChromeBrowser();
    private WebDriver driver;
    private String getirYemekURL = "http://web-commerce.development.getirapi.com/yemek/";
    List<WebElement> language;
    List<WebElement> updateButton;
    List<WebElement> elements;

    @Test
    public void openGoogle() throws InterruptedException {
        driver = getChrome.getChromeBrowser();
        driver.get(getirYemekURL);
        Thread.sleep(1000);
        List<WebElement> elements = driver.findElements(By.className("style__ChangeLanguageButton-sc-1xpvsm7-0"));
        for (int j = 0; j < elements.size(); j++) {
            if( j == 0){
                elements.get(j).click();
                Thread.sleep(1000);
                language = driver.findElements(By.className("hMFwUw"));
                language.get(j+1).click();
                Thread.sleep(1000);
                updateButton = driver.findElements(By.className("haSjLq"));
                updateButton.get(2).click();
            }
        }
        Thread.sleep(5000);
        driver.quit();
    }
}
