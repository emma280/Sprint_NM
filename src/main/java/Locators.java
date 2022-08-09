import org.openqa.selenium.By;

public class Locators {
//Лого "Яндекс" в верхнем левом углу страницы
protected By yaLogo = By.xpath("//img[@alt='Yandex']");

//Лого "Самокат" в верхнем левом углу страницы
protected By scooterLogo = By.xpath("//img[@alt='Scooter']");

//Кнопка "Куки" внизу страницы
protected By buttonCookie = By.id("rcc-confirm-button");

// Кнопка "Заказать" в  вверху страницы
protected By buttonOrder = By.xpath(".//button[@class='Button_Button__ra12g']");

//Кнопка "Статус Заказа" в вверху страницы
protected By buttonOrderStatus = (By.xpath("//button[@class='Header_Link__1TAG7']"));

// Поле Номер заказа в верху страницы  отображается по нажатию кнопки "Статус Заказа"
protected By orderNumber = (By.xpath("//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']"));

// Кнопка Go в верху страницы  отображается по нажатию кнопки "Статус Заказа"
protected By buttonGO = By.xpath(".//button[@class='Button_Button__ra12g Header_Button__28dPO']");

//Кнопка Заказать внизу страницы
protected By buttonOrderBellowPage = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

//Поле "Имя" в форме "Для кого самокат"
protected By name = By.xpath("//input[@placeholder='* Имя']");

//Поле "Фамилия" в форме "Для кого самокат"
protected By surname = By.xpath("//input[@placeholder='* Фамилия']");

//Поле "Адрес" в форме "Для кого самокат"
protected By address =By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");

//Поле "Станция метро" в форме "Для кого самокат"
protected By metro =By.xpath("//input[@placeholder='* Станция метро']");

// Всплывающий список станций метро в форме "Для кого самокат"
protected By metroboulevard = (By.xpath("//*[@class='select-search__select']//*[text() = 'Бульвар Рокоссовского']"));

//Поле "Телефон" в форме "Для кого самокат"
protected By phone = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");

// Кнопка Далее в форме "Для кого самокат"
protected By buttonThen = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

//Поле "Когда привезти самокат" в форме "Для кого самокат"
protected By date =(By.xpath("//input[@placeholder='* Когда привезти самокат']"));

//Поле "Срок аренды" в форме "Для кого самокат"
protected  By rentalperiod = (By.xpath("//*[@class='Dropdown-control']"));

// Всплывающий список поля срок аренды в форме "Для кого самокат"
protected By day = (By.xpath("//*[text() = 'сутки']"));

//Поле "Цвет самоката" в форме "Для кого самокат"
protected By scootercolor = (By.id("black"));

//Поле "Комментарий" в форме "Для кого самокат"
protected By comment = (By.xpath("//input[@placeholder='Комментарий для курьера']"));

// Кнопка Заказать в форме "Для кого самокат"
protected By buttonOrderFormAboutRent = (By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"));

// Кнопка Да в форме "Для кого самокат"
protected By buttonyes = (By.xpath("//*[text() = 'Да']"));

}
