package com.tasks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Hotel {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_Projects\\Driver\\chromedriver1.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
				
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("priyabharathi");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("bharathi");
		driver.findElement(By.id("login")).click();
		WebElement location = driver.findElement(By.id("location"));
		Select s= new Select(location);
		s.selectByValue("Sydney");
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByValue("Hotel Creek");
		WebElement room = driver.findElement(By.id("room_type"));
		Select s2= new Select(room);
		s2.selectByVisibleText("Deluxe");
		WebElement number = driver.findElement(By.name("room_nos"));
		Select s3= new Select(number);
		s3.selectByValue("2");
		WebElement checkin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		checkin.clear();
		checkin.sendKeys("10/07/2022");
		WebElement checkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		checkout.clear();
		checkout.sendKeys("11/07/2022");
		WebElement adult = driver.findElement(By.name("adult_room"));
		Select s4= new Select(adult);
		s4.selectByValue("2");
		WebElement child = driver.findElement(By.name("child_room"));
		Select s5= new Select(child);
		s5.selectByValue("1");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.name("first_name")).sendKeys("priya");
		driver.findElement(By.name("last_name")).sendKeys("bharathi");
		driver.findElement(By.name("address")).sendKeys("abcdefgh");
		driver.findElement(By.name("cc_num")).sendKeys("1234567890123456");
		
		WebElement cctype = driver.findElement(By.name("cc_type"));
		Select s6= new Select(cctype);
		s6.selectByValue("VISA");
		WebElement month = driver.findElement(By.name("cc_exp_month"));
		Select s7= new Select(month);
		s7.selectByValue("12");
		WebElement year = driver.findElement(By.name("cc_exp_year"));
		Select s8= new Select(year);
		s8.selectByValue("2022");
		driver.findElement(By.name("cc_cvv")).sendKeys("123");
		driver.findElement(By.xpath("//input[@id='book_now']")).click();
		
		//driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS); 
		Thread.sleep(5000);
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Projects\\Screenshot\\booking1.png");
		FileUtils.copyFile(src, des);
		
		Thread.sleep(5000);
	}

}
