/*******************************************************************************
 * 	Copyright 2016 ContainX and OpenStack4j                                          
 * 	                                                                                 
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not      
 * 	use this file except in compliance with the License. You may obtain a copy of    
 * 	the License at                                                                   
 * 	                                                                                 
 * 	    http://www.apache.org/licenses/LICENSE-2.0                                   
 * 	                                                                                 
 * 	Unless required by applicable law or agreed to in writing, software              
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT        
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the         
 * 	License for the specific language governing permissions and limitations under    
 * 	the License.                                                                     
 *******************************************************************************/
package com.huawei.openstack4j.openstack.sahara.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huawei.openstack4j.model.ModelEntity;
import com.huawei.openstack4j.openstack.sahara.constants.BillingType;
import com.huawei.openstack4j.openstack.sahara.constants.ClusterType;
import com.huawei.openstack4j.openstack.sahara.constants.ClusterVersion;
import com.huawei.openstack4j.openstack.sahara.constants.VolumeType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaharaClusterCreate implements ModelEntity {

	private static final long serialVersionUID = -4868885128978653274L;

	@JsonProperty("cluster_name")
	String name;

	@JsonProperty("cluster_version")
	ClusterVersion version;

	@JsonProperty("cluster_type")
	ClusterType type;

	@JsonProperty("master_node_num")
	Integer masterNodeNum;
	@JsonProperty("core_node_num")
	Integer coreNodeNum;
	@JsonProperty("master_node_size")
	String masterNodeSize;
	@JsonProperty("core_node_size")
	String coreNodeSize;

	@JsonProperty("billing_type")
	BillingType billingType;
	@JsonProperty("data_center")
	String dataCenter;
	@JsonProperty("available_zone_id")
	String availablilityZoneId;

	@JsonProperty("vpc_id")
	String vpcId;
	@JsonProperty("vpc")
	String vpcName;
	@JsonProperty("subnet_id")
	String subnetId;
	@JsonProperty("subnet_name")
	String subnetName;

	@JsonProperty("volume_type")
	VolumeType volumeType;
	@JsonProperty("volume_size")
	Integer volumeSize;

	@JsonProperty("node_public_cert_name")
	String keypair;

	@JsonProperty("cluster_admin_secret")
	String adminSecret;

	@JsonProperty("safe_mode")
	Integer safeMode;

	@JsonProperty("component_list")
	List<SaharaComponent> components;
	
	@JsonProperty("add_jobs")
	List<SaharaJobExeCreate> jobs;
	
}
