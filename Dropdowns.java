package com.mindtree.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		driver.get("https://spicejet.com/");
		Select s=new Select(driver.findElement(By.id("")));
		s.selectByValue("6");
		s.selectByIndex(1);
		s.selectByVisibleText("adult2");
		//for static dropdowns with select in html code

	}

}
