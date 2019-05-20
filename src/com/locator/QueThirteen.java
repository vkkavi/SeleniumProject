package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QueThirteen {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumClass\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		driver.findElement(By.xpath("//a[text()='login']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("9876543210");
		driver.findElement(By.xpath("(//button[text()='continue'])[1]")).click();
	}

}
