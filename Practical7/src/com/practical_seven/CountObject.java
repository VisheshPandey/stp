package com.practical_seven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountObject {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://vishesh-pandey.github.io/v-images");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Links: " + links.size());
		
		for (int i = 0; i < links.size(); i++) {
			System.out.println("Link: " + links.get(i).getText());
		}
		
		System.out.println("This is here:");
		System.out.println(driver.findElement(By.tagName("a")));
	}
}
