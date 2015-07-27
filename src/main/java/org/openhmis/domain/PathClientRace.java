package org.openhmis.domain;

// Generated Jul 25, 2015 10:54:03 PM by Hibernate Tools 4.3.1

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
 * PathClientRace generated by hbm2java
 */
@Entity
@Table(name = "PATH_CLIENT_RACE")
public class PathClientRace implements java.io.Serializable {

	private Integer primaryKey;
	private Integer clientKey;
	private Integer raceKey;
	private Date updateTimestamp;
	private String migrationFlag;

	public PathClientRace() {
	}

	public PathClientRace(Date updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public PathClientRace(Integer clientKey, Integer raceKey,
			Date updateTimestamp, String migrationFlag) {
		this.clientKey = clientKey;
		this.raceKey = raceKey;
		this.updateTimestamp = updateTimestamp;
		this.migrationFlag = migrationFlag;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "PRIMARY_KEY", unique = true, nullable = false)
	public Integer getPrimaryKey() {
		return this.primaryKey;
	}

	public void setPrimaryKey(Integer primaryKey) {
		this.primaryKey = primaryKey;
	}

	@Column(name = "CLIENT_KEY")
	public Integer getClientKey() {
		return this.clientKey;
	}

	public void setClientKey(Integer clientKey) {
		this.clientKey = clientKey;
	}

	@Column(name = "RACE_KEY")
	public Integer getRaceKey() {
		return this.raceKey;
	}

	public void setRaceKey(Integer raceKey) {
		this.raceKey = raceKey;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_TIMESTAMP", nullable = false, length = 19)
	public Date getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Date updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	@Column(name = "MIGRATION_FLAG", length = 2)
	public String getMigrationFlag() {
		return this.migrationFlag;
	}

	public void setMigrationFlag(String migrationFlag) {
		this.migrationFlag = migrationFlag;
	}

}
