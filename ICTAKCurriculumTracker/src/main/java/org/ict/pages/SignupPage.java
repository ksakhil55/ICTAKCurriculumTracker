package org.ict.pages;

import org.ict.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage extends BaseClass {
	public SignupPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='create-account']")
	WebElement CreateNewAcc;

	@FindBy(xpath = "//input[@name='Name']")
	WebElement NameField;

	@FindBy(id = "//input[@name='Email']")
	WebElement EmailField;

	@FindBy(xpath = "//input[@name='Contact']")
	WebElement PhoneNo;

	@FindBy(xpath = "//input[@name='Password']")
	WebElement Password;

	@FindBy(xpath = "//input[@name='ConfirmPassword']")
	WebElement ConfirmPassword;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement SubmitButton;

	public void ClickCreateNAcc() {
		CreateNewAcc.click();
	}

	public void ClickName() {
		NameField.click();
	}
	
	public void InpName(String Name) {
		NameField.sendKeys(Name);
	}

	public void ClickEmail() {
		EmailField.click();
	}
	
	public void InpEmail(String Email) {
		NameField.sendKeys(Email);
	}

	public void ClickPhone() {
		PhoneNo.click();
	}
	
	public void InpPhone(String Phone) {
		PhoneNo.sendKeys(Phone);
	}

	public void ClickPass() {
		Password.click();
	}
	
	
	public void InpPass(String Pass) {
		Password.sendKeys(Pass);
	}
	
	public void ClickCPass() {
		ConfirmPassword.click();
	}
	
	
	public void InpCPass(String CPass) {
		ConfirmPassword.sendKeys(CPass);
	}
	
	public void ClickSubmit() {
		SubmitButton.click();
	}
	
}
