package org.ict.utilities;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
public class ExcelUtility {
	public static XSSFWorkbook excelWbook;
    public static XSSFSheet excelSheet;
   public static String getCellData(int rowNum,int colNum) throws IOException
   {
    FileInputStream inp=new FileInputStream("D:\\Eclipse workspace\\ICTAKCurriculumTracker\\src\\main\\resources\\TestData.xlsx");
    excelWbook= new XSSFWorkbook(inp);
    excelSheet=excelWbook.getSheetAt(0);
    return excelSheet.getRow(rowNum).getCell(colNum).getStringCellValue();
}
}