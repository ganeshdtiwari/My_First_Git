package myStretchTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_01 {

	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.phptravels.net");
		System.out.println("URL is entered.");
		driver.findElement(By.xpath("//div[3]/div/div/div[2]/ul/ul/li[1]/a")).click();
		System.out.println("My Account link is clicked.");
		driver.findElement(By.xpath("//div[3]/div/div/div[2]/ul/ul/li[1]/ul/li[2]/a")).click();
		System.out.println("Sign in link is clicked.");
		driver.findElement(By.xpath("//*[contains(@name,'firstname')]")).sendKeys("ganesh");
		System.out.println("First Name is Passed");
		driver.findElement(By.xpath("//*[contains(@name,'lastname')]")).sendKeys("tiwari");
		System.out.println("Last Name is Passed");
		driver.findElement(By.xpath("//*[contains(@name,'phone')]")).sendKeys("9876543210");
		System.out.println("Number is Passed");
		driver.findElement(By.xpath("//*[contains(@name,'email')]")).sendKeys("ganeshdtiwari91@gmail.com");
		System.out.println("Email Name is Passed");
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[7]/input")).sendKeys("oZjhzm6c");
		System.out.println("Password1 is Passed");
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[8]/input")).sendKeys("oZjhzm6c");
		System.out.println("Password2 Name is Passed");
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[9]/button")).click();
		System.out.println("Signup button is clicked.");
		driver.findElement(By.linkText("Hotels")).click();
		System.out.println("Hotel link is clicked.");
		//Thread.sleep(3000);
		WebElement hover0 = driver.findElement(By.xpath(".//*[@id='body-section']/div[3]/div/div"));
		Actions action0 = new Actions(driver);
		action0.moveToElement(hover0).build().perform();
		driver.findElement(By.xpath(".//*[@id='body-section']/div[3]/div/div/div[4]/div/a")).click();
		System.out.println("Filter button is clicked.");
		Thread.sleep(3000);
		WebElement hover1 = driver.findElement(By.xpath(".//*[@id='collapse1']/div[1]/div/div[5]"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(hover1).build().perform();
		driver.findElement(By.xpath(".//*[@id='collapse1']/div[1]/div/div[5]/div")).click();  
		System.out.println("Star box is checked.");
		driver.findElement(By.xpath(".//*[@id='searchform']")).click();
		System.out.println("search Button is clicked.");
		//Thread.sleep(3000);
		WebElement hover4 = driver.findElement(By.xpath(".//*[@id='body-section']/div[7]/div[2]/div/table/tbody/tr[1]/td"));
		Actions action4 = new Actions(driver);
		action4.moveToElement(hover4).build().perform();
		driver.findElement(By.xpath(".//*[@id='body-section']/div[7]/div[2]/div/table/tbody/tr[1]/td/div[2]/div/div[5]/a/button")).click();
		System.out.println("Details button is clicked.");
		driver.findElement(By.xpath(".//*[@id='ROOMS']/form[1]/div/div[3]/div[2]/span")).click();
		System.out.println("Book Now Button is clicked.");
		driver.findElement(By.xpath("//div[3]/div/div/div[2]/ul/ul/li[1]/a")).click();
		System.out.println("My Account link is clicked.");
		driver.findElement(By.xpath("html/body/div[3]/div/div/div[2]/ul/ul/li[1]/ul/li[2]/a")).click();;
		System.out.println("Logout Button is clicked.");
		driver.quit();
		

	}

}
