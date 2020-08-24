import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver; 
	
	}
	public void goToSignIn() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement signIn = driver.findElement(By.className("login"));
		
		signIn.click();
	}
		
	
}
