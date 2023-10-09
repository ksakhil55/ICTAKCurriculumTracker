package org.ict.scripts;

import java.io.IOException;

import org.ict.base.BaseClass;
import org.ict.pages.AdminCreateFormPage;
import org.ict.pages.LoginPage;
import org.ict.utilities.ExcelUtility;

public class CreateFormTC extends BaseClass{

	LoginPage LogIn;
	AdminCreateFormPage CreateForm;
	
	public void FormCreation() throws IOException, InterruptedException {
		LogIn = new LoginPage(driver);
		LogIn.ClickEmail();
		String Email = ExcelUtility.getCellData(0, 0);
		LogIn.ClickPassword();
		Thread.sleep(2000);
		LogIn.EnterEmail(Email);
		Thread.sleep(2000);
		String Pass = ExcelUtility.getCellData(0, 1);
		LogIn.EnterPassword(Pass);
		LogIn.ClickSubmit();
		
		CreateForm.ClickAdmDash();
		CreateForm.ClickCreateForm();
		String RqName = ExcelUtility.getCellData(40, 0);
		CreateForm.InpReqName(RqName);
		CreateForm.SelectST();
		String Ins = ExcelUtility.getCellData(41, 0);
		CreateForm.InpInstitution(Ins);
		CreateForm.SelectRetail();
		String Hrs = ExcelUtility.getCellData(42, 0);
		CreateForm.InpTrainHrs(Hrs);
		CreateForm.ClickSubmit();		
	}
	
}
