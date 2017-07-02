package com.tragent.lte.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "s1_data")
public class S1Data {

	protected S1Data() {

	}

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

}
