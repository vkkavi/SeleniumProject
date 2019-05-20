package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QueSixteen {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumClass\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("kavitha");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vkkavi");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("kavivino");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		
	}

}
