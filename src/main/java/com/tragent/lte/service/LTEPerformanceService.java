package com.tragent.lte.service;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.tragent.lte.domain.S1Data;
import com.tragent.lte.repository.S1DataRepository;

@Service
public class LTEPerformanceService {

	@Autowired
	private S1Data s1Data;

	@Autowired
	private S1DataRepository s1DataRepository;

	//perhaps we should create a bean for this.
	private Workbook workbook;

	public void saveToDatabase(MultipartFile file) {

		Sheet sheet;

		if (!file.isEmpty()) {
			try {

				workbook = new HSSFWorkbook(file.getInputStream());

				sheet = workbook.getSheetAt(0);

				System.out.println(sheet.getSheetName());

				for (Row row : sheet) {

					for (Cell cell : row) {

						cell.setCellType(Cell.CELL_TYPE_STRING);

						if (cell.getColumnIndex() == 0 && row.getRowNum() >= 8) {

							System.out.println(cell.getRichStringCellValue().toString() + " ");

							s1Data.setStartTime(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 1 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");

							s1Data.setPeriod(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 2 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");

							s1Data.setNeName(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 3 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");

							s1Data.setWholeSystem(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 4 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");

							s1Data.setS1ModeAverageBearerNumber(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 5 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");

							s1Data.setS1ModeMaximumBearerNumber(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 6 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");

							s1Data.setAverageDedicatedBearerNumber(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 7 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");

							s1Data.setAveragePdnConnectionNumber(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 8 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");

							s1Data.setMaximumPdnConnectionNumber(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 9 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");
							s1Data.setAverageAttachedUsers(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 10 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");

							s1Data.setMaximumAttachedUsers(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 11 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");

							s1Data.setIpPacketsReceived(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 12 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");

							s1Data.setDownlinkMessageKbytesSentInS1Interface(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 13 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");

							s1Data.setSaeBearerSetupRequestTimes(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 14 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");

							s1Data.setSaeBearerSetupSuccessTimes(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 15 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");

							s1Data.setUplinkMessageKbytesReceivedInS1Interface(
									cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 16 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");

							s1Data.setRealTimePdnConnectionNumber(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 17 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");

							s1Data.setRealTimeAttachedUsersAtEcmconnectedStatus(
									cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 18 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");

							s1Data.setRealTimeAttachedUsersAtEcmidleStatus(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 19 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");
							s1Data.setRealTimeAttachedUsers(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 20 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");
							s1Data.setMaximumAttachedUsersAtEcmidleStatus(cell.getRichStringCellValue().toString());
							;
						}

						if (cell.getColumnIndex() == 21 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");
							s1Data.setMaximumAttachedUsersAtEcmconnectedStatus(
									cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 22 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");
							s1Data.setServiceRequestSuccessTimes(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 23 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");
							s1Data.setServiceRequestTimes(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 24 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");
							s1Data.setPagingRequestTimes(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 25 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");
							s1Data.setPagingSuccessTimes(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 26 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");
							s1Data.setS1ModePacketPagingRequestTimesPerSubscriber(
									cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 27 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");
							s1Data.setS1ModePacketPagingSuccessRate(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 28 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");
							s1Data.setS1ModeAuthenticationRequestTimesPerSubscriber(
									cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 29 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");
							s1Data.setSecurityModeCommandRequestTimes(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 30 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");
							s1Data.setSecurityModeCommandSuccessRate(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 31 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");
							s1Data.setSecurityModeCommandSuccessTimes(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 32 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");
							s1Data.setAuthenticationRequestTimes(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 33 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");
							s1Data.setAuthenticationSuccessTimes(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 34 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");
							s1Data.setS1ModeIntrammeHandoverRequestTimesPerSubscriber(
									cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 35 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");
							s1Data.setS1ModeIntrammeS1HandoverSuccessRate(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 36 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");
							s1Data.setIntraS1basedHandoverSuccessTimes(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 37 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");
							s1Data.setIntraS1basedHandoverRequestTimes(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 38 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");
							s1Data.setS1ModeIntrammeTauSuccessRate(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 39 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");
							s1Data.setS1ModePeriodicTauRequestTimesPerSubscriber(
									cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 40 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");
							s1Data.setS1ModeIntrammeCombinedTauSuccessRate(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 41 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");
							s1Data.setPeriodTauSuccessTimes(cell.getRichStringCellValue().toString());
						}

						if (cell.getColumnIndex() == 42 && row.getRowNum() >= 8) {
							System.out.println(cell.getRichStringCellValue().toString() + " ");
							s1Data.setPeriodTauRequestTimes(cell.getRichStringCellValue().toString());
						}

					}

					s1DataRepository.save(s1Data);

				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
