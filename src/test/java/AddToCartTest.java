

import org.junit.jupiter.api.Test;



public class AddToCartTest extends BaseTest {
	
	// Testar se o produto é adicionado ao carrinho
	
	@Test
	public void AddProductToCart_ProductAddedSuccessfully () {
	
	HomePage homePage = new HomePage(driver);
	homePage.goToSignIn();
		
	CreateUserPage createUserPage = new CreateUserPage(driver);
	createUserPage.loginAccount("camilatorres19876@hotmail.com", "123456");
				
	MyAccountPage myAccountPage = new MyAccountPage(driver);
	myAccountPage.searchDresses("dresses");
	
	ProductPage productPage = new ProductPage(driver);
	productPage.selectProductOnAList ("Printed Chiffon Dress");

	}

}
