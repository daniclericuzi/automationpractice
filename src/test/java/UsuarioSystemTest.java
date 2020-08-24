import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.jupiter.api.Test;

public class UsuarioSystemTest extends BaseTest {
	
	// Teste de criação de novo Login
	
	@Test
	public void testCreateNewUser_userCreatedSuccessfully() {
		
		HomePage homePage = new HomePage(driver);
		homePage.goToSignIn();
		
		CreateUserPage createUserPage = new CreateUserPage(driver);
		createUserPage.createAccount("camilatorres19876@hotmail.com");
	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		AccountPage accountPage = new AccountPage(driver);
		accountPage.createNewAccount("Camila", "Torres", "123456", "Sunshine", "San Francisco", "94016", "5", "9852475");
		
		MyAccountPage myAccountPage = new MyAccountPage(driver);
		assertTrue(myAccountPage.createdUser("Camila", "Torres"));
	}
	
	@After
    public void encerra() {
        driver.close();
    }
	
}

