
USE lte;

-----------------------------------------------------
-- Table `lte-data`.`s1_data`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lte`.`s1_data` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `start_time` VARCHAR(45),
  `period` VARCHAR(45) ,
  `ne_name` VARCHAR(45) ,
  `whole_system` VARCHAR(45) ,
  `average_bearer_number` VARCHAR(45) ,
  `maximum_bearer_number` VARCHAR(45) ,
  `average_dedicated_bearer_number` VARCHAR(45) ,
  `average_pdn_connection_number` VARCHAR(45) ,
  `maximum_pdn_connection_number` VARCHAR(45) ,
  `average_attached_users` VARCHAR(45) ,
  `maximum_attached_users` VARCHAR(45) ,
  `ip_packets_received` VARCHAR(45) ,
  `downlink_message_kbytes_sent_interface` VARCHAR(45) ,
  `sae_bearer_setup_request_times` VARCHAR(45) ,
  `sae_bearer_setup_success_times` VARCHAR(45) ,
  `uplink_message_kbytes_received_interface` VARCHAR(45) ,
  `real_time_pdn_connection_number` VARCHAR(45) ,
  `real_time_attached_users_at_ecmconnected_status` VARCHAR(45) ,
  `real_time_attached_users_at_ecmidle_status` VARCHAR(45) ,
  `real_time_attached_users` VARCHAR(45) ,
  `maximum_attached_users_at_ecmidle_status` VARCHAR(45) ,
  `maximum_attached_users_at_ecmconnected_status` VARCHAR(45) ,
  `service_request_success_times` VARCHAR(45) ,
  `service_request_times` VARCHAR(45) ,
  `paging_request_times` VARCHAR(45) ,
  `paging_success_times` VARCHAR(45) ,
  `packet_paging_request_times_per_subscriber` VARCHAR(45) ,
  `packet_paging_success_rate` VARCHAR(45) ,
  `authentication_request_times_per_subscriber` VARCHAR(45) ,
  `security_mode_command_request_times` VARCHAR(45) ,
  `security_mode_command_success_rate` VARCHAR(45) ,
  `security_mode_command_success_times` VARCHAR(45) ,
  `authentication_request_times` VARCHAR(45) ,
  `authentication_success_times` VARCHAR(45) ,
  `intramme_handover_request_times_per_subscriber` VARCHAR(45) ,
  `intramme_handover_success_rate` VARCHAR(45) ,
  `intra_based_handover_success_times` VARCHAR(45) ,
  `intra_based_handover_request_times` VARCHAR(45) ,
  `intramme_tau_success_rate` VARCHAR(45) ,
  `periodic_tau_request_times_per_subscriber` VARCHAR(45) ,
  `intramme_combined_tau_success_rate` VARCHAR(45),
  `period_tau_success_times` VARCHAR(45) ,
  `period_tau_request_times` VARCHAR(45) ,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;