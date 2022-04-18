package com.test.actitime;

import org.testng.annotations.Test;
import com.generics.actitime.BaseTest;
import com.pages.actitime.ActitimeHomePage;
import com.pages.actitime.ActitimeLoginPage;

public class ActitimeTEST extends BaseTest
{
	@Test
	public void login() throws InterruptedException 
	{
		ActitimeLoginPage login = new ActitimeLoginPage(driver);
		login.loginMethod();
		
		ActitimeHomePage home= new ActitimeHomePage(driver);
		home.logoutMethod();

	}

}
