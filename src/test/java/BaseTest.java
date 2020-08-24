import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	public static WebDriver driver;
	protected HomePage homePage;
	
	
	@BeforeAll
	public static void openBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\FireFoxDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		
	}
	
	@AfterAll
	public static void closeBrowser() {
		driver.quit();
	}
}

