package org.ict.pages;

import org.ict.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@routerlink='login']")
	WebElement LoginButton;

	@FindBy(xpath = "//input[@id='exampleInputEmail1']")
	WebElement EmailTextBox;
	
	@FindBy(id="exampleInputPassword1")
	WebElement PasswordTextBox;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement SubmitButton;

	
	public void ClickLogin() {
		LoginButton.click();
	}
	
	public void ClickEmail() {
		EmailTextBox.click();
	}
	
	public void EnterEmail(String Email) {
		EmailTextBox.sendKeys(Email);
	}
	
	public void ClickPassword() {
		PasswordTextBox.click();
	}
	
	public void EnterPassword(String Pass) {
		PasswordTextBox.sendKeys(Pass);
	}
	
	public void ClickSubmit() {
		SubmitButton.click();
	}

	
	
	
}
