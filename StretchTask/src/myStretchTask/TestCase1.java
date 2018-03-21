package myStretchTask;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.verifier.exc.StaticCodeConstraintException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase1 {

	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net");
		Thread.sleep(4000);
		System.out.println("URL is entered.");
        Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='citiesInput']")).sendKeys("Lo");;
		
		System.out.println("Serach text entered.");
		Thread.sleep(4000);

		String citytoBeSearched = "London, United Kingdom";
		setLocation(citytoBeSearched);
        Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='dpean1']/input")).click();
		System.out.println("Check in date selected");

		String date = "31-December 2017";
		String splitter[] = date.split("-");
		String checkInDay = splitter[0];
		String checkInMonthYear = splitter[1];
		System.out.println(checkInDay);
		System.out.println(checkInMonthYear);

		String date1 = "3-January 2018";
		String splitter1[] = date1.split("-");
		String checkOutDay = splitter1[0];
		String checkOutMonthYear = splitter1[1];
		System.out.println(checkOutDay);
		System.out.println(checkOutMonthYear);

		selectDate(checkInMonthYear, checkInDay);
		selectDate(checkOutMonthYear, checkOutDay);

		driver.findElement(By.xpath(".//*[@id='EXPEDIA']/form/div[2]/div[4]/button")).click();
		Thread.sleep(5000);
		WebElement hover0 = driver.findElement(By.xpath(".//*[@id='body-section']/div[3]/div/div"));
		Actions action0 = new Actions(driver);
		action0.moveToElement(hover0).build().perform();
		driver.findElement(By.xpath(".//*[@id='body-section']/div[3]/div/div/div[4]/div/a")).click();
		System.out.println("Filter button is clicked.");
		Thread.sleep(6000);
		WebElement hover1 = driver.findElement(By.xpath(".//*[@id='collapse1']/div[1]/div/div[5]"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(hover1).build().perform();
		driver.findElement(By.xpath(".//*[@id='collapse1']/div[1]/div/div[5]/div")).click();
		System.out.println("Star box is checked.");
		Thread.sleep(6000);
		driver.findElement(By.xpath(".//*[@id='searchform']")).click();
		System.out.println("search Button is clicked.");
		Thread.sleep(6000);
		WebElement hover2 = driver
				.findElement(By.xpath(".//*[@id='body-section']/div[7]/div[2]/div/table/tbody/tr[1]/td"));
		Actions action2 = new Actions(driver);
		action2.moveToElement(hover2).build().perform();
		driver.findElement(
				By.xpath(".//*[@id='body-section']/div[7]/div[2]/div/table/tbody/tr[1]/td/div[2]/div/div[5]/a/button"))
				.click();
		System.out.println("Details button is clicked.");
		Thread.sleep(6000);

		driver.findElement(By.xpath(".//*[@id='ROOMS']/form[1]/div/div[3]/div[2]/span")).click();
		System.out.println("Book Now Button is clicked.");
		Thread.sleep(4000);
		driver.close();
		System.out.println("Closing the Browser.");

	}

	public static void setLocation(String location) {
		List<WebElement> nameOfLocations = driver.findElements(By.xpath(".//*[@id='eac-container-citiesInput']/ul/li"));

		for (WebElement ele : nameOfLocations) {
			ele.getText();
			System.out.println(ele.getText());
			if (ele.getText().equals(location)) {
				ele.click();
			}
		}

	}

	public static void selectDate(String monthYear, String day) {
		List<WebElement> elements = driver
				.findElements(By.xpath(".//div[@class='datepicker-days']/table/thead/tr/th[@class='switch']"));

		for (WebElement mY : elements) {
			System.out.println(mY.getText());
			if (mY.getText().equals(monthYear)) {
				// select the date
				System.out.println("Inside if condition.");
				List<WebElement> days = driver
						.findElements(By.xpath(".//div[@class='datepicker-days']/table/tbody/tr/td[@class='day ']"));
				for (WebElement dY : days) {
					if (dY.getText().equals(day)) {
						dY.click();
						System.out.println("Date is clicked.");
						return;

					}

				}

			}

		}

	}

}
