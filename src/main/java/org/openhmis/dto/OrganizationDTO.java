

package org.openhmis.dto;


import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement
public class OrganizationDTO extends BaseDTO {
	
	/**
	 * The client object represents a client record
	 * Fields returned with the client object represent fields marked as "At client record creation" in the HUD standards
	 *
	 * References:
	 * - Fields dictated by: https://www.hudexchange.info/resources/documents/HMIS-Data-Dictionary.pdf
	 * - Field names dictated by: http://www.hudhdx.info/Resources/Vendors/4_0/HMISCSVSpecifications4_0FINAL.pdf
	 */

	// Universal Data Standard: Organization ID (2014, 2.1) 
	private String organizationId;
	private String organizationName;

	// Export Standard Fields
	private Date dateCreated;
	private Date dateUpdated;

	public OrganizationDTO() {
	}

	// Getters / Setters
	@JsonProperty
	public String getId() {
		return organizationId;
	}
	@JsonProperty
	public void setId(String organizationId) {
		this.organizationId = organizationId;
	}
	
	@JsonProperty
	public String getOrganizationId() {
		return organizationId;
	}
	@JsonProperty
	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}
	
	@JsonProperty
	public String getOrganizationName() {
		return organizationName;
	}

	@JsonProperty
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	@JsonProperty
	public Date getDateCreated() {
		return dateCreated;
	}

	@JsonProperty
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@JsonProperty
	public Date getDateUpdated() {
		return dateUpdated;
	}

	@JsonProperty
	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}
}
