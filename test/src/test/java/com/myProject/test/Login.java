package com.myProject.test;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	
	@Test
	
	public void method() throws Exception{
		
		
		String path = new File(".").getCanonicalPath()+ "//driver//chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=7lg2WbqnJKrougTZ-oCgCg");
			
	}

}
