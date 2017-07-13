package com.tragent.lte.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
	private S1DataRepository s1DataRepository;

	List<S1Data> data = new ArrayList<S1Data>();

	private Workbook workbook;

	// We can be more efficient than this.
	public void saveToDatabase(MultipartFile file) {

		Sheet sheet;

		if (!file.isEmpty()) {
			try {

				workbook = new HSSFWorkbook(file.getInputStream());

				sheet = workbook.getSheetAt(0);

				System.out.println(sheet.getSheetName());

				for (Row row : sheet) {

					if (row.getRowNum() > 7) {

						S1Data s1Data = new S1Data();

						for (Cell cell : row) {

							cell.setCellType(Cell.CELL_TYPE_STRING);

							if (cell.getColumnIndex() == 0) {

								s1Data.setStartTime(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 1) {

								s1Data.setPeriod(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 2) {
								// System.out.println(cell.getRichStringCellValue().toString()
								// + " ");

								s1Data.setNeName(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 3) {

								s1Data.setWholeSystem(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 4) {

								s1Data.setAverageBearerNumber(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 5) {

								s1Data.setMaximumBearerNumber(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 6) {

								s1Data.setAverageDedicatedBearerNumber(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 7) {

								s1Data.setAveragePdnConnectionNumber(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 8) {

								s1Data.setMaximumPdnConnectionNumber(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 9) {

								s1Data.setAverageAttachedUsers(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 10) {

								s1Data.setMaximumAttachedUsers(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 11) {

								s1Data.setIpPacketsReceived(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 12) {

								s1Data.setDownlinkMessageKbytesSentInterface(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 13) {

								s1Data.setSaeBearerSetupRequestTimes(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 14) {

								s1Data.setSaeBearerSetupSuccessTimes(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 15) {

								s1Data.setUplinkMessageKbytesReceivedInterface(
										cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 16) {

								s1Data.setRealTimePdnConnectionNumber(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 17) {

								s1Data.setRealTimeAttachedUsersAtEcmconnectedStatus(
										cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 18) {

								s1Data.setRealTimeAttachedUsersAtEcmidleStatus(
										cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 19) {

								s1Data.setRealTimeAttachedUsers(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 20) {

								s1Data.setMaximumAttachedUsersAtEcmidleStatus(cell.getRichStringCellValue().toString());
								;
							}

							if (cell.getColumnIndex() == 21) {

								s1Data.setMaximumAttachedUsersAtEcmconnectedStatus(
										cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 22) {

								s1Data.setServiceRequestSuccessTimes(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 23) {

								s1Data.setServiceRequestTimes(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 24) {

								s1Data.setPagingRequestTimes(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 25) {

								s1Data.setPagingSuccessTimes(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 26) {

								s1Data.setPacketPagingRequestTimesPerSubscriber(
										cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 27) {

								s1Data.setPacketPagingSuccessRate(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 28) {

								s1Data.setAuthenticationRequestTimesPerSubscriber(
										cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 29) {

								s1Data.setSecurityModeCommandRequestTimes(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 30) {

								s1Data.setSecurityModeCommandSuccessRate(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 31) {

								s1Data.setSecurityModeCommandSuccessTimes(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 32) {

								s1Data.setAuthenticationRequestTimes(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 33) {

								s1Data.setAuthenticationSuccessTimes(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 34) {

								s1Data.setIntrammeHandoverRequestTimesPerSubscriber(
										cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 35) {

								s1Data.setIntrammeHandoverSuccessRate(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 36) {

								s1Data.setIntraBasedHandoverSuccessTimes(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 37) {

								s1Data.setIntraBasedHandoverRequestTimes(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 38) {

								s1Data.setIntrammeTauSuccessRate(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 39) {

								s1Data.setPeriodicTauRequestTimesPerSubscriber(
										cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 40) {

								s1Data.setIntrammeCombinedTauSuccessRate(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 41) {

								s1Data.setPeriodTauSuccessTimes(cell.getRichStringCellValue().toString());
							}

							if (cell.getColumnIndex() == 42) {

								s1Data.setPeriodTauRequestTimes(cell.getRichStringCellValue().toString());
							}

						}

						data.add(s1Data);

					}	
					
				}

				// Need to be more efficient
				for (int i = 0; i <= 142; i++) {

					s1DataRepository.save(data.get(i));

				}

				System.out.println("Imported Sheet " + sheet.getSheetName());

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
