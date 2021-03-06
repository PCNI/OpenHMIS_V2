package org.openhmis.domain;

// Generated Aug 5, 2015 10:00:15 PM by Hibernate Tools 4.3.1

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
 * TmpFinancialAssistance generated by hbm2java
 */
@Entity
@Table(name = "TMP_FINANCIAL_ASSISTANCE")
public class TmpFinancialAssistance implements java.io.Serializable {

	private Integer financialAssistanceId;
	private Integer enrollmentId;
	private Date dateProvided;
	private Integer hopwaTypeProvided;
	private Integer hopwaFaaAmount;
	private Integer ssvfTypeProvided;
	private Integer ssvfFaaAmount;
	private Date dateCreated;
	private Date dateUpdated;

	public TmpFinancialAssistance() {
	}

	public TmpFinancialAssistance(Integer enrollmentId, Date dateProvided,
			Integer hopwaTypeProvided, Integer hopwaFaaAmount,
			Integer ssvfTypeProvided, Integer ssvfFaaAmount, Date dateCreated,
			Date dateUpdated) {
		this.enrollmentId = enrollmentId;
		this.dateProvided = dateProvided;
		this.hopwaTypeProvided = hopwaTypeProvided;
		this.hopwaFaaAmount = hopwaFaaAmount;
		this.ssvfTypeProvided = ssvfTypeProvided;
		this.ssvfFaaAmount = ssvfFaaAmount;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "financialAssistanceId", unique = true, nullable = false)
	public Integer getFinancialAssistanceId() {
		return this.financialAssistanceId;
	}

	public void setFinancialAssistanceId(Integer financialAssistanceId) {
		this.financialAssistanceId = financialAssistanceId;
	}

	@Column(name = "enrollmentId")
	public Integer getEnrollmentId() {
		return this.enrollmentId;
	}

	public void setEnrollmentId(Integer enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateProvided", length = 10)
	public Date getDateProvided() {
		return this.dateProvided;
	}

	public void setDateProvided(Date dateProvided) {
		this.dateProvided = dateProvided;
	}

	@Column(name = "hopwaTypeProvided")
	public Integer getHopwaTypeProvided() {
		return this.hopwaTypeProvided;
	}

	public void setHopwaTypeProvided(Integer hopwaTypeProvided) {
		this.hopwaTypeProvided = hopwaTypeProvided;
	}

	@Column(name = "hopwaFaaAmount")
	public Integer getHopwaFaaAmount() {
		return this.hopwaFaaAmount;
	}

	public void setHopwaFaaAmount(Integer hopwaFaaAmount) {
		this.hopwaFaaAmount = hopwaFaaAmount;
	}

	@Column(name = "ssvfTypeProvided")
	public Integer getSsvfTypeProvided() {
		return this.ssvfTypeProvided;
	}

	public void setSsvfTypeProvided(Integer ssvfTypeProvided) {
		this.ssvfTypeProvided = ssvfTypeProvided;
	}

	@Column(name = "ssvfFaaAmount")
	public Integer getSsvfFaaAmount() {
		return this.ssvfFaaAmount;
	}

	public void setSsvfFaaAmount(Integer ssvfFaaAmount) {
		this.ssvfFaaAmount = ssvfFaaAmount;
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
