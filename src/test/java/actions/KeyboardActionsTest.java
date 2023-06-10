package actions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsTest extends BaseTest{
    @Test
    public void test(){
        final String URL = "https://www.google.ru";

        driver.get(URL);

        Actions actions = new Actions(driver);

        WebElement searchInput = driver.findElement(new By.ByCssSelector("textarea[name = 'q']"));
        actions
                .click(searchInput)
                .sendKeys(searchInput,"selenium")
                .pause(1000)
                .sendKeys(Keys.ARROW_DOWN)
                .pause(1000)
                .sendKeys(Keys.ARROW_DOWN)
                .pause(1000)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.RETURN)
                .build()
                .perform();

    }
}
