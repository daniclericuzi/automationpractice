import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UsuarioSystemTest extends BaseTest {
	
	public WebDriver driver;
	
		
	@Test
	public void testCreateNewUser_userCreatedSuccessfully() {
		
		HomePage homePage = new HomePage(driver);
		homePage.goToSignIn();
		
		CreateUserPage createUserPage = new CreateUserPage(driver);
		createUserPage.createAccount("camilatorres9876@hotmail.com");
	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		AccountPage accountPage = new AccountPage(driver);
		accountPage.createNewAccount("Camila", "Torres", "123456", "Sunshine", "San Francisco", "94016", "5", "9852475");
		

		assertTrue(accountPage.createdUser("Camila", "Torres"));
	}
	
	@After
    public void encerra() {
        driver.close();
    }
	
}

