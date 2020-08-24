import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AccountPage {
	
	public WebDriver driver;
	
	public AccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void createNewAccount(String name, String surname, String password, String street, String city, String postalCode, String value, String phone) {
	
	// Dados obrigatórios do nome
	
	WebElement firstName = driver.findElement(By.id("customer_firstname"));
	WebElement lastName = driver.findElement(By.id("customer_lastname"));
	WebElement txtpassword = driver.findElement(By.id("passwd")); 
	
	//  Dados obrigatórios do endereço

	WebElement adress = driver.findElement(By.id("address1"));
	WebElement txtcity = driver.findElement(By.id("city"));
	WebElement state = driver.findElement(By.id("id_state"));
	WebElement zipCode = driver.findElement(By.id("postcode"));
	WebElement mobilePhone = driver.findElement(By.id("phone_mobile"));
	WebElement buttonRegister = driver.findElement(By.id("submitAccount"));
	
	
	firstName.sendKeys(name);
	lastName.sendKeys(surname);
	txtpassword.sendKeys(password);
	adress.sendKeys(street);
	Select stateCombobox = new Select(state);
	stateCombobox.selectByValue(value);
	txtcity.sendKeys(city);
	zipCode.sendKeys(postalCode);
	mobilePhone.sendKeys(phone);
	buttonRegister.click();
	
	}
	
	public boolean createdUser(String name, String surname) {
		return driver.getPageSource().contains(name) && 
				driver.getPageSource().contains(surname);
	}


}
