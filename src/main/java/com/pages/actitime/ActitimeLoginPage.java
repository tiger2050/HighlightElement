package com.pages.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.Helper;

public class ActitimeLoginPage 
{
	public WebDriver driver;

	@FindBy(id="username")
	private WebElement usernameTextfields;

	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;

	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepmeLoggedInCheckBox;

	@FindBy(id="loginButton")
	private WebElement loginButton;

	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement forgotYourPasswordLink;

	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actitimeincLink;

	public ActitimeLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void loginMethod() throws InterruptedException
	{
		Helper.highlightelement(driver, usernameTextfields);
		usernameTextfields.sendKeys("admin");
		Helper.highlightelement(driver, passwordTextfield);
		passwordTextfield.sendKeys("manager");
		Helper.highlightelement(driver, keepmeLoggedInCheckBox);
		keepmeLoggedInCheckBox.click();
		Helper.highlightelement(driver, loginButton);
		loginButton.click();
		Thread.sleep(3000);
	}
	public void forgotyourpasswordMethod()
	{
		forgotYourPasswordLink.click();
	}
	public void actitimeLinkMethod()
	{
		actitimeincLink.click();
	}





}
