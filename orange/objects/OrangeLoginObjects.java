package com.orange.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeLoginObjects {


	public OrangeLoginObjects(WebDriver drive) {
		PageFactory.initElements(drive,this);
	}
	@FindBy(xpath="//img[@alt='company-branding']") WebElement logo;
	@FindBy(xpath="//input[@placeholder='Username']") WebElement user;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement password;
	@FindBy(xpath="//button[@type='submit']") WebElement loginbutton;

public boolean Verifylogo_display() {
	return logo.isDisplayed();
}
public boolean verifyuseraname_display() {
	return user.isDisplayed();
	
}
public void VerifyUserInput(String username) {
	user.sendKeys(username);
}
public boolean Verifypassword_display() {
	return password.isDisplayed();
}
public void VerifyPasswordInput(String Password) {
	password.sendKeys(Password);
}
public boolean Verifylogin_diplay()	 {
	return loginbutton.isDisplayed();
}
public void verify_loginclick() {
	loginbutton.click();
}
	



	

}
