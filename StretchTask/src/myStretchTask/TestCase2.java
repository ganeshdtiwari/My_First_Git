package myStretchTask;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase2 {

	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.get("http://www.automationpractice.com");
		System.out.println("URL is entered");
		Thread.sleep(5000);
		WebElement signIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign in")));
		signIn.click();
		System.out.println("Signin link is clicked");
		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		email.sendKeys("ganeshdtiwari91@gmail.com");
		System.out.println("Username is entered");
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwd")));
		password.sendKeys("zxcvZXCV");
		System.out.println("Password is entered");
		WebElement submitLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SubmitLogin")));
		submitLogin.click();
		System.out.println("Signin button is clicked");
		WebElement dressesLink = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/a")));
		dressesLink.click();
		System.out.println("Dresses link is clicked");
		WebElement casualDressesLink = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='categories_block_left']/div/ul/li[1]/a")));
		casualDressesLink.click();
		System.out.println("CasualDressesLink is clicked");
		WebElement hover = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath(".//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img")));
		hover.click();
		System.out.println("Image is clicked");
		WebElement adddToCart = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='add_to_cart']/button")));
		adddToCart.click();
		System.out.println("Add To Cart is clicked");
		WebElement proceedToCheckout1 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Proceed to checkout")));
		proceedToCheckout1.click();
		System.out.println("Proceed to checkout1 is clicked");
		Thread.sleep(3000);
		WebElement proceedToCheckout2 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='center_column']/p[2]/a[1]/span")));
		proceedToCheckout2.click();
		System.out.println("Proceed to checkout2 is clicked");
		WebElement email1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		email1.sendKeys("ganeshdtiwari91@gmail.com");
		System.out.println("Username is entered");
		WebElement password1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwd")));
		password1.sendKeys("zxcvZXCV");
		System.out.println("Password is entered");
		WebElement submitLogin1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SubmitLogin")));
		submitLogin1.sendKeys(Keys.ENTER);
		System.out.println("Signin button is clicked");
		WebElement proceedToCheckout3 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='center_column']/form/p/button")));
		proceedToCheckout3.click();
		System.out.println("Proceed to checkout3 is clicked");
		WebElement checkBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uniform-cgv")));
		checkBox.click();
		System.out.println("CheckBox is clicked");
		WebElement proceedToCheckout4 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='form']/p/button")));
		proceedToCheckout4.click();
		System.out.println("Proceed to checkout4 is clicked");
		WebElement PayByCheck = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='HOOK_PAYMENT']/div[2]/div/p/a")));
		PayByCheck.click();
		System.out.println("Pay by check is clicked");
		WebElement confirmMyOrder = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='cart_navigation']/button")));
		confirmMyOrder.click();
		System.out.println("Confirm my order is clicked.");
		WebElement signOut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign out")));
		signOut.click();
		System.out.println("Signout is clicked");
		driver.close();

	}

}
