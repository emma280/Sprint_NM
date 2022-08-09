import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class CheckingQuestions {
    public static WebDriver driver;

    @Before
    public void setUp() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
    Thread.sleep(3000);
    }
    // Проверки выпадающего списка "Вопросы о важном"
    @Test
    public void testClickontheQuestionofCost() throws InterruptedException {
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.id("accordion__heading-0")).click();

        assertTrue(driver.findElement(By.cssSelector("[id='accordion__panel-0'] p")).isDisplayed());
        assertTrue( driver.findElement(By.cssSelector("[id='accordion__panel-0'] p")).getText()
                .contains("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));
      //Thread.sleep(3000);
    }

    @Test
    public void testClickOnTheQuestionAboutQuantity() throws InterruptedException {
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.id("accordion__heading-1")).click();

       assertTrue(driver.findElement(By.cssSelector("[id='accordion__panel-1'] p")).isDisplayed());
       assertTrue( driver.findElement(By.cssSelector("[id='accordion__panel-1'] p")).getText()
                .contains("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));
    //  Thread.sleep(3000);

    }
    @Test
    public void testClickOnTheQuestionAboutRentalTime() throws InterruptedException {
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.id("accordion__heading-2")).click();

        assertTrue(driver.findElement(By.cssSelector("[id='accordion__panel-2'] p")).isDisplayed());
        assertTrue( driver.findElement(By.cssSelector("[id='accordion__panel-2'] p")).getText()
                .contains("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));
        //Thread.sleep(3000);

    }
    @Test
    public void testClickOnTheQuestionAboutDeliveryToday() throws InterruptedException {
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.id("accordion__heading-3")).click();

       assertTrue(driver.findElement(By.cssSelector("[id='accordion__panel-3'] p")).isDisplayed());
       assertTrue( driver.findElement(By.cssSelector("[id='accordion__panel-3'] p")).getText()
                .contains("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));
        //Thread.sleep(3000);

    }

    @Test
    public void testClickOnTheQuestionAboutExtension() throws InterruptedException {
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.id("accordion__heading-4")).click();

        assertTrue(driver.findElement(By.cssSelector("[id='accordion__panel-4'] p")).isDisplayed());
        assertTrue( driver.findElement(By.cssSelector("[id='accordion__panel-4'] p")).getText()
                .contains("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."));
        //Thread.sleep(3000);

    }

    @Test
    public void testClickOnTheQuestionAboutCharging() throws InterruptedException {
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.id("accordion__heading-5")).click();

        assertTrue(driver.findElement(By.cssSelector("[id='accordion__panel-5'] p")).isDisplayed());
        assertTrue( driver.findElement(By.cssSelector("[id='accordion__panel-5'] p")).getText()
                .contains("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."));
        //Thread.sleep(3000);
    }
    @Test
    public void testClickOnTheQuestionAboutOrderCancelation() throws InterruptedException {
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.id("accordion__heading-6")).click();

        assertTrue(driver.findElement(By.cssSelector("[id='accordion__panel-6'] p")).isDisplayed());
        assertTrue( driver.findElement(By.cssSelector("[id='accordion__panel-6'] p")).getText()
                .contains("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."));
        Thread.sleep(3000);
    }

    @Test
    public void testClickOnTheQuestionAboutDictance() throws InterruptedException {
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.id("accordion__heading-7")).click();

        assertTrue(driver.findElement(By.cssSelector("[id='accordion__panel-7'] p")).isDisplayed());
       assertTrue( driver.findElement(By.cssSelector("[id='accordion__panel-7'] p")).getText()
                .contains("Да, обязательно. Всем самокатов! И Москве, и Московской области."));
        //Thread.sleep(3000);
    }

        @After
        public void tearDown () {
            driver.quit();
        }
    }
