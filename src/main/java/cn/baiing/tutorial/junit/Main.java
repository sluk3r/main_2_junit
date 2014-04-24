package cn.baiing.tutorial.junit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

/**
 * Created by wangxc on 2014/4/24.
 */

public class Main {
    final static  int w_unit = 10000;

    final static String cellValue = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    final static String[] data = new String[]{cellValue,cellValue};


    public static void main(String[] args) {
        SXSSFWorkbook workbook = workbook = new SXSSFWorkbook();
        Sheet sheet = workbook.createSheet("Sample sheet");

//        int test_lines = 10 * w_unit;
//        int test_lines = 20 * w_unit;
//        int test_lines = 50 * w_unit;
//        int test_lines = 100 * w_unit;
        int test_lines = 200 * w_unit;

        for (int i=0;i< test_lines; i++ ) {
            Row testRow = sheet.createRow(sheet.getLastRowNum() + 1);

            for (int j = 0; j < data.length; j++) {
                Cell testCell = testRow.createCell(j);
                testCell.setCellValue(data[j]);
            }
        }

        System.out.println("\n\n\n++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("max line test ok, and number is: " + test_lines );
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++\n\n\n");
    }
}
