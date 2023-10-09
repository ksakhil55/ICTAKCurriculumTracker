package org.ict.scripts;

import java.io.IOException;

import org.ict.base.BaseClass;
import org.ict.pages.SignupPage;
import org.ict.utilities.ExcelUtility;
import org.testng.annotations.Test;

public class SignupTC extends BaseClass {

	SignupPage Signup;

	// Signup with valid signup data
	@Test(priority = 1)
	public void ValidSignUp() throws IOException {
		Signup = new SignupPage(driver);
		Signup.ClickCreateNAcc();
		// Signup.ClickName();
		String Name = ExcelUtility.getCellData(6, 0);
		Signup.InpName(Name);
		String Email = ExcelUtility.getCellData(7, 0);
		// Signup.ClickEmail();
		Signup.InpEmail(Email);
		// Signup.ClickPhone();
		String Phone = ExcelUtility.getCellData(8, 0);
		Signup.InpPhone(Phone);
		// Signup.ClickPass();
		String Pass = ExcelUtility.getCellData(9, 0);
		Signup.InpPass(Pass);
		// Signup.ClickCPass();
		String CPass = ExcelUtility.getCellData(10, 0);
		Signup.InpCPass(CPass);
		Signup.ClickSubmit();

	}

	// Signup with Name with special characters
	@Test(priority = 2)
	public void InvalidSignUp1() throws IOException {
		Signup = new SignupPage(driver);
		Signup.ClickCreateNAcc();
		String Name = ExcelUtility.getCellData(13, 0);
		Signup.InpName(Name);
		String Email = ExcelUtility.getCellData(14, 0);
		Signup.InpEmail(Email);
		String Phone = ExcelUtility.getCellData(15, 0);
		Signup.InpPhone(Phone);
		String Pass = ExcelUtility.getCellData(16, 0);
		Signup.InpPass(Pass);
		String CPass = ExcelUtility.getCellData(17, 0);
		Signup.InpCPass(CPass);
		Signup.ClickSubmit();

	}

	// Signup with invalid email
	@Test(priority = 3)
	public void InvalidSignUp2() throws IOException {
		Signup = new SignupPage(driver);
		Signup.ClickCreateNAcc();
		String Name = ExcelUtility.getCellData(20, 0);
		Signup.InpName(Name);
		String Email = ExcelUtility.getCellData(21, 0);
		Signup.InpEmail(Email);
		String Phone = ExcelUtility.getCellData(22, 0);
		Signup.InpPhone(Phone);
		String Pass = ExcelUtility.getCellData(23, 0);
		Signup.InpPass(Pass);
		String CPass = ExcelUtility.getCellData(24, 0);
		Signup.InpCPass(CPass);
		Signup.ClickSubmit();

	}

	// Signup with invalid phone number
	@Test(priority = 4)
	public void InvalidSignUp3() throws IOException {
		Signup = new SignupPage(driver);
		Signup.ClickCreateNAcc();
		String Name = ExcelUtility.getCellData(27, 0);
		Signup.InpName(Name);
		String Email = ExcelUtility.getCellData(28, 0);
		Signup.InpEmail(Email);
		String Phone = ExcelUtility.getCellData(29, 0);
		Signup.InpPhone(Phone);
		String Pass = ExcelUtility.getCellData(30, 0);
		Signup.InpPass(Pass);
		String CPass = ExcelUtility.getCellData(31, 0);
		Signup.InpCPass(CPass);
		Signup.ClickSubmit();

	}

	// Signup with different passwords
	@Test(priority = 5)
	public void InvalidSignUp4() throws IOException {
		Signup = new SignupPage(driver);
		Signup.ClickCreateNAcc();
		String Name = ExcelUtility.getCellData(34, 0);
		Signup.InpName(Name);
		String Email = ExcelUtility.getCellData(35, 0);
		Signup.InpEmail(Email);
		String Phone = ExcelUtility.getCellData(36, 0);
		Signup.InpPhone(Phone);
		String Pass = ExcelUtility.getCellData(37, 0);
		Signup.InpPass(Pass);
		String CPass = ExcelUtility.getCellData(38, 0);
		Signup.InpCPass(CPass);
		Signup.ClickSubmit();

	}

}
