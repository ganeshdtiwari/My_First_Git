package myStretchTask;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class datepicker {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.phptravels.net");
		System.out.println("URL is entered.");

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
		

	}
	public static void selectDate(String monthYear,String day ) {
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
