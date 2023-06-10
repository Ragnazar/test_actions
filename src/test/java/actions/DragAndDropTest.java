package actions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class DragAndDropTest extends BaseTest {
    @Test
    public void test() throws InterruptedException {
        final String URL = "https://www.w3schools.com/html/html5_draganddrop.asp";

        driver.get(URL);

        WebElement draggableFrom = driver.findElement(By.xpath("//img[@id='drag1']"));
        WebElement draggableTo = driver.findElement(By.xpath("//div[@id='div2']"));

        //Не заработает, нужна инъекция javascript с эмуляцией drag'n'drop
        actions.dragAndDrop(draggableFrom, draggableTo).perform();

        sleep(5000);
    }
}
