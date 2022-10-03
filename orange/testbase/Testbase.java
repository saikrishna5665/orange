package com.orange.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import com.orange.objects.OrangeLoginObjects;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	
public WebDriver drive;
public OrangeLoginObjects login;

@BeforeClass(alwaysRun=true)
public void browser() {
	WebDriverManager.chromedriver().setup();
	drive=new ChromeDriver();
	drive.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	drive.get("https://opensource-demo.orangehrmlive.com");
	login=new OrangeLoginObjects(drive);
	
	
	
}

}
