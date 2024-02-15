package com.facebook.abc.gtl.readexcel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcel {

    public static void main(String[] args) {


        try {
            FileInputStream fis = new FileInputStream("src/main/resources/TestData.xlsx");

            // Create the workbook:
            XSSFWorkbook workbook = new XSSFWorkbook(fis);

            XSSFSheet sheet = workbook.getSheet("Sheet4");
//
//            XSSFRow row2 = sheet.getRow(1);
//
//            XSSFCell cell1 = row2.getCell(0);
//            String cell1Value = cell1.getStringCellValue();
//
//            System.out.println(cell1Value);

//            Iterator<Row> rows = sheet.iterator();
//
//            while (rows.hasNext()) {
//                Row row = rows.next();
//
//                Iterator<Cell> cells = row.iterator();
//                while(cells.hasNext()) {
//                    Cell cell = cells.next();
//                    System.out.print(cell.getStringCellValue() + "\t");
//                }
//                System.out.println();
//            }

            for(Row row : sheet) {
                for(Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }




        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
