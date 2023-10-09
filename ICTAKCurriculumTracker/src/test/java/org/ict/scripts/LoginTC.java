package org.ict.scripts;

import java.io.IOException;

import org.ict.base.BaseClass;
import org.ict.constants.ConstantValues;
import org.ict.pages.LoginPage;
import org.ict.utilities.ExcelUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTC extends BaseClass {

	LoginPage LogIn;

	@Test(priority = 1)
	public void ValidLogin() throws IOException, InterruptedException {
		LogIn = new LoginPage(driver);
		//LogIn.ClickLogin();
		LogIn.ClickEmail();
		String Email = ExcelUtility.getCellData(0, 0);
		LogIn.ClickPassword();
		Thread.sleep(2000);
		LogIn.EnterEmail(Email);
		Thread.sleep(2000);
		String Pass = ExcelUtility.getCellData(0, 1);
		LogIn.EnterPassword(Pass);
		LogIn.ClickSubmit();
		Thread.sleep(2000);
		String actualResult = driver.getCurrentUrl();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, ConstantValues.LOGINURL);
		System.out.println("Login Successful");
	}

	@Test(priority = 2)
	public void InvalidEmailLogin() throws IOException, InterruptedException {
		LogIn = new LoginPage(driver);
		//LogIn.ClickLogin();
		LogIn.ClickEmail();
		String Email = ExcelUtility.getCellData(1, 0);
		LogIn.ClickPassword();
		Thread.sleep(2000);
		LogIn.EnterEmail(Email);
		Thread.sleep(2000);
		String Pass = ExcelUtility.getCellData(1, 1);
		LogIn.EnterPassword(Pass);
		LogIn.ClickSubmit();
		Thread.sleep(2000);
		String actualResult = driver.getCurrentUrl();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, ConstantValues.LOGINURL);
		System.out.println("Login Failed");
	}

	@Test(priority = 3)
	public void InvalidPWLogin() throws IOException, InterruptedException {
		LogIn = new LoginPage(driver);
		//LogIn.ClickLogin();
		LogIn.ClickEmail();
		String Email = ExcelUtility.getCellData(2, 0);
		LogIn.ClickPassword();
		Thread.sleep(2000);
		LogIn.EnterEmail(Email);
		Thread.sleep(2000);
		String Pass = ExcelUtility.getCellData(2, 1);
		LogIn.EnterPassword(Pass);
		LogIn.ClickSubmit();
		Thread.sleep(2000);
		String actualResult = driver.getCurrentUrl();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, ConstantValues.LOGINURL);
		System.out.println("Login Failed");
	}

	@Test(priority = 4)
	public void InvalidEmailPWLogin() throws IOException, InterruptedException {
		LogIn = new LoginPage(driver);
		//LogIn.ClickLogin();
		LogIn.ClickEmail();
		String Email = ExcelUtility.getCellData(3, 0);
		LogIn.ClickPassword();
		Thread.sleep(2000);
		LogIn.EnterEmail(Email);
		Thread.sleep(2000);
		String Pass = ExcelUtility.getCellData(3, 1);
		LogIn.EnterPassword(Pass);
		LogIn.ClickSubmit();
		Thread.sleep(2000);
		String actualResult = driver.getCurrentUrl();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, ConstantValues.LOGINURL);
		System.out.println("Login Failed");
	}

	@Test(priority = 5)
	public void BlankEmailPWLogin() throws IOException, InterruptedException {
		LogIn = new LoginPage(driver);
		//LogIn.ClickLogin();
		LogIn.ClickEmail();
		String Email = ExcelUtility.getCellData(4, 0);
		LogIn.ClickPassword();
		Thread.sleep(2000);
		LogIn.EnterEmail(Email);
		Thread.sleep(2000);
		String Pass = ExcelUtility.getCellData(4, 1);
		LogIn.EnterPassword(Pass);
		LogIn.ClickSubmit();
		Thread.sleep(2000);
		String actualResult = driver.getCurrentUrl();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, ConstantValues.LOGINURL);
		System.out.println("Login Failed");
	}

}