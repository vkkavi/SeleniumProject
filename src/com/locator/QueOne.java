package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QueOne {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumClass\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		/// Actions a = new Actions(driver);
		driver.findElement(By.xpath("//a[text()='CONTACT US']")).click();
		driver.findElement(By.id("InputName")).sendKeys("kavitha");
		driver.findElement(By.id("InputEmail1")).sendKeys("vkkavi78");
		driver.findElement(By.xpath("(//input[@name='phone'])[1]")).sendKeys("9876543210");
		driver.findElement(By.xpath("(//select[@name='courses'])[1]")).click();
		driver.findElement(By.xpath("(//option[text()='Selenium'])[1]")).click();
		driver.findElement(By.xpath("(//select[@name='branch'])[1]")).click();
		driver.findElement(By.xpath("(//option[text()='Adyar'])[1]")).click();
		driver.findElement(By.xpath("(//select[@name='time'])[1]")).click();
		driver.findElement(By.xpath("(//option[text()='In 2 Weeks'])[1]")).click();
		driver.findElement(By.xpath("//textarea[@placeholder='Message*']")).sendKeys("im happy to join here");
		driver.quit();

	}

}
