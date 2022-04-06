package com.anagha;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AllGoogleLinks {
	WebDriver driver;

	@Test
	public void printAllGoogleLinksWithTheirHref() {
		driver.get("http://www.google.com");
		List<WebElement> allGoogleLinks = driver.findElements(By.tagName("a"));
		
		// print all links on google.com webpage
		for(WebElement element: allGoogleLinks)
		{
			System.out.println(element.getText() + "-" + element.getAttribute("href"));
		}

	}
	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am inside beforeClass method()");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
		driver = new ChromeDriver();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
