
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

public class LoginAccountTest extends BaseTest {
	
	// Testa o Login em uma conta existente
	
	@Test
	public void testCheckUserLogin_UserSignedInSuccessfully () {
		
		HomePage homePage = new HomePage(driver);
		homePage.goToSignIn();
		
		CreateUserPage createUserPage = new CreateUserPage(driver);
		createUserPage.loginAccount("camilatorres19876@hotmail.com", "123456");
		
		MyAccountPage myAccountPage = new MyAccountPage(driver);
		assertTrue(myAccountPage.createdUser("Camila", "Torres"));
		
	}
	
}
