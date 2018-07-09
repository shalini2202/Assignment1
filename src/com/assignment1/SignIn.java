package com.assignment1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SignIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\a631020\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.className("login")).click();
		
		driver.findElement(By.id("email")).sendKeys("shalinigupta.it44@gmail.com");
		
		driver.findElement(By.id("passwd")).sendKeys("om**om");
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		String name = driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a/span")).getText();
		
		Assert.assertTrue(name.toLowerCase().contains("shalini gupta"));
		System.out.println("Validation Successfull....");
		
		driver.findElement(By.className("logout")).click();

	}

}
