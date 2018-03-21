package myStretchTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Hotel {

	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.phptravels.net");
		System.out.println("URL is entered.");
		 WebElement searchCity
		 =driver.findElement(By.xpath(".//*[@id='citiesInput']"));
		 searchCity.sendKeys("Bengaluru");
		 System.out.println("CityName Entered.");
		 /*Actions hoveTocity = new Actions(driver);
		 hoveTocity.moveToElement(searchCity).build().perform();*/
		 Thread.sleep(3000);
		 driver.findElement(By.xpath(".//*[@id='eac-container-citiesInput']/child::ul/li/div/b")).click();
		 System.out.println("City Selected.");
		 /*WebElement dPean = driver.findElement(By.xpath(".//*[@id='dpean1']"));
		 Actions signInDate = new Actions(driver);
		 signInDate.moveToElement(dPean).build().perform();*/
		 Thread.sleep(3000);
		 driver.findElement(By.xpath(".//*[@id='dpean1']/input")).click();
		 System.out.println("Check in date is clicked.");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("*//div[@class='datepicker-days']/table/tbody/tr[6]/td[@class='day'][1]")).click();
		 System.out.println("Check in date is selected.");

		
	
}
	}