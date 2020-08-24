import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateUserPage {
	
	private WebDriver driver;

	public CreateUserPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void createAccount (String email) {
		
	WebElement emailAdress = driver.findElement(By.id("email_create"));
	WebElement createAccount = driver.findElement(By.className("submit"));
	
	emailAdress.sendKeys(email);
	createAccount.submit();
	
	}
	
	public void loginAccount (String email, String password) {
		WebElement createdEmail = driver.findElement(By.id("email"));
		WebElement createdPassword = driver.findElement(By.id("passwd"));
		WebElement buttonSignIn = driver.findElement(By.id("SubmitLogin"));
		
		createdEmail.sendKeys(email);
		createdPassword.sendKeys(password);
		buttonSignIn.click();
		
	}
	
	public boolean createdUser(String name, String surname) {
		return driver.getPageSource().contains(name) && 
				driver.getPageSource().contains(surname);
	
	}
}
