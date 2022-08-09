package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

//*
public class Main {
    private WebDriver driver;
    //локатор кнопки куки
    protected By buttonCookie = By.id("rcc-confirm-button");
    //локатор для кнопки "Заказать" вверху страницы
    protected By buttonOrder = By.xpath(".//button[@class='Button_Button__ra12g']");

    // локатор для кнопки заказать внизу страницы
    protected By buttonOrderBellowPage = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    // локатор для поля "Имя"
    protected By name = By.xpath("//input[@placeholder='* Имя']");
    //локатор для поля "Фамилия"
    protected By surname = By.xpath("//input[@placeholder='* Фамилия']");
    //локатор для поля "Адрес"
    protected By address =By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    //локатор для поля "Станция метро"
    protected By metro =By.xpath("//input[@placeholder='* Станция метро']");

    //локатор для выбора станции
    protected By metroboulevard = (By.xpath("//*[@class='select-search__select']//*[text() = 'Бульвар Рокоссовского']"));
    //локатор для поля "Телефон"
    protected By phone = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    //локатор для кнопки "Далее"
    protected By buttonThen = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    //локатор для поля Когда привезти самокат
    protected By date =(By.xpath("//input[@placeholder='* Когда привезти самокат']"));

    //локатор для поля Про аренду
    protected By blanckpole =(By.xpath("//*[text() = 'Про аренду']"));

    //локатор для поля Срок аренды
    protected By rentalperiod = (By.xpath("//*[@class='Dropdown-control']"));


    protected By day = (By.xpath("//*[text() = 'сутки']"));

    //локатор для поля Цвет Самоката
    protected By scootercolor = (By.id("black"));


    //локатор для поля Комментарий
    protected By comment = (By.xpath("//input[@placeholder='Комментарий для курьера']"));

    //локатор для кнопки заказать
    protected By buttonOrderFormAboutRent = (By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"));

    //Локатор для кнопки да
    protected By buttonyes = (By.xpath("//*[text() = 'Да']"));


    // локатор для кнопки "Статус заказа//
    protected By buttonOrderStatus = (By.xpath("//button[@class='Header_Link__1TAG7']"));

    //локатор для поля ввода номера заказа
    protected By orderNumber = (By.xpath("//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']"));

    // локатор для кнопки "GO"
    protected By buttonGO = By.xpath(".//button[@class='Button_Button__ra12g Header_Button__28dPO']");

    public Main(WebDriver driver) {
        this.driver = driver;
    }


    public  void  setButtonCookie(){
        driver.findElement(buttonCookie).click();
    }

    public  void setButtonOrder(){
        driver.findElement(buttonOrder).click();
    }

    public  void setButtonOrderBellowPage(){
        driver.findElement( buttonOrderBellowPage).click();
    }

    public  void setName(String nameEnter){
        driver.findElement(name).sendKeys(nameEnter);
    }

    public  void setSurname(String surnameEnter){
        driver.findElement(surname).sendKeys(surnameEnter);
    }
    public  void setAddress(String addressEnter){
        driver.findElement(address).sendKeys(addressEnter);
    }
    public  void setMetro(){
        driver.findElement(metro).sendKeys(Keys.ARROW_DOWN);
    }

    public  void setMetro2(){

        driver.findElement(metroboulevard).click();
    }

    public  void setPhone(String phoneEnter){
        driver.findElement(phone).sendKeys(phoneEnter);
    }

    public void setButtonThen(){
       driver.findElement(buttonThen).click();
    }

    public void setDate(String dateEnter){
        driver.findElement(date).sendKeys(dateEnter);
    }

    public void setBlanckpole(){
        driver.findElement(blanckpole).click();
    }

    public void setRentalperiod(){
        driver.findElement(rentalperiod).click();
    }
    public void setDay(){
        driver.findElement(day).click();
    }

    public void setScootercolor(){
        driver.findElement(scootercolor).click();
    }
    public void setComment(String commentEnter){
        driver.findElement(comment).sendKeys(commentEnter);
    }
    public void setButtonOrderFormAboutRent(){
        driver.findElement(buttonOrderFormAboutRent).click();
    }

    public void setButtonyes(){
        driver.findElement(buttonyes).click();
    }


    // методы для поля Номер заказа
    public void setButtonOrderStatus() {
        driver.findElement(buttonOrderStatus).click();
    }
    public void setOrderNumber(int orderNumberEnter) {
        driver.findElement(orderNumber).sendKeys();
    }
    public void setButtonGO() {
        driver.findElement(buttonGO).click();
    }



    public void order_draft(String nameEnter, String surnameEnter, String addressEnter, String phoneEnter, String dateEnter, String commentEnter){
        setName(nameEnter);
        setSurname(surnameEnter);
        setAddress(addressEnter);
        setMetro();
        setMetro2();
        setPhone(phoneEnter);
        setButtonThen();
        setDate(dateEnter);
        setBlanckpole();
        setRentalperiod();
        setDay();
        setScootercolor();
        setComment(commentEnter);
        setButtonOrderFormAboutRent();
        setButtonyes();
    }

    public void orderInHeadder(String nameEnter, String surnameEnter, String addressEnter, String phoneEnter, String dateEnter, String commentEnter) {
        setButtonCookie();
        setButtonOrder();
        order_draft(nameEnter, surnameEnter, addressEnter, phoneEnter, dateEnter, commentEnter);
    }

    public void orderOnPage(String nameEnter, String surnameEnter, String addressEnter, String phoneEnter, String dateEnter, String commentEnter){
        setButtonCookie();
        setButtonOrderBellowPage();
        order_draft(nameEnter, surnameEnter, addressEnter, phoneEnter, dateEnter, commentEnter);
    }



}

