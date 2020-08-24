import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ProductPage {
	
	private WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectProductOnAList (String text) {
		List<WebElement> productsContainer = driver.findElements(By.id("center_column"));
		
		for (WebElement productContainer: productsContainer) {
			if (productContainer.getText().contains(text)) {
				productContainer.click();
				break;
			}
		} 	
	}
}
