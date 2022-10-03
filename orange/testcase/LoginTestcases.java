package com.orange.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orange.objects.OrangeLoginObjects;
import com.orange.testbase.Testbase;

public class LoginTestcases extends Testbase {
	
	@Test
	public void verifylogin_validdata() {
     OrangeLoginObjects login =new OrangeLoginObjects(drive);
	Assert.assertTrue(login.Verifylogo_display(),"ERROR = OrangeHrm logo is not displayed");
	Assert.assertTrue(login.verifyuseraname_display(),"ERROR = UserName TextBox is not displeyed");
	login.VerifyUserInput("Admin");
	Assert.assertTrue(login.Verifypassword_display(),"ERROR = Password is displayed");
	login.VerifyPasswordInput("admin123");
	Assert.assertTrue(login.Verifylogin_diplay(),"ERROR = login buttons is not displayed");
	login.verify_loginclick();
	
	

	
	
	}

}
