package cn.baiing.tutorial.junit;

import junit.framework.Assert;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.junit.Before;
import org.junit.Test;

public class JunitVersionTest {
    final static int w_unit = 10000;
    final static String cellValue = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    final static String[] data = new String[]{cellValue, cellValue};

    SXSSFWorkbook workbook;
    Sheet sheet;

    int breakOutPoint = 0;

    @Before
    public void setUp() {
        workbook = new SXSSFWorkbook();
        sheet = workbook.createSheet("Sample sheet");
    }


    @Test
    public void test1W() {
        runTest(1 * w_unit, data);
    }


    @Test
    public void test100W() {
        runTest(100 * w_unit, data);
    }


    @Test
    //java.lang.IllegalArgumentException: Invalid row number (1048576) outside allowable range (0..1048575)
    public void test1000W() {
        runTest(1000 * w_unit, data);
    }


    @Test
    //java.lang.IllegalArgumentException: Invalid row number (1048576) outside allowable range (0..1048575)
    public void test5000W() {
        runTest(5000 * w_unit, data);
    }


    private void runTest(int maxValue, String[] data) {
        try {
            doInsertData(maxValue, data);
        } catch (Exception e) {
//            System.out.println("maxLine: " + maxValue);
            Assert.fail("breakOutPoint: " + breakOutPoint + ", and exception msg: " + e.getMessage());
        }
    }

    private void doInsertData(int maxLines, String[] data) {
        for (int i =0; i < maxLines; i++) {
            try {
                Row testRow = sheet.createRow(sheet.getLastRowNum() + 1);

                for (int j = 0; j < data.length; j++) {
                    Cell testCell = testRow.createCell(j);
                    testCell.setCellValue(data[j]);
                }
            } finally {
                breakOutPoint = i;
            }

        }
    }

}
