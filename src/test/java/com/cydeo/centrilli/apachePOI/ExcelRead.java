package com.cydeo.centrilli.apachePOI;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {

    @Test
    public void read_from_excel_file() throws IOException {

        String path = "SampleData.xlsx";
        // to read from excel we need to load it to FileInputStream
        FileInputStream fileInputStream = new FileInputStream(path);


        //workbook>sheet>row>cell
        // <1> Create a workbook
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
       // <2> We need to get specific sheet from currently opened workbook
        XSSFSheet sheet = workbook.getSheet ( "Employees") ;

       // <3> Goto Row 1 and Cell 1: (Saadet)
       // Indexes start from --> 0
        System.out.println(sheet.getRow(0).getCell(0));  // ERROR StatusLogger Log4j2(Consolda bu cikiyor teni version oldugu icin onemli degilmis)
        System.out.println(sheet.getRow(3).getCell(0)+" "+sheet.getRow(3).getCell(1));  // ERROR StatusLogger Log4j2(Consolda bu cikiyor teni version oldugu icin onemli degilmis)

       // emailElem. sendKeys (worksheet. getRow(1) .getCell(1)) ;

             sheet.getPhysicalNumberOfRows(); // Method 1 den baslar, bos row saymaz.
             sheet.getLastRowNum(); // row=0 baslar, bos olan raw da hesaplar

        System.out.println(sheet.getPhysicalNumberOfRows());
        System.out.println(sheet.getLastRowNum());

         int usedRow = sheet.getPhysicalNumberOfRows();  // 1,2,3,4,
         int lastUsedRow = sheet.getLastRowNum(); // 0,1,2,3

        for (int rowNumber = 0; rowNumber <usedRow ; rowNumber++) {
            if (sheet.getRow(rowNumber).getCell(0).toString().equals("Neriman")) {
                System.out.println(sheet.getRow(rowNumber).getCell(0));
            }
        }

            // TODO Find Hatun JobId
            for (int rowNumber = 0; rowNumber <usedRow ; rowNumber++) {

                if (sheet.getRow(rowNumber).getCell(0).toString().equals("Neriman")) {
                    System.out.println(sheet.getRow(rowNumber).getCell(2));
                }



        }







    }

}
