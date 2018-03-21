package myStretchTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase3 {

	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.zurmo.com");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement userName = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='LoginForm_username']")));
		userName.sendKeys("super");
		System.out.println("UserName jim is Entered");
		WebElement password = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='LoginForm_password']")));
		password.sendKeys("super");
		System.out.println("password jim  is Entered.");
		WebElement signIn = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Login']/span[3]")));
		signIn.click();
		System.out.println("SignIn button is clicked");

		WebElement create = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Create")));
		create.click();
		System.out.println("Create button is clicked");
		WebElement accounts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Account")));
		accounts.click();
		System.out.println("Accounts link is clicked");
		WebElement name = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Account_name']")));
		name.sendKeys("Thor");
		System.out.println("Name Thor is Entered");
		WebElement officePhone = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Account_officePhone']")));
		officePhone.sendKeys("2233445566");
		System.out.println("Office phone is Entered");

		Select industry = new Select(driver.findElement(By.xpath(".//*[@id='Account_industry_value']")));
		industry.selectByValue("Energy"); // deselectByValue("Energy");

		WebElement officeFax = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Account_officeFax']")));
		officeFax.sendKeys("223344");
		System.out.println("Office Fax is Entered");

		WebElement employees = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Account_employees']")));
		employees.sendKeys("1234");
		System.out.println("Employees is Entered");

		WebElement annualRevenue = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Account_annualRevenue']")));
		annualRevenue.sendKeys("6.6");
		System.out.println("AnnualRevenue is Entered");

		Select type = new Select(driver.findElement(By.xpath(".//*[@id='Account_type_value']")));
		type.selectByValue("Prospect"); // deselectByValue("Energy");

		WebElement webSite = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Account_website']")));
		webSite.sendKeys("xyz.com");
		System.out.println("Website is Entered");

		WebElement bAStreet1 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Account_billingAddress_street1']")));
		bAStreet1.sendKeys("BA Street1");
		System.out.println(" BA Street1 is Entered");

		WebElement bAStreet2 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Account_billingAddress_street2']")));
		bAStreet2.sendKeys("BA Street2");
		System.out.println("BA Street2 is Entered");

		WebElement bACity = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Account_billingAddress_city']")));
		bACity.sendKeys("BA City");
		System.out.println("BA City is Entered");

		WebElement bAState = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Account_billingAddress_state']")));
		bAState.sendKeys("BA State");
		System.out.println("BA State is Entered");

		WebElement bAPostalCode = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='Account_billingAddress_postalCode']")));
		bAPostalCode.sendKeys("BA PostalCode");
		System.out.println("BA PostalCode is Entered");

		WebElement bACountry = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Account_billingAddress_country']")));
		bACountry.sendKeys("BA Country");
		System.out.println("BA Country is Entered");

		WebElement sAStreet1 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Account_shippingAddress_street1']")));
		sAStreet1.sendKeys("SA Street1");
		System.out.println(" SA Street1 is Entered");

		WebElement sAStreet2 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Account_shippingAddress_street2']")));
		sAStreet2.sendKeys("SA Street2");
		System.out.println("SA Street2 is Entered");

		WebElement sACity = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Account_shippingAddress_city']")));
		sACity.sendKeys("SA City");
		System.out.println(" SA City is Entered");

		WebElement sAState = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Account_shippingAddress_state']")));
		sAState.sendKeys("SA State");
		System.out.println("SA State is Entered");

		WebElement sAPostalCode = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='Account_shippingAddress_postalCode']")));
		sAPostalCode.sendKeys("SA PostalCode");
		System.out.println(" SA PostalCode is Entered");

		WebElement sACountry = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Account_shippingAddress_country']")));
		sACountry.sendKeys("SA Country");
		System.out.println("SA Country is Entered");

		WebElement description = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Account_description']")));
		description.sendKeys("Country");
		System.out.println("Description is Entered");

		WebElement save = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Save")));
		save.click();
		System.out.println("save link is clicked");

		WebElement accounts1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Accounts")));
		accounts1.click();
		System.out.println("Accounts link is clicked");

		WebElement hoverClick = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='list-view']/div[2]/table/tbody/tr[1]/td[6]")));
		Actions action = new Actions(driver);
		action.moveToElement(hoverClick).build().perform();
		WebElement clickCheckBox = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='list-view']/div[2]/table/tbody/tr[1]/td[6]/a")));
		clickCheckBox.click();
		System.out.println("Clicked on the pencil icon to edit.");

		WebElement editName = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Account_name']")));
		editName.clear();
		editName.sendKeys("Ajax1");
		System.out.println("Name field is edited");

		WebElement editEmployees = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Account_employees']")));
		editEmployees.clear();
		editEmployees.sendKeys("131");
		System.out.println("Employees field is edited");

		WebElement editAnnualRevenue = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Account_annualRevenue']")));
		editAnnualRevenue.clear();
		editAnnualRevenue.sendKeys("6.555");
		System.out.println("Annual Revenue field is edited.");

		WebElement editSave = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Save")));
		editSave.click();
		System.out.println("After edit save is clicked.");

		WebElement superlink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("super")));
		superlink.click();
		System.out.println("Super link is clicked.");

		WebElement signout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign out")));
		signout.click();
		System.out.println("Sign out link is clicked.");

		driver.close();

	}

}
