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
	
}
