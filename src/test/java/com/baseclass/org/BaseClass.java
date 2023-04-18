package com.baseclass.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void launchUrl(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static String titleCheck(String title) {
		return titleCheck(title);
	}
	
	public static String urlCheck(String checkU) {
		return urlCheck(checkU);
	}
	
	public static boolean logoCheck(WebElement logo) {
		return logo.isDisplayed();
	}
	
	public static boolean logoCheck1(WebElement logo1) {
		return logo1.isEnabled();
	}
	
	public static void inputPass(WebElement elem,String input) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value', '"+input+"')", elem);
		
	}
	
	public static void clickElement(WebElement elem) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", elem);
	
	}
	

}
