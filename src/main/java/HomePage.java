import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver; 
	
	}
	public void goToSignIn() {
		WebElement signIn = driver.findElement(By.className("login"));
		
		signIn.submit();
	}
		
	
}
