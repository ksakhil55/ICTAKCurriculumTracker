package org.ict.pages;

import org.ict.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminCreateFormPage extends BaseClass {
	WebDriver driver;

	public AdminCreateFormPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='fs-6 font-weight-semi-bold d-sm-inline']")
	WebElement AdminDash;

	@FindBy(xpath = "//button[@class='btn']")
	WebElement CreateForm;
	
	@FindBy(xpath = "//input[@name='requirementName']")
	WebElement ReqName;
	
	@FindBy(xpath = "//option[@value='ST']")
	WebElement TrainAreaST;
	
	@FindBy(xpath = "//input[@id='institution']")
	WebElement Institution;
	
	@FindBy(xpath = "//option[@value='Retail']")
	WebElement CategoryRetail;
	
	@FindBy(xpath = "//input[@id='trainingHours']")
	WebElement TrainingHrs;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement SubmitButton;
	
	
	public void ClickAdmDash() {
		AdminDash.click();;
	}

	public void ClickCreateForm() {
		CreateForm.click();
	}
	
	public void InpReqName(String RqName) {
		ReqName.sendKeys(RqName);
	}

	public void SelectST() {
		TrainAreaST.click();
	}
	
	public void InpInstitution(String Ins) {
		ReqName.sendKeys(Ins);
	}
	
	public void ClickSubmit() {
		SubmitButton.click();
	}
	
	
	public void InpTrainHrs(String Hrs) {
		ReqName.sendKeys(Hrs);
	}
	
	public void SelectRetail() {
		CategoryRetail.click();
	}
	
}



