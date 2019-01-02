package com.example.demo.util;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.*;

/**
 * Created by yaochao on 2018/12/27 上午10:41
 */

public class ExcelExporter {

    public Object export() {
        // 创建Excel文件对象
        HSSFWorkbook wb = new HSSFWorkbook();
        // 创建sheet
        Sheet sheet = wb.createSheet();
        // 设置表头的字体
        Font headerFont = wb.createFont();
        headerFont.setBold(true);
        headerFont.setFontName("微软雅黑");
        headerFont.setFontHeightInPoints((short) 18);
        headerFont.setColor(HSSFColor.HSSFColorPredefined.BLACK.getIndex());
        // 设置正文字体
        Font contextFont = wb.createFont();
        contextFont.setFontName("微软雅黑");
        contextFont.setFontHeightInPoints((short) 12);
        contextFont.setColor(HSSFColor.BLACK.index);
        // 设置表头样式
        CellStyle headerStyle = wb.createCellStyle();
        headerStyle.setFont(headerFont);
        headerStyle.setAlignment(HorizontalAlignment.CENTER); // 水平居中
        headerStyle.setVerticalAlignment(VerticalAlignment.CENTER); // 上下居中
        headerStyle.setLocked(true);
        headerStyle.setWrapText(true); //自动换行
        headerStyle.setBorderTop(BorderStyle.THICK);
        headerStyle.setBorderBottom(BorderStyle.THICK);
        headerStyle.setBorderLeft(BorderStyle.THICK);
        headerStyle.setBorderRight(BorderStyle.THICK);
        // 设置正文样式
        CellStyle commonStyle = wb.createCellStyle();
        commonStyle.setFont(contextFont);
        commonStyle.setAlignment(HorizontalAlignment.CENTER);// 左右居中
        commonStyle.setVerticalAlignment(VerticalAlignment.CENTER);// 上下居中
        commonStyle.setLocked(true);
        commonStyle.setWrapText(false);// 自动换行
        commonStyle.setBorderBottom(BorderStyle.THIN); //下边框
        commonStyle.setBorderLeft(BorderStyle.THIN);//左边框
        commonStyle.setBorderTop(BorderStyle.THIN);//上边框
        commonStyle.setBorderRight(BorderStyle.THIN);//右边框
        // 表头 - 第零行
        Row r0 = sheet.createRow(0);
        r0.setHeight((short) 800);
        Cell c00 = r0.createCell(0);
        c00.setCellStyle(headerStyle);
        c00.setCellValue("我是title");

        

        return null;
    }
}
