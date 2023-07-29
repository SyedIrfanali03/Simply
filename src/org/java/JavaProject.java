package org.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaProject {
	
	public static void main(String[] args) throws AWTException, InterruptedException {//locator
	
		//Browser configuration
		
		//Up casting
		WebDriver driver = new ChromeDriver();
		
		//To launch browser
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s= new Select(month);
		
		s.selectByIndex(2);
		s.selectByValue("6");
		s.selectByVisibleText("Aug");
		
		//to check whether the our dropdown is single or multiple
		boolean multiple = s.isMultiple();
		
		if (multiple) {
			
			System.out.println("We Can Select More than One Option");
		} 
		else {
            System.out.println("We Can Select Only One Option");
		}
		
		                                           //  0   1   2   3
		List<WebElement> allOption = s.getOptions();//Jan feb mar apri-Dec
		
		//To find the No Of Option
		int noOfOption = allOption.size();
		System.out.println("NoOfOptions:"+noOfOption);
		
		WebElement option = allOption.get(3);
		
		String txt = option.getText();
		System.out.println(txt);
		
		System.out.println("\nTo Get All Options Using Normal forloop");
		for (int i = 0; i < allOption.size(); i++) {
			
			WebElement options = allOption.get(i);
			System.out.println(options.getText());
			
		}
		
		System.out.println("\nTo Get All Options Using Enhanced forloop");
		for (WebElement options : allOption) {
			
			System.out.println(options.getText());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		}
		
		
	
	
	
	
	
	

}
