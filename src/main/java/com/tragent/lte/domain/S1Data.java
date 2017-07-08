package com.tragent.lte.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Configuration;

//@Configuration
@Entity
@Table(name="s1_data")
public class S1Data {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String startTime;

	@Column(nullable = false)
	private String period;

	@Column(nullable = false)
	private String neName;

	@Column(nullable = false)
	private String wholeSystem;

	@Column(nullable = false)
	private String averageBearerNumber;

	@Column(nullable = false)
	private String maximumBearerNumber;

	@Column(nullable = false)
	private String averageDedicatedBearerNumber;

	@Column(nullable = false)
	private String averagePdnConnectionNumber;

	@Column(nullable = false)
	private String maximumPdnConnectionNumber;

	@Column(nullable = false)
	private String averageAttachedUsers;

	@Column(nullable = false)
	private String maximumAttachedUsers;

	@Column(nullable = false)
	private String ipPacketsReceived;

	@Column(nullable = false)
	private String downlinkMessageKbytesSentInterface;

	@Column(nullable = false)
	private String saeBearerSetupRequestTimes;

	@Column(nullable = false)
	private String saeBearerSetupSuccessTimes;

	@Column(nullable = false)
	private String uplinkMessageKbytesReceivedInterface;

	@Column(nullable = false)
	private String realTimePdnConnectionNumber;

	@Column(nullable = false)
	private String realTimeAttachedUsersAtEcmconnectedStatus;

	@Column(nullable = false)
	private String realTimeAttachedUsersAtEcmidleStatus;

	@Column(nullable = false)
	private String realTimeAttachedUsers;

	@Column(nullable = false)
	private String maximumAttachedUsersAtEcmidleStatus;

	@Column(nullable = false)
	private String maximumAttachedUsersAtEcmconnectedStatus;

	@Column(nullable = false)
	private String serviceRequestSuccessTimes;

	@Column(nullable = false)
	private String serviceRequestTimes;

	@Column(nullable = false)
	private String pagingRequestTimes;

	@Column(nullable = false)
	private String pagingSuccessTimes;

	@Column(nullable = false)
	private String packetPagingRequestTimesPerSubscriber;

	@Column(nullable = false)
	private String packetPagingSuccessRate;

	@Column(nullable = false)
	private String authenticationRequestTimesPerSubscriber;

	@Column(nullable = false)
	private String securityModeCommandRequestTimes;

	@Column(nullable = false)
	private String securityModeCommandSuccessRate;

	@Column(nullable = false)
	private String securityModeCommandSuccessTimes;

	@Column(nullable = false)
	private String authenticationRequestTimes;

	@Column(nullable = false)
	private String authenticationSuccessTimes;

	@Column(nullable = false)
	private String intrammeHandoverRequestTimesPerSubscriber;

	@Column(nullable = false)
	private String intrammeHandoverSuccessRate;

	@Column(nullable = false)
	private String intraBasedHandoverSuccessTimes;

	@Column(nullable = false)
	private String intraBasedHandoverRequestTimes;

	@Column(nullable = false)
	private String intrammeTauSuccessRate;

	@Column(nullable = false)
	private String periodicTauRequestTimesPerSubscriber;

	@Column(nullable = false)
	private String intrammeCombinedTauSuccessRate;

	@Column(nullable = false)
	private String periodTauSuccessTimes;

	@Column(nullable = false)
	private String periodTauRequestTimes;
	
	public S1Data(){
		super();
	}

	public S1Data(Long id, String startTime, String period, String neName, String wholeSystem,
			String s1ModeAverageBearerNumber, String s1ModeMaximumBearerNumber, String averageDedicatedBearerNumber,
			String averagePdnConnectionNumber, String maximumPdnConnectionNumber, String averageAttachedUsers,
			String maximumAttachedUsers, String ipPacketsReceived, String downlinkMessageKbytesSentInS1Interface,
			String saeBearerSetupRequestTimes, String saeBearerSetupSuccessTimes,
			String uplinkMessageKbytesReceivedInS1Interface, String realTimePdnConnectionNumber,
			String realTimeAttachedUsersAtEcmconnectedStatus, String realTimeAttachedUsersAtEcmidleStatus,
			String realTimeAttachedUsers, String maximumAttachedUsersAtEcmidleStatus,
			String maximumAttachedUsersAtEcmconnectedStatus, String serviceRequestSuccessTimes,
			String serviceRequestTimes, String pagingRequestTimes, String pagingSuccessTimes,
			String s1ModePacketPagingRequestTimesPerSubscriber, String s1ModePacketPagingSuccessRate,
			String s1ModeAuthenticationRequestTimesPerSubscriber, String securityModeCommandRequestTimes,
			String securityModeCommandSuccessRate, String securityModeCommandSuccessTimes,
			String authenticationRequestTimes, String authenticationSuccessTimes,
			String s1ModeIntrammeHandoverRequestTimesPerSubscriber, String s1ModeIntrammeS1HandoverSuccessRate,
			String intraS1basedHandoverSuccessTimes, String intraS1basedHandoverRequestTimes,
			String s1ModeIntrammeTauSuccessRate, String s1ModePeriodicTauRequestTimesPerSubscriber,
			String s1ModeIntrammeCombinedTauSuccessRate, String periodTauSuccessTimes, String periodTauRequestTimes) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.period = period;
		this.neName = neName;
		this.wholeSystem = wholeSystem;
		this.averageBearerNumber = s1ModeAverageBearerNumber;
		this.maximumBearerNumber = s1ModeMaximumBearerNumber;
		this.averageDedicatedBearerNumber = averageDedicatedBearerNumber;
		this.averagePdnConnectionNumber = averagePdnConnectionNumber;
		this.maximumPdnConnectionNumber = maximumPdnConnectionNumber;
		this.averageAttachedUsers = averageAttachedUsers;
		this.maximumAttachedUsers = maximumAttachedUsers;
		this.ipPacketsReceived = ipPacketsReceived;
		this.downlinkMessageKbytesSentInterface = downlinkMessageKbytesSentInS1Interface;
		this.saeBearerSetupRequestTimes = saeBearerSetupRequestTimes;
		this.saeBearerSetupSuccessTimes = saeBearerSetupSuccessTimes;
		this.uplinkMessageKbytesReceivedInterface = uplinkMessageKbytesReceivedInS1Interface;
		this.realTimePdnConnectionNumber = realTimePdnConnectionNumber;
		this.realTimeAttachedUsersAtEcmconnectedStatus = realTimeAttachedUsersAtEcmconnectedStatus;
		this.realTimeAttachedUsersAtEcmidleStatus = realTimeAttachedUsersAtEcmidleStatus;
		this.realTimeAttachedUsers = realTimeAttachedUsers;
		this.maximumAttachedUsersAtEcmidleStatus = maximumAttachedUsersAtEcmidleStatus;
		this.maximumAttachedUsersAtEcmconnectedStatus = maximumAttachedUsersAtEcmconnectedStatus;
		this.serviceRequestSuccessTimes = serviceRequestSuccessTimes;
		this.serviceRequestTimes = serviceRequestTimes;
		this.pagingRequestTimes = pagingRequestTimes;
		this.pagingSuccessTimes = pagingSuccessTimes;
		this.packetPagingRequestTimesPerSubscriber = s1ModePacketPagingRequestTimesPerSubscriber;
		this.packetPagingSuccessRate = s1ModePacketPagingSuccessRate;
		this.authenticationRequestTimesPerSubscriber = s1ModeAuthenticationRequestTimesPerSubscriber;
		this.securityModeCommandRequestTimes = securityModeCommandRequestTimes;
		this.securityModeCommandSuccessRate = securityModeCommandSuccessRate;
		this.securityModeCommandSuccessTimes = securityModeCommandSuccessTimes;
		this.authenticationRequestTimes = authenticationRequestTimes;
		this.authenticationSuccessTimes = authenticationSuccessTimes;
		this.intrammeHandoverRequestTimesPerSubscriber = s1ModeIntrammeHandoverRequestTimesPerSubscriber;
		this.intrammeHandoverSuccessRate = s1ModeIntrammeS1HandoverSuccessRate;
		this.intraBasedHandoverSuccessTimes = intraS1basedHandoverSuccessTimes;
		this.intraBasedHandoverRequestTimes = intraS1basedHandoverRequestTimes;
		this.intrammeTauSuccessRate = s1ModeIntrammeTauSuccessRate;
		this.periodicTauRequestTimesPerSubscriber = s1ModePeriodicTauRequestTimesPerSubscriber;
		this.intrammeCombinedTauSuccessRate = s1ModeIntrammeCombinedTauSuccessRate;
		this.periodTauSuccessTimes = periodTauSuccessTimes;
		this.periodTauRequestTimes = periodTauRequestTimes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getNeName() {
		return neName;
	}

	public void setNeName(String neName) {
		this.neName = neName;
	}

	public String getWholeSystem() {
		return wholeSystem;
	}

	public void setWholeSystem(String wholeSystem) {
		this.wholeSystem = wholeSystem;
	}

	public String getAverageBearerNumber() {
		return averageBearerNumber;
	}

	public void setAverageBearerNumber(String s1ModeAverageBearerNumber) {
		this.averageBearerNumber = s1ModeAverageBearerNumber;
	}

	public String getMaximumBearerNumber() {
		return maximumBearerNumber;
	}

	public void setMaximumBearerNumber(String s1ModeMaximumBearerNumber) {
		this.maximumBearerNumber = s1ModeMaximumBearerNumber;
	}

	public String getAverageDedicatedBearerNumber() {
		return averageDedicatedBearerNumber;
	}

	public void setAverageDedicatedBearerNumber(String averageDedicatedBearerNumber) {
		this.averageDedicatedBearerNumber = averageDedicatedBearerNumber;
	}

	public String getAveragePdnConnectionNumber() {
		return averagePdnConnectionNumber;
	}

	public void setAveragePdnConnectionNumber(String averagePdnConnectionNumber) {
		this.averagePdnConnectionNumber = averagePdnConnectionNumber;
	}

	public String getMaximumPdnConnectionNumber() {
		return maximumPdnConnectionNumber;
	}

	public void setMaximumPdnConnectionNumber(String maximumPdnConnectionNumber) {
		this.maximumPdnConnectionNumber = maximumPdnConnectionNumber;
	}

	public String getAverageAttachedUsers() {
		return averageAttachedUsers;
	}

	public void setAverageAttachedUsers(String averageAttachedUsers) {
		this.averageAttachedUsers = averageAttachedUsers;
	}

	public String getMaximumAttachedUsers() {
		return maximumAttachedUsers;
	}

	public void setMaximumAttachedUsers(String maximumAttachedUsers) {
		this.maximumAttachedUsers = maximumAttachedUsers;
	}

	public String getIpPacketsReceived() {
		return ipPacketsReceived;
	}

	public void setIpPacketsReceived(String ipPacketsReceived) {
		this.ipPacketsReceived = ipPacketsReceived;
	}

	public String getDownlinkMessageKbytesSentInterface() {
		return downlinkMessageKbytesSentInterface;
	}

	public void setDownlinkMessageKbytesSentInterface(String downlinkMessageKbytesSentInS1Interface) {
		this.downlinkMessageKbytesSentInterface = downlinkMessageKbytesSentInS1Interface;
	}

	public String getSaeBearerSetupRequestTimes() {
		return saeBearerSetupRequestTimes;
	}

	public void setSaeBearerSetupRequestTimes(String saeBearerSetupRequestTimes) {
		this.saeBearerSetupRequestTimes = saeBearerSetupRequestTimes;
	}

	public String getSaeBearerSetupSuccessTimes() {
		return saeBearerSetupSuccessTimes;
	}

	public void setSaeBearerSetupSuccessTimes(String saeBearerSetupSuccessTimes) {
		this.saeBearerSetupSuccessTimes = saeBearerSetupSuccessTimes;
	}

	public String getUplinkMessageKbytesReceivedInterface() {
		return uplinkMessageKbytesReceivedInterface;
	}

	public void setUplinkMessageKbytesReceivedInterface(String uplinkMessageKbytesReceivedInS1Interface) {
		this.uplinkMessageKbytesReceivedInterface = uplinkMessageKbytesReceivedInS1Interface;
	}

	public String getRealTimePdnConnectionNumber() {
		return realTimePdnConnectionNumber;
	}

	public void setRealTimePdnConnectionNumber(String realTimePdnConnectionNumber) {
		this.realTimePdnConnectionNumber = realTimePdnConnectionNumber;
	}

	public String getRealTimeAttachedUsersAtEcmconnectedStatus() {
		return realTimeAttachedUsersAtEcmconnectedStatus;
	}

	public void setRealTimeAttachedUsersAtEcmconnectedStatus(String realTimeAttachedUsersAtEcmconnectedStatus) {
		this.realTimeAttachedUsersAtEcmconnectedStatus = realTimeAttachedUsersAtEcmconnectedStatus;
	}

	public String getRealTimeAttachedUsersAtEcmidleStatus() {
		return realTimeAttachedUsersAtEcmidleStatus;
	}

	public void setRealTimeAttachedUsersAtEcmidleStatus(String realTimeAttachedUsersAtEcmidleStatus) {
		this.realTimeAttachedUsersAtEcmidleStatus = realTimeAttachedUsersAtEcmidleStatus;
	}

	public String getRealTimeAttachedUsers() {
		return realTimeAttachedUsers;
	}

	public void setRealTimeAttachedUsers(String realTimeAttachedUsers) {
		this.realTimeAttachedUsers = realTimeAttachedUsers;
	}

	public String getMaximumAttachedUsersAtEcmidleStatus() {
		return maximumAttachedUsersAtEcmidleStatus;
	}

	public void setMaximumAttachedUsersAtEcmidleStatus(String maximumAttachedUsersAtEcmidleStatus) {
		this.maximumAttachedUsersAtEcmidleStatus = maximumAttachedUsersAtEcmidleStatus;
	}

	public String getMaximumAttachedUsersAtEcmconnectedStatus() {
		return maximumAttachedUsersAtEcmconnectedStatus;
	}

	public void setMaximumAttachedUsersAtEcmconnectedStatus(String maximumAttachedUsersAtEcmconnectedStatus) {
		this.maximumAttachedUsersAtEcmconnectedStatus = maximumAttachedUsersAtEcmconnectedStatus;
	}

	public String getServiceRequestSuccessTimes() {
		return serviceRequestSuccessTimes;
	}

	public void setServiceRequestSuccessTimes(String serviceRequestSuccessTimes) {
		this.serviceRequestSuccessTimes = serviceRequestSuccessTimes;
	}

	public String getServiceRequestTimes() {
		return serviceRequestTimes;
	}

	public void setServiceRequestTimes(String serviceRequestTimes) {
		this.serviceRequestTimes = serviceRequestTimes;
	}

	public String getPagingRequestTimes() {
		return pagingRequestTimes;
	}

	public void setPagingRequestTimes(String pagingRequestTimes) {
		this.pagingRequestTimes = pagingRequestTimes;
	}

	public String getPagingSuccessTimes() {
		return pagingSuccessTimes;
	}

	public void setPagingSuccessTimes(String pagingSuccessTimes) {
		this.pagingSuccessTimes = pagingSuccessTimes;
	}

	public String getPacketPagingRequestTimesPerSubscriber() {
		return packetPagingRequestTimesPerSubscriber;
	}

	public void setPacketPagingRequestTimesPerSubscriber(String s1ModePacketPagingRequestTimesPerSubscriber) {
		this.packetPagingRequestTimesPerSubscriber = s1ModePacketPagingRequestTimesPerSubscriber;
	}

	public String getPacketPagingSuccessRate() {
		return packetPagingSuccessRate;
	}

	public void setPacketPagingSuccessRate(String s1ModePacketPagingSuccessRate) {
		this.packetPagingSuccessRate = s1ModePacketPagingSuccessRate;
	}

	public String getAuthenticationRequestTimesPerSubscriber() {
		return authenticationRequestTimesPerSubscriber;
	}

	public void setAuthenticationRequestTimesPerSubscriber(String s1ModeAuthenticationRequestTimesPerSubscriber) {
		this.authenticationRequestTimesPerSubscriber = s1ModeAuthenticationRequestTimesPerSubscriber;
	}

	public String getSecurityModeCommandRequestTimes() {
		return securityModeCommandRequestTimes;
	}

	public void setSecurityModeCommandRequestTimes(String securityModeCommandRequestTimes) {
		this.securityModeCommandRequestTimes = securityModeCommandRequestTimes;
	}

	public String getSecurityModeCommandSuccessRate() {
		return securityModeCommandSuccessRate;
	}

	public void setSecurityModeCommandSuccessRate(String securityModeCommandSuccessRate) {
		this.securityModeCommandSuccessRate = securityModeCommandSuccessRate;
	}

	public String getSecurityModeCommandSuccessTimes() {
		return securityModeCommandSuccessTimes;
	}

	public void setSecurityModeCommandSuccessTimes(String securityModeCommandSuccessTimes) {
		this.securityModeCommandSuccessTimes = securityModeCommandSuccessTimes;
	}

	public String getAuthenticationRequestTimes() {
		return authenticationRequestTimes;
	}

	public void setAuthenticationRequestTimes(String authenticationRequestTimes) {
		this.authenticationRequestTimes = authenticationRequestTimes;
	}

	public String getAuthenticationSuccessTimes() {
		return authenticationSuccessTimes;
	}

	public void setAuthenticationSuccessTimes(String authenticationSuccessTimes) {
		this.authenticationSuccessTimes = authenticationSuccessTimes;
	}

	public String getIntrammeHandoverRequestTimesPerSubscriber() {
		return intrammeHandoverRequestTimesPerSubscriber;
	}

	public void setIntrammeHandoverRequestTimesPerSubscriber(
			String s1ModeIntrammeHandoverRequestTimesPerSubscriber) {
		this.intrammeHandoverRequestTimesPerSubscriber = s1ModeIntrammeHandoverRequestTimesPerSubscriber;
	}

	public String getIntrammeHandoverSuccessRate() {
		return intrammeHandoverSuccessRate;
	}

	public void setIntrammeHandoverSuccessRate(String s1ModeIntrammeS1HandoverSuccessRate) {
		this.intrammeHandoverSuccessRate = s1ModeIntrammeS1HandoverSuccessRate;
	}

	public String getIntraBasedHandoverSuccessTimes() {
		return intraBasedHandoverSuccessTimes;
	}

	public void setIntraBasedHandoverSuccessTimes(String intraS1basedHandoverSuccessTimes) {
		this.intraBasedHandoverSuccessTimes = intraS1basedHandoverSuccessTimes;
	}

	public String getIntraBasedHandoverRequestTimes() {
		return intraBasedHandoverRequestTimes;
	}

	public void setIntraBasedHandoverRequestTimes(String intraS1basedHandoverRequestTimes) {
		this.intraBasedHandoverRequestTimes = intraS1basedHandoverRequestTimes;
	}

	public String getIntrammeTauSuccessRate() {
		return intrammeTauSuccessRate;
	}

	public void setIntrammeTauSuccessRate(String s1ModeIntrammeTauSuccessRate) {
		this.intrammeTauSuccessRate = s1ModeIntrammeTauSuccessRate;
	}

	public String getPeriodicTauRequestTimesPerSubscriber() {
		return periodicTauRequestTimesPerSubscriber;
	}

	public void setPeriodicTauRequestTimesPerSubscriber(String s1ModePeriodicTauRequestTimesPerSubscriber) {
		this.periodicTauRequestTimesPerSubscriber = s1ModePeriodicTauRequestTimesPerSubscriber;
	}

	public String getIntrammeCombinedTauSuccessRate() {
		return intrammeCombinedTauSuccessRate;
	}

	public void setIntrammeCombinedTauSuccessRate(String s1ModeIntrammeCombinedTauSuccessRate) {
		this.intrammeCombinedTauSuccessRate = s1ModeIntrammeCombinedTauSuccessRate;
	}

	public String getPeriodTauSuccessTimes() {
		return periodTauSuccessTimes;
	}

	public void setPeriodTauSuccessTimes(String periodTauSuccessTimes) {
		this.periodTauSuccessTimes = periodTauSuccessTimes;
	}

	public String getPeriodTauRequestTimes() {
		return periodTauRequestTimes;
	}

	public void setPeriodTauRequestTimes(String periodTauRequestTimes) {
		this.periodTauRequestTimes = periodTauRequestTimes;
	}

}
