package com.tragent.lte.service;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class LTEPerformanceService {

	public LTEPerformanceService() {

	}

	public void saveToDatabase(MultipartFile file) {

		Sheet sheet;

		if (!file.isEmpty()) {
			try {
				
				Workbook workbook = new HSSFWorkbook(file.getInputStream());

				sheet = workbook.getSheetAt(0);

				System.out.println(sheet.getSheetName());

				for (Row row : sheet) {
					for (Cell cell : row) {

						cell.setCellType(Cell.CELL_TYPE_STRING);

						if (cell.getColumnIndex() == 0 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");
						}

						if (cell.getColumnIndex() == 1 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");
						}

					}

				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
