package com.practical3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticalThree {
	public static void main(String[] args) {
		
		WebDriver myDriver = new ChromeDriver();
		myDriver.get("https://www.google.com");
	}
}
