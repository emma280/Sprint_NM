import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobject.Main;
import static org.junit.Assert.*;
public class FunctionalityOrder {
    public static WebDriver driver;


    @Before
    public void setUp() throws InterruptedException {
        driver =  new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        Thread.sleep(3000);
    }
    //Заказ самоката по кнопке Заказать рядом с кнопкой Статус заказа (1 набор данных)
    @Test
    public void testOrderForm1() throws InterruptedException {
        Main main = new Main(driver);
        main.orderInHeadder("Эм", "Ми", "г.Пушкин", "+7911289603", "14.07.2022", "Самокат");
        assertTrue("кнопка посмотреть статус не отобразилась", driver.findElements(By.xpath("//button[text()='Посмотреть статус']")).size()==1);
    }
    //Заказ самоката по кнопке Заказать рядом с кнопкой Статус заказа (2 набор данных)
    @Test
    public void testOrderForm2() throws InterruptedException {
        Main main = new Main(driver);
        main.orderInHeadder("Андрей", "Иванов", "г.Москва ул.Конюшенная д.5", "89111212345", "14.08.2022", "Самокат нужен сегодня");
        assertTrue("кнопка посмотреть статус не отобразилась", driver.findElements(By.xpath("//button[text()='Посмотреть статус']")).size()==1);
    }
    //Заказ самоката по кнопке Заказать внизу страницы (1 набор данных)
    @Test
    public void testOrderForm3() throws InterruptedException {
        Main main = new Main(driver);
        main.orderOnPage("Елизавета", "Андреева", "г.Москва ул.Новый Арбат д.5", "89111212346", "12.08.2022", "Самокат нужен срочно");
        assertTrue("кнопка посмотреть статус не отобразилась", driver.findElements(By.xpath("//button[text()='Посмотреть статус']")).size()==1);
        //Thread.sleep(8000);
    }

    //Заказ самоката по кнопке Заказать внизу страницы (2 набор данных)
    @Test
    public void testOrderForm4() throws InterruptedException {
        Main main = new Main(driver);
        main.orderOnPage("Никита", "Усачев", "г.Псков ул.Новый Арбат д.5", "89111212348", "12.06.2022", "");
        assertTrue("кнопка посмотреть статус не отобразилась", driver.findElements(By.xpath("//button[text()='Посмотреть статус']")).size()==1);
    }


    @After
    public void tearDown () {

        driver.quit();
    }
}

