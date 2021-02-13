package com.devin.starter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
  public static void main(String[] args) {
    System.out.println("running...");
  }

  public Workbook read() throws IOException {
    var fileLocation = "";
    FileInputStream file = new FileInputStream(new File(fileLocation));
    return new XSSFWorkbook(file);
  }

}
