package excelUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtil {

    @SuppressWarnings("deprecation")
    public static Map<String, String> testdata(String testcase, String filepath) {
        Map<String, String> datamap = new HashMap<>();

        try {
            FileInputStream fis = new FileInputStream(new File(filepath));
            Workbook wb = new XSSFWorkbook(fis);
            Sheet sheet = wb.getSheetAt(0);
            Row headerRow = sheet.getRow(0);

            for (int i = 1; i <= sheet.getLastRowNum(); i++) { // <= to include last row
                Row row = sheet.getRow(i);
                if (row == null) continue;

                Cell testCaseCell = row.getCell(0);
                if (testCaseCell == null) continue;

                if (testCaseCell.getStringCellValue().trim().equalsIgnoreCase(testcase.trim())) {
                    for (int j = 0; j < row.getLastCellNum(); j++) {
                        Cell headerCell = headerRow.getCell(j);
                        Cell dataCell = row.getCell(j);

                        String header = headerCell != null ? headerCell.getStringCellValue().trim() : "Column" + j;
                        String value = "";

                        if (dataCell != null) {
                            value = dataCell.getStringCellValue().trim();
                        }

                        datamap.put(header, value);
                    }
                    break; // Found matching row, break out
                }
            }

            wb.close();
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return datamap;
    }
}