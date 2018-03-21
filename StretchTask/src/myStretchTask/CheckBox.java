package myStretchTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		//System.setProperty("webdriver.ie.driver", "C:\\selenium\\IEDriverServer.exe");
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.zurmo.com");
		System.out.println("URL is entered");
		driver.findElement(By.id("LoginForm_username")).sendKeys("super");
		System.out.println("Username is entered");
		driver.findElement(By.id("LoginForm_password")).sendKeys("super");
		System.out.println("Password is entered");
		driver.findElement(By.linkText("Sign in")).click();
		System.out.println("sign in button is clicked");
		driver.findElement(By.linkText("Accounts")).click();
		System.out.println("Accounts button is clicked");
		/*WebElement checkbox =driver.findElement(By.xpath(".//*[@id='list-view']/div[2]/table/tbody/tr[2]/td[1]/label"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();",checkbox);*/
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement checkBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='list-view']/div[2]/table/tbody/tr[1]/td[1]/label")));
		checkBox.click();
		System.out.println("Checkbox is clicked.");
		driver.findElement(By.linkText("Update")).click();
		System.out.println("Update link is clicked");
		//driver.findElement(By.linkText("Selected")).click();
		//driver.findElement(By.xpath(".//*[@id='list-view-massActionSelected']/a")).click();
		WebElement selected = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Selected")));
		selected.click();
		System.out.println("Selected is clicked");
		
		

	}

}
