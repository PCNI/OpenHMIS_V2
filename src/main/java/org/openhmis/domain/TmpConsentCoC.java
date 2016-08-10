package org.openhmis.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TmpContact generated by hbm2java
 */
@Entity
@Table(name = "TMP_CONSENT_COC")
public class TmpConsentCoC implements java.io.Serializable {

	private Integer consentCoCId;
	private Integer consentId;
	private Integer coCId;
	private Date dateCreated;
	private Date dateUpdated;

	public TmpConsentCoC() {
	}

	public TmpConsentCoC(Integer consentCoCId, Integer consentId, Date dateCreated, Date dateUpdated) {
		this.consentCoCId = consentCoCId;
		this.consentId = consentId;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "consentCoCId", unique = true, nullable = false)
	public Integer getConsentCoCId() {
		return this.consentCoCId;
	}

	public void setConsentCoCId(Integer consentCoCId) {
		this.consentCoCId = consentCoCId;
	}

	@Column(name = "consentId")
	public Integer getConsentId() {
		return this.consentId;
	}

	public void setConsentId(Integer consentId) {
		this.consentId = consentId;
	}

	@Column(name = "coCId")
	public Integer getCoCId() {
		return this.coCId;
	}

	public void setCoCId(Integer coCId) {
		this.coCId = coCId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateCreated", length = 10)
	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateUpdated", length = 10)
	public Date getDateUpdated() {
		return this.dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

}