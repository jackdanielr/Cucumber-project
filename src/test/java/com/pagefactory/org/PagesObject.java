package com.pagefactory.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.org.BaseClass;

public class PagesObject extends BaseClass{
	
	public static WebElement userName() {
			WebElement w=driver.findElement(By.id("email"));
			return w;
		}
	
	
	public static WebElement passWord() {
			WebElement w1=driver.findElement(By.id("pass"));
			return w1;
	}
	
	public static WebElement clickLogin() {
			WebElement w2=driver.findElement(By.xpath("//button[@name='login']"));
			return w2;
		
	}
	
	public static WebElement logo() {
		WebElement w3=driver.findElement(By.xpath("//img[@class='_97vu img']"));
		return w3;
		}

}
