package com.practical4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticalFour {
	
	public static void main(String[] args) {
		WebDriver myDriver = new ChromeDriver();
		myDriver.get("https://vishesh-pandey.github.io/v-notes/");
		
		String expectedTitle = "v Notes";
		String actualTitle = "";
		
		actualTitle = myDriver.getTitle();
		
		System.out.println(actualTitle);
		
		
		
		
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.print("Content equal working");
		}
		
		else {
			System.out.println("Sahi nahi hai");
		}
		
		
	}
	
	

	

}
