package myStretchTask;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_001 {

	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.phptravels.net");
		//driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement myAccount = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[3]/div/div/div[2]/ul/ul/li[1]/a")));
		myAccount.click();
		System.out.println("My account button is clicked.");
		WebElement signUp = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[3]/div/div/div[2]/ul/ul/li[1]/ul/li[2]/a")));
		signUp.click();
		System.out.println("signUp button is clicked.");
		WebElement firstName = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@name,'firstname')]")));
		firstName.sendKeys("ganesh");
		System.out.println("First Name Entered.");
		WebElement lastName = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@name,'lastname')]")));
		lastName.sendKeys("tiwari");
		System.out.println("Latname is entered");
		WebElement phone = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@name,'phone')]")));
		phone.sendKeys("9876543210");;
		System.out.println("Phone number is entered.");
		WebElement loginbtn = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[contains(@name,'email')]")));
		loginbtn.sendKeys("ganeshdtiwari91@gmail.com");;
		System.out.println("Email is entered.");
						
		WebElement password = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='headersignupform']/div[7]/input")));
		password.sendKeys("oZjhzm6c");;
		System.out.println("Password is entered.");
						
		WebElement confirmPassword = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='headersignupform']/div[8]/input")));
		confirmPassword.sendKeys("oZjhzm6c");
		System.out.println(" Confirm Password is entered.");
		WebElement signUp1 = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='headersignupform']/div[9]/button")));
		signUp1.click();
		System.out.println(" SignUP button is entered.");
		
		WebElement hotel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Hotels")));
		hotel.click();
		System.out.println("Hotel link is clicked.");
		
		
		
		
		
		/*WebElement details = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Details")));
		details.click();
		System.out.println("Hotel link is clicked.");*/
		
		WebElement filter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='body-section']/div[3]/div/div/div[4]/div/a")));
		filter.click();
		System.out.println("Filter link is clicked.");
		
        Thread.sleep(30000);
		System.out.println(driver.findElement(By.id("3")).getAttribute("name"));
		//WebElement starGrade = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("3")));
		WebElement element = driver.findElement(By.id("3"));
		//((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		driver.findElement(By.id("3")).click();
		//starGrade.click();
		System.out.println("StarGrade is selected.");
		
		
		
		/*WebElement hoverClick = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='collapse1']/div[1]/div/div[5]")));
		Actions action = new Actions(driver);
		action.moveToElement(hoverClick).build().perform();
		WebElement clickCheckBox = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//*[@id='collapse1']/div[1]/div/div[5]/div/ins")));
		clickCheckBox.click();
		System.out.println("StarGrade is selected.");
		*/
		WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='searchform']")));
		search.click();
		System.out.println("Search Button is clicked.");
		
		Thread.sleep(30000);
		
		java.util.List<WebElement> linksd = driver.findElements(By.tagName("a"));
		 
		System.out.println(linksd.size());
 
		for (int i = 1; i<=linksd.size(); i=i+1)
 
		{
 
			System.out.println(linksd.get(i).getText());
 
		}
		/*WebElement details1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[4]/div[7]/div[2]/div/table/tbody/tr[1]/td/div[2]/div/div[5]/a/button")));
		details1.click();*/
		driver.findElement(By.xpath(".//*[@id='body-section']/div[7]/div[2]/div/table/tbody/tr[1]/td/div[2]/div/div[5]/a/button")).click();;
		System.out.println("Details link is clicked");
		
		/*WebElement BookNow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='ROOMS']/div/table/tbody/tr[2]/td/div[2]/div/div[5]/div[3]/button")));
		BookNow.click();*/
		
		Thread.sleep(30000);
		
		//driver.findElement(By.xpath(".//*[@id='ROOMS']/div/table/tbody/tr[2]/td/div[2]/div/div[5]/div[3]/button"));
		//System.out.println("BookNow Button is clicked.");
		
		/*WebElement signIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='signintab']")));
		signIn.click();
		System.out.println("SignIn Clicked.");
		
		WebElement userName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='username']")));
		userName.sendKeys("ganeshdtiwari91@gmail.com");
		System.out.println("Email entered");
		
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='password']")));
		password.sendKeys("zaq1ZAQ!");
		System.out.println("Password entered");*/
		
		//WebElement confirmBooking = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='body-section']/div[2]/div/div/div[1]/div[2]/div[2]/div[4]/button")));
		//confirmBooking.click();
		//System.out.println("Confirm Booking is clicked");
		

	}

}
