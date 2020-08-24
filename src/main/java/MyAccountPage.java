import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {
	
	private WebDriver driver;

	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean createdUser(String name, String surname) {
		return driver.getPageSource().contains(name) && 
				driver.getPageSource().contains(surname);
	
	}
	
	public void searchDresses (String clothe) {
		WebElement search = driver.findElement(By.id("search_query_top"));
		WebElement btnSubmitSearch = driver.findElement(By.name("submit_search"));
		
		search.sendKeys(clothe);
		btnSubmitSearch.click();
		
		
	}


}
