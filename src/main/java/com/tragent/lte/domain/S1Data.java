package com.tragent.lte.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Configuration;

@Configuration
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
	private String s1ModeAverageBearerNumber;

	@Column(nullable = false)
	private String s1ModeMaximumBearerNumber;

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
	private String downlinkMessageKbytesSentInS1Interface;

	@Column(nullable = false)
	private String saeBearerSetupRequestTimes;

	@Column(nullable = false)
	private String saeBearerSetupSuccessTimes;

	@Column(nullable = false)
	private String uplinkMessageKbytesReceivedInS1Interface;

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
	private String s1ModePacketPagingRequestTimesPerSubscriber;

	@Column(nullable = false)
	private String s1ModePacketPagingSuccessRate;

	@Column(nullable = false)
	private String s1ModeAuthenticationRequestTimesPerSubscriber;

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
	private String s1ModeIntrammeHandoverRequestTimesPerSubscriber;

	@Column(nullable = false)
	private String s1ModeIntrammeS1HandoverSuccessRate;

	@Column(nullable = false)
	private String intraS1basedHandoverSuccessTimes;

	@Column(nullable = false)
	private String intraS1basedHandoverRequestTimes;

	@Column(nullable = false)
	private String s1ModeIntrammeTauSuccessRate;

	@Column(nullable = false)
	private String s1ModePeriodicTauRequestTimesPerSubscriber;

	@Column(nullable = false)
	private String s1ModeIntrammeCombinedTauSuccessRate;

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
		this.s1ModeAverageBearerNumber = s1ModeAverageBearerNumber;
		this.s1ModeMaximumBearerNumber = s1ModeMaximumBearerNumber;
		this.averageDedicatedBearerNumber = averageDedicatedBearerNumber;
		this.averagePdnConnectionNumber = averagePdnConnectionNumber;
		this.maximumPdnConnectionNumber = maximumPdnConnectionNumber;
		this.averageAttachedUsers = averageAttachedUsers;
		this.maximumAttachedUsers = maximumAttachedUsers;
		this.ipPacketsReceived = ipPacketsReceived;
		this.downlinkMessageKbytesSentInS1Interface = downlinkMessageKbytesSentInS1Interface;
		this.saeBearerSetupRequestTimes = saeBearerSetupRequestTimes;
		this.saeBearerSetupSuccessTimes = saeBearerSetupSuccessTimes;
		this.uplinkMessageKbytesReceivedInS1Interface = uplinkMessageKbytesReceivedInS1Interface;
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
		this.s1ModePacketPagingRequestTimesPerSubscriber = s1ModePacketPagingRequestTimesPerSubscriber;
		this.s1ModePacketPagingSuccessRate = s1ModePacketPagingSuccessRate;
		this.s1ModeAuthenticationRequestTimesPerSubscriber = s1ModeAuthenticationRequestTimesPerSubscriber;
		this.securityModeCommandRequestTimes = securityModeCommandRequestTimes;
		this.securityModeCommandSuccessRate = securityModeCommandSuccessRate;
		this.securityModeCommandSuccessTimes = securityModeCommandSuccessTimes;
		this.authenticationRequestTimes = authenticationRequestTimes;
		this.authenticationSuccessTimes = authenticationSuccessTimes;
		this.s1ModeIntrammeHandoverRequestTimesPerSubscriber = s1ModeIntrammeHandoverRequestTimesPerSubscriber;
		this.s1ModeIntrammeS1HandoverSuccessRate = s1ModeIntrammeS1HandoverSuccessRate;
		this.intraS1basedHandoverSuccessTimes = intraS1basedHandoverSuccessTimes;
		this.intraS1basedHandoverRequestTimes = intraS1basedHandoverRequestTimes;
		this.s1ModeIntrammeTauSuccessRate = s1ModeIntrammeTauSuccessRate;
		this.s1ModePeriodicTauRequestTimesPerSubscriber = s1ModePeriodicTauRequestTimesPerSubscriber;
		this.s1ModeIntrammeCombinedTauSuccessRate = s1ModeIntrammeCombinedTauSuccessRate;
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

	public String getS1ModeAverageBearerNumber() {
		return s1ModeAverageBearerNumber;
	}

	public void setS1ModeAverageBearerNumber(String s1ModeAverageBearerNumber) {
		this.s1ModeAverageBearerNumber = s1ModeAverageBearerNumber;
	}

	public String getS1ModeMaximumBearerNumber() {
		return s1ModeMaximumBearerNumber;
	}

	public void setS1ModeMaximumBearerNumber(String s1ModeMaximumBearerNumber) {
		this.s1ModeMaximumBearerNumber = s1ModeMaximumBearerNumber;
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

	public String getDownlinkMessageKbytesSentInS1Interface() {
		return downlinkMessageKbytesSentInS1Interface;
	}

	public void setDownlinkMessageKbytesSentInS1Interface(String downlinkMessageKbytesSentInS1Interface) {
		this.downlinkMessageKbytesSentInS1Interface = downlinkMessageKbytesSentInS1Interface;
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

	public String getUplinkMessageKbytesReceivedInS1Interface() {
		return uplinkMessageKbytesReceivedInS1Interface;
	}

	public void setUplinkMessageKbytesReceivedInS1Interface(String uplinkMessageKbytesReceivedInS1Interface) {
		this.uplinkMessageKbytesReceivedInS1Interface = uplinkMessageKbytesReceivedInS1Interface;
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

	public String getS1ModePacketPagingRequestTimesPerSubscriber() {
		return s1ModePacketPagingRequestTimesPerSubscriber;
	}

	public void setS1ModePacketPagingRequestTimesPerSubscriber(String s1ModePacketPagingRequestTimesPerSubscriber) {
		this.s1ModePacketPagingRequestTimesPerSubscriber = s1ModePacketPagingRequestTimesPerSubscriber;
	}

	public String getS1ModePacketPagingSuccessRate() {
		return s1ModePacketPagingSuccessRate;
	}

	public void setS1ModePacketPagingSuccessRate(String s1ModePacketPagingSuccessRate) {
		this.s1ModePacketPagingSuccessRate = s1ModePacketPagingSuccessRate;
	}

	public String getS1ModeAuthenticationRequestTimesPerSubscriber() {
		return s1ModeAuthenticationRequestTimesPerSubscriber;
	}

	public void setS1ModeAuthenticationRequestTimesPerSubscriber(String s1ModeAuthenticationRequestTimesPerSubscriber) {
		this.s1ModeAuthenticationRequestTimesPerSubscriber = s1ModeAuthenticationRequestTimesPerSubscriber;
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

	public String getS1ModeIntrammeHandoverRequestTimesPerSubscriber() {
		return s1ModeIntrammeHandoverRequestTimesPerSubscriber;
	}

	public void setS1ModeIntrammeHandoverRequestTimesPerSubscriber(
			String s1ModeIntrammeHandoverRequestTimesPerSubscriber) {
		this.s1ModeIntrammeHandoverRequestTimesPerSubscriber = s1ModeIntrammeHandoverRequestTimesPerSubscriber;
	}

	public String getS1ModeIntrammeS1HandoverSuccessRate() {
		return s1ModeIntrammeS1HandoverSuccessRate;
	}

	public void setS1ModeIntrammeS1HandoverSuccessRate(String s1ModeIntrammeS1HandoverSuccessRate) {
		this.s1ModeIntrammeS1HandoverSuccessRate = s1ModeIntrammeS1HandoverSuccessRate;
	}

	public String getIntraS1basedHandoverSuccessTimes() {
		return intraS1basedHandoverSuccessTimes;
	}

	public void setIntraS1basedHandoverSuccessTimes(String intraS1basedHandoverSuccessTimes) {
		this.intraS1basedHandoverSuccessTimes = intraS1basedHandoverSuccessTimes;
	}

	public String getIntraS1basedHandoverRequestTimes() {
		return intraS1basedHandoverRequestTimes;
	}

	public void setIntraS1basedHandoverRequestTimes(String intraS1basedHandoverRequestTimes) {
		this.intraS1basedHandoverRequestTimes = intraS1basedHandoverRequestTimes;
	}

	public String getS1ModeIntrammeTauSuccessRate() {
		return s1ModeIntrammeTauSuccessRate;
	}

	public void setS1ModeIntrammeTauSuccessRate(String s1ModeIntrammeTauSuccessRate) {
		this.s1ModeIntrammeTauSuccessRate = s1ModeIntrammeTauSuccessRate;
	}

	public String getS1ModePeriodicTauRequestTimesPerSubscriber() {
		return s1ModePeriodicTauRequestTimesPerSubscriber;
	}

	public void setS1ModePeriodicTauRequestTimesPerSubscriber(String s1ModePeriodicTauRequestTimesPerSubscriber) {
		this.s1ModePeriodicTauRequestTimesPerSubscriber = s1ModePeriodicTauRequestTimesPerSubscriber;
	}

	public String getS1ModeIntrammeCombinedTauSuccessRate() {
		return s1ModeIntrammeCombinedTauSuccessRate;
	}

	public void setS1ModeIntrammeCombinedTauSuccessRate(String s1ModeIntrammeCombinedTauSuccessRate) {
		this.s1ModeIntrammeCombinedTauSuccessRate = s1ModeIntrammeCombinedTauSuccessRate;
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
