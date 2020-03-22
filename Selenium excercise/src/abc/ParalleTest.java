package abc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParalleTest {

	WebDriver driver;

	@Test
	@Parameters("browser")
	public void testcase(String browser) {
		if (browser.contains("chrome")) {
			System.setProperty("Webdriver.driver.chrome", "D:\\selenium jar files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.maccosmetics.com");

		} else if (browser.contains("firefox")) {
			System.setProperty("Webdriver.gecko.driver", "D:\\selenium jar files\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.maccosmetics.com");

		}
	}

}
