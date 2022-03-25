package com.atguigu.com.atguigu.test;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.IOException;

/**
 * @author shkstart
 * @create 2022-03-15 14:36
 */
public class TestPoi {
    @Test
    public void readExcel() throws IOException {
        //1.创建工作博
        Workbook workbook = new XSSFWorkbook("F:\\atguigu.xlsx");

        //2.工资表
        Sheet sheet = workbook.getSheetAt(0);

        //3.获取行
        for (Row cells : sheet) {
            for (Cell cell : cells) {
                System.out.print("cell = " + cell);

            }
            System.out.println();
        }

        workbook.close();
    }
}
