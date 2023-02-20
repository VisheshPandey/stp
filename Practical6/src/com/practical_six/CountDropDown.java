package com.practical_six;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountDropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/vishe.000/Desktop/try/test.html");
		
		WebElement dropdown = driver.findElement(By.id("select"));
		Select select = new Select(dropdown);
		
		select.selectByIndex(1);
		
	}
}
