package abc;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Exc {

	
	WebDriver driver;

	@Test
	//@Parameters("browser")
	public void testcase() {
	/*	if (browser.contains("chrome")) {
			System.setProperty("Webdriver.driver.chrome", "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.maccosmetics.com");

		} else if (browser.contains("firefox")) {
			System.setProperty("Webdriver.gecko.driver", "D:\\selenium jar files\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.maccosmetics.com");

		}*/
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.maccosmetics.com");
        
		int number = 34;
		String result;
			
		result = (number> 35) ? "Greater" : "lesser";
		System.out.println("The: "+result);
	}

	
	
	
	
	
	
	
	
	/*public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		WebDriver driver = new ChromeDriver();
		ChromeOptions co = new ChromeOptions();
		co.setPageLoadStrategy(PageLoadStrategy.EAGER);
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		File a = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(a, new File("E:\\abc.png"),true);
		

		List<Integer> arr = new ArrayList<Integer>();

		arr.add(4);
		
		System.out.println(Collections.binarySearch(arr, 4));
		*/
	/*Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	
	for (int i=0; i<a; i++)
	{
		for(int j=a; j>=i; j--)
		{
			System.out.print(" ");
		}
		for(int k=i; k>=0; k--)
		{
			System.out.print(" *");
		}
		
		System.out.println("");
	}
		*/
}
