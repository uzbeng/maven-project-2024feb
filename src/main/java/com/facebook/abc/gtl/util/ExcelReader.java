package com.facebook.abc.gtl.util;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {

    private String excelPath;
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;


    public ExcelReader(String excelPath, String sheetName) {
        this.excelPath = excelPath;
        try {
            FileInputStream fis;
            fis = new FileInputStream(excelPath);
            workbook = new XSSFWorkbook(fis);
            sheet = workbook.getSheet(sheetName);
            fis.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    // Methods/logic
    public Object[][] getTableData(String tableNameProvided) {
        int rowCount = sheet.getLastRowNum() + 1;
        int tableDataStartsAtRow = 0;
        int tableDataEndsAtRow = 0;
        int tableColumnsSize = 0;
        int totalNumOfTableRows = 0;

        for (int i = 0; i < rowCount; i++) {
            XSSFRow row = sheet.getRow(i);
            if (row != null && !row.getCell(0).getStringCellValue().isEmpty()) {
                String tableName = row.getCell(0).getStringCellValue();

                if (tableName != null && !tableName.isEmpty() && tableName.equalsIgnoreCase(tableNameProvided)) {
                    tableDataStartsAtRow = i + 2;
                    XSSFRow dataRow1 = sheet.getRow(tableDataStartsAtRow);
                    tableColumnsSize = dataRow1.getLastCellNum();
                }
            }
        }

        for (int i = tableDataStartsAtRow; i <= rowCount + 1; i++) {
            XSSFRow row = sheet.getRow(i);
            if (row == null || row.getCell(0).getStringCellValue().isEmpty()) {
                tableDataEndsAtRow = i - 1;
                break;

            }
        }

        totalNumOfTableRows = tableDataEndsAtRow - tableDataStartsAtRow + 1;
//		System.out.println("counts: " + rowCount +" " +tableDataStartsAtRow+" " + tableDataEndsAtRow+" " + tableColumnsSize+" " + totalNumOfTableRows);

        Object[][] tableData = new Object[totalNumOfTableRows][tableColumnsSize];

        // Get the table data
        // Loop each row
        for (int i = tableDataStartsAtRow, k=0; i <= tableDataEndsAtRow; i++, k++) {
            XSSFRow row = sheet.getRow(i);

            // Loop each column
            for (int j = 0; j < tableColumnsSize; j++) {
                tableData[k][j] = row.getCell(j).getStringCellValue();
            }
        }

        return tableData;
    }

    public static void main(String[] args) {
        ExcelReader excelReader = new ExcelReader("src/main/resources/TestData.xlsx", "Sheet4");
        Object[][] data = excelReader.getTableData("Users");

        for(int i = 0; i<data.length; i++) {
            for(int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }



    }

}
