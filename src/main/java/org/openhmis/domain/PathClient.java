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
 * PathClient generated by hbm2java
 */
@Entity
@Table(name = "PATH_CLIENT")
public class PathClient implements java.io.Serializable {

	private Integer clientKey;
	private String identification;
	private Integer idType;
	private String lastName;
	private String firstName;
	private String middleName;
	private Date dateOfBirth;
	private Integer genderKey;
	private Integer ethnicityKey;
	private Integer maritalStatusKey;
	private Integer ambulatoryKey;
	private String clientNotes;
	private Date createDate;
	private Integer createUserKey;
	private Character homeless;
	private Integer regionKey;
	private String suffix;
	private Character anonymous;
	private Date updateDate;
	private Integer updateUserKey;
	private Integer disablingCondition;
	private String previousFirstName;
	private String previousMiddleName;
	private String previousLastName;
	private String previousSuffix;
	private Integer hoursWorkedLastWeek;
	private Integer lookingForWork;
	private Integer veteran;
	private Integer healthStatusKey;
	private Integer pregnancyStatus;
	private Date pregnancyDueDate;
	private Integer transgenderType;
	private Integer primaryLanguageKey;
	private Integer secondaryLanguageKey;
	private Character interpreterNeeded;
	private Integer primaryLanguage;
	private Integer secondaryLanguage;
	private byte[] picture;
	private String pictureName;
	private Integer pictureUpUser;
	private Date pictureUpDt;
	private Integer pictureDelUser;
	private Date pictureDelDt;
	private String pictureType;
	private Integer raceKey;
	private Integer homelessStatusKey;
	private Integer dobType;
	private Integer incomeQuestion;
	private Date incomeDate;
	private Integer nonCashQuestion;
	private Date nonCashDate;
	private Integer isEmployed;
	private Integer tenure;
	private Character volunteer;
	private Character isBasic;
	private Date updateTimestamp;
	private String migrationFlag;
	private Character isCoord;
	private Integer nameType;
	private String genderDesc;
	private Integer healthInsQuestion;
	private Date healthInsDate;
	private String otherIdentification;
	private String otherIdentificationNum;

	public PathClient() {
	}

	public PathClient(Date updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public PathClient(String identification, Integer idType, String lastName,
			String firstName, String middleName, Date dateOfBirth,
			Integer genderKey, Integer ethnicityKey, Integer maritalStatusKey,
			Integer ambulatoryKey, String clientNotes, Date createDate,
			Integer createUserKey, Character homeless, Integer regionKey,
			String suffix, Character anonymous, Date updateDate,
			Integer updateUserKey, Integer disablingCondition,
			String previousFirstName, String previousMiddleName,
			String previousLastName, String previousSuffix,
			Integer hoursWorkedLastWeek, Integer lookingForWork,
			Integer veteran, Integer healthStatusKey, Integer pregnancyStatus,
			Date pregnancyDueDate, Integer transgenderType,
			Integer primaryLanguageKey, Integer secondaryLanguageKey,
			Character interpreterNeeded, Integer primaryLanguage,
			Integer secondaryLanguage, byte[] picture, String pictureName,
			Integer pictureUpUser, Date pictureUpDt, Integer pictureDelUser,
			Date pictureDelDt, String pictureType, Integer raceKey,
			Integer homelessStatusKey, Integer dobType, Integer incomeQuestion,
			Date incomeDate, Integer nonCashQuestion, Date nonCashDate,
			Integer isEmployed, Integer tenure, Character volunteer,
			Character isBasic, Date updateTimestamp, String migrationFlag,
			Character isCoord, Integer nameType, String genderDesc,
			Integer healthInsQuestion, Date healthInsDate,
			String otherIdentification, String otherIdentificationNum) {
		this.identification = identification;
		this.idType = idType;
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.dateOfBirth = dateOfBirth;
		this.genderKey = genderKey;
		this.ethnicityKey = ethnicityKey;
		this.maritalStatusKey = maritalStatusKey;
		this.ambulatoryKey = ambulatoryKey;
		this.clientNotes = clientNotes;
		this.createDate = createDate;
		this.createUserKey = createUserKey;
		this.homeless = homeless;
		this.regionKey = regionKey;
		this.suffix = suffix;
		this.anonymous = anonymous;
		this.updateDate = updateDate;
		this.updateUserKey = updateUserKey;
		this.disablingCondition = disablingCondition;
		this.previousFirstName = previousFirstName;
		this.previousMiddleName = previousMiddleName;
		this.previousLastName = previousLastName;
		this.previousSuffix = previousSuffix;
		this.hoursWorkedLastWeek = hoursWorkedLastWeek;
		this.lookingForWork = lookingForWork;
		this.veteran = veteran;
		this.healthStatusKey = healthStatusKey;
		this.pregnancyStatus = pregnancyStatus;
		this.pregnancyDueDate = pregnancyDueDate;
		this.transgenderType = transgenderType;
		this.primaryLanguageKey = primaryLanguageKey;
		this.secondaryLanguageKey = secondaryLanguageKey;
		this.interpreterNeeded = interpreterNeeded;
		this.primaryLanguage = primaryLanguage;
		this.secondaryLanguage = secondaryLanguage;
		this.picture = picture;
		this.pictureName = pictureName;
		this.pictureUpUser = pictureUpUser;
		this.pictureUpDt = pictureUpDt;
		this.pictureDelUser = pictureDelUser;
		this.pictureDelDt = pictureDelDt;
		this.pictureType = pictureType;
		this.raceKey = raceKey;
		this.homelessStatusKey = homelessStatusKey;
		this.dobType = dobType;
		this.incomeQuestion = incomeQuestion;
		this.incomeDate = incomeDate;
		this.nonCashQuestion = nonCashQuestion;
		this.nonCashDate = nonCashDate;
		this.isEmployed = isEmployed;
		this.tenure = tenure;
		this.volunteer = volunteer;
		this.isBasic = isBasic;
		this.updateTimestamp = updateTimestamp;
		this.migrationFlag = migrationFlag;
		this.isCoord = isCoord;
		this.nameType = nameType;
		this.genderDesc = genderDesc;
		this.healthInsQuestion = healthInsQuestion;
		this.healthInsDate = healthInsDate;
		this.otherIdentification = otherIdentification;
		this.otherIdentificationNum = otherIdentificationNum;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CLIENT_KEY", unique = true, nullable = false)
	public Integer getClientKey() {
		return this.clientKey;
	}

	public void setClientKey(Integer clientKey) {
		this.clientKey = clientKey;
	}

	@Column(name = "IDENTIFICATION", length = 20)
	public String getIdentification() {
		return this.identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	@Column(name = "ID_TYPE")
	public Integer getIdType() {
		return this.idType;
	}

	public void setIdType(Integer idType) {
		this.idType = idType;
	}

	@Column(name = "LAST_NAME", length = 100)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "FIRST_NAME", length = 100)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "MIDDLE_NAME", length = 100)
	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_OF_BIRTH", length = 10)
	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Column(name = "GENDER_KEY")
	public Integer getGenderKey() {
		return this.genderKey;
	}

	public void setGenderKey(Integer genderKey) {
		this.genderKey = genderKey;
	}

	@Column(name = "ETHNICITY_KEY")
	public Integer getEthnicityKey() {
		return this.ethnicityKey;
	}

	public void setEthnicityKey(Integer ethnicityKey) {
		this.ethnicityKey = ethnicityKey;
	}

	@Column(name = "MARITAL_STATUS_KEY")
	public Integer getMaritalStatusKey() {
		return this.maritalStatusKey;
	}

	public void setMaritalStatusKey(Integer maritalStatusKey) {
		this.maritalStatusKey = maritalStatusKey;
	}

	@Column(name = "AMBULATORY_KEY")
	public Integer getAmbulatoryKey() {
		return this.ambulatoryKey;
	}

	public void setAmbulatoryKey(Integer ambulatoryKey) {
		this.ambulatoryKey = ambulatoryKey;
	}

	@Column(name = "CLIENT_NOTES", length = 65535)
	public String getClientNotes() {
		return this.clientNotes;
	}

	public void setClientNotes(String clientNotes) {
		this.clientNotes = clientNotes;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATE_DATE", length = 10)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "CREATE_USER_KEY")
	public Integer getCreateUserKey() {
		return this.createUserKey;
	}

	public void setCreateUserKey(Integer createUserKey) {
		this.createUserKey = createUserKey;
	}

	@Column(name = "HOMELESS", length = 1)
	public Character getHomeless() {
		return this.homeless;
	}

	public void setHomeless(Character homeless) {
		this.homeless = homeless;
	}

	@Column(name = "REGION_KEY")
	public Integer getRegionKey() {
		return this.regionKey;
	}

	public void setRegionKey(Integer regionKey) {
		this.regionKey = regionKey;
	}

	@Column(name = "SUFFIX", length = 10)
	public String getSuffix() {
		return this.suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	@Column(name = "ANONYMOUS", length = 1)
	public Character getAnonymous() {
		return this.anonymous;
	}

	public void setAnonymous(Character anonymous) {
		this.anonymous = anonymous;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATE_DATE", length = 10)
	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Column(name = "UPDATE_USER_KEY")
	public Integer getUpdateUserKey() {
		return this.updateUserKey;
	}

	public void setUpdateUserKey(Integer updateUserKey) {
		this.updateUserKey = updateUserKey;
	}

	@Column(name = "DISABLING_CONDITION")
	public Integer getDisablingCondition() {
		return this.disablingCondition;
	}

	public void setDisablingCondition(Integer disablingCondition) {
		this.disablingCondition = disablingCondition;
	}

	@Column(name = "PREVIOUS_FIRST_NAME", length = 50)
	public String getPreviousFirstName() {
		return this.previousFirstName;
	}

	public void setPreviousFirstName(String previousFirstName) {
		this.previousFirstName = previousFirstName;
	}

	@Column(name = "PREVIOUS_MIDDLE_NAME", length = 50)
	public String getPreviousMiddleName() {
		return this.previousMiddleName;
	}

	public void setPreviousMiddleName(String previousMiddleName) {
		this.previousMiddleName = previousMiddleName;
	}

	@Column(name = "PREVIOUS_LAST_NAME", length = 50)
	public String getPreviousLastName() {
		return this.previousLastName;
	}

	public void setPreviousLastName(String previousLastName) {
		this.previousLastName = previousLastName;
	}

	@Column(name = "PREVIOUS_SUFFIX", length = 50)
	public String getPreviousSuffix() {
		return this.previousSuffix;
	}

	public void setPreviousSuffix(String previousSuffix) {
		this.previousSuffix = previousSuffix;
	}

	@Column(name = "HOURS_WORKED_LAST_WEEK")
	public Integer getHoursWorkedLastWeek() {
		return this.hoursWorkedLastWeek;
	}

	public void setHoursWorkedLastWeek(Integer hoursWorkedLastWeek) {
		this.hoursWorkedLastWeek = hoursWorkedLastWeek;
	}

	@Column(name = "LOOKING_FOR_WORK")
	public Integer getLookingForWork() {
		return this.lookingForWork;
	}

	public void setLookingForWork(Integer lookingForWork) {
		this.lookingForWork = lookingForWork;
	}

	@Column(name = "VETERAN")
	public Integer getVeteran() {
		return this.veteran;
	}

	public void setVeteran(Integer veteran) {
		this.veteran = veteran;
	}

	@Column(name = "HEALTH_STATUS_KEY")
	public Integer getHealthStatusKey() {
		return this.healthStatusKey;
	}

	public void setHealthStatusKey(Integer healthStatusKey) {
		this.healthStatusKey = healthStatusKey;
	}

	@Column(name = "PREGNANCY_STATUS")
	public Integer getPregnancyStatus() {
		return this.pregnancyStatus;
	}

	public void setPregnancyStatus(Integer pregnancyStatus) {
		this.pregnancyStatus = pregnancyStatus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PREGNANCY_DUE_DATE", length = 10)
	public Date getPregnancyDueDate() {
		return this.pregnancyDueDate;
	}

	public void setPregnancyDueDate(Date pregnancyDueDate) {
		this.pregnancyDueDate = pregnancyDueDate;
	}

	@Column(name = "TRANSGENDER_TYPE")
	public Integer getTransgenderType() {
		return this.transgenderType;
	}

	public void setTransgenderType(Integer transgenderType) {
		this.transgenderType = transgenderType;
	}

	@Column(name = "PRIMARY_LANGUAGE_KEY")
	public Integer getPrimaryLanguageKey() {
		return this.primaryLanguageKey;
	}

	public void setPrimaryLanguageKey(Integer primaryLanguageKey) {
		this.primaryLanguageKey = primaryLanguageKey;
	}

	@Column(name = "SECONDARY_LANGUAGE_KEY")
	public Integer getSecondaryLanguageKey() {
		return this.secondaryLanguageKey;
	}

	public void setSecondaryLanguageKey(Integer secondaryLanguageKey) {
		this.secondaryLanguageKey = secondaryLanguageKey;
	}

	@Column(name = "INTERPRETER_NEEDED", length = 1)
	public Character getInterpreterNeeded() {
		return this.interpreterNeeded;
	}

	public void setInterpreterNeeded(Character interpreterNeeded) {
		this.interpreterNeeded = interpreterNeeded;
	}

	@Column(name = "PRIMARY_LANGUAGE")
	public Integer getPrimaryLanguage() {
		return this.primaryLanguage;
	}

	public void setPrimaryLanguage(Integer primaryLanguage) {
		this.primaryLanguage = primaryLanguage;
	}

	@Column(name = "SECONDARY_LANGUAGE")
	public Integer getSecondaryLanguage() {
		return this.secondaryLanguage;
	}

	public void setSecondaryLanguage(Integer secondaryLanguage) {
		this.secondaryLanguage = secondaryLanguage;
	}

	@Column(name = "PICTURE")
	public byte[] getPicture() {
		return this.picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	@Column(name = "PICTURE_NAME", length = 75)
	public String getPictureName() {
		return this.pictureName;
	}

	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}

	@Column(name = "PICTURE_UP_USER")
	public Integer getPictureUpUser() {
		return this.pictureUpUser;
	}

	public void setPictureUpUser(Integer pictureUpUser) {
		this.pictureUpUser = pictureUpUser;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PICTURE_UP_DT", length = 10)
	public Date getPictureUpDt() {
		return this.pictureUpDt;
	}

	public void setPictureUpDt(Date pictureUpDt) {
		this.pictureUpDt = pictureUpDt;
	}

	@Column(name = "PICTURE_DEL_USER")
	public Integer getPictureDelUser() {
		return this.pictureDelUser;
	}

	public void setPictureDelUser(Integer pictureDelUser) {
		this.pictureDelUser = pictureDelUser;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "PICTURE_DEL_DT", length = 10)
	public Date getPictureDelDt() {
		return this.pictureDelDt;
	}

	public void setPictureDelDt(Date pictureDelDt) {
		this.pictureDelDt = pictureDelDt;
	}

	@Column(name = "PICTURE_TYPE", length = 5)
	public String getPictureType() {
		return this.pictureType;
	}

	public void setPictureType(String pictureType) {
		this.pictureType = pictureType;
	}

	@Column(name = "RACE_KEY")
	public Integer getRaceKey() {
		return this.raceKey;
	}

	public void setRaceKey(Integer raceKey) {
		this.raceKey = raceKey;
	}

	@Column(name = "HOMELESS_STATUS_KEY")
	public Integer getHomelessStatusKey() {
		return this.homelessStatusKey;
	}

	public void setHomelessStatusKey(Integer homelessStatusKey) {
		this.homelessStatusKey = homelessStatusKey;
	}

	@Column(name = "DOB_TYPE")
	public Integer getDobType() {
		return this.dobType;
	}

	public void setDobType(Integer dobType) {
		this.dobType = dobType;
	}

	@Column(name = "INCOME_QUESTION")
	public Integer getIncomeQuestion() {
		return this.incomeQuestion;
	}

	public void setIncomeQuestion(Integer incomeQuestion) {
		this.incomeQuestion = incomeQuestion;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "INCOME_DATE", length = 10)
	public Date getIncomeDate() {
		return this.incomeDate;
	}

	public void setIncomeDate(Date incomeDate) {
		this.incomeDate = incomeDate;
	}

	@Column(name = "NON_CASH_QUESTION")
	public Integer getNonCashQuestion() {
		return this.nonCashQuestion;
	}

	public void setNonCashQuestion(Integer nonCashQuestion) {
		this.nonCashQuestion = nonCashQuestion;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "NON_CASH_DATE", length = 10)
	public Date getNonCashDate() {
		return this.nonCashDate;
	}

	public void setNonCashDate(Date nonCashDate) {
		this.nonCashDate = nonCashDate;
	}

	@Column(name = "IS_EMPLOYED")
	public Integer getIsEmployed() {
		return this.isEmployed;
	}

	public void setIsEmployed(Integer isEmployed) {
		this.isEmployed = isEmployed;
	}

	@Column(name = "TENURE")
	public Integer getTenure() {
		return this.tenure;
	}

	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}

	@Column(name = "VOLUNTEER", length = 1)
	public Character getVolunteer() {
		return this.volunteer;
	}

	public void setVolunteer(Character volunteer) {
		this.volunteer = volunteer;
	}

	@Column(name = "IS_BASIC", length = 1)
	public Character getIsBasic() {
		return this.isBasic;
	}

	public void setIsBasic(Character isBasic) {
		this.isBasic = isBasic;
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

	@Column(name = "IS_COORD", length = 1)
	public Character getIsCoord() {
		return this.isCoord;
	}

	public void setIsCoord(Character isCoord) {
		this.isCoord = isCoord;
	}

	@Column(name = "NAME_TYPE")
	public Integer getNameType() {
		return this.nameType;
	}

	public void setNameType(Integer nameType) {
		this.nameType = nameType;
	}

	@Column(name = "GENDER_DESC", length = 60)
	public String getGenderDesc() {
		return this.genderDesc;
	}

	public void setGenderDesc(String genderDesc) {
		this.genderDesc = genderDesc;
	}

	@Column(name = "HEALTH_INS_QUESTION")
	public Integer getHealthInsQuestion() {
		return this.healthInsQuestion;
	}

	public void setHealthInsQuestion(Integer healthInsQuestion) {
		this.healthInsQuestion = healthInsQuestion;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "HEALTH_INS_DATE", length = 10)
	public Date getHealthInsDate() {
		return this.healthInsDate;
	}

	public void setHealthInsDate(Date healthInsDate) {
		this.healthInsDate = healthInsDate;
	}

	@Column(name = "OTHER_IDENTIFICATION", length = 30)
	public String getOtherIdentification() {
		return this.otherIdentification;
	}

	public void setOtherIdentification(String otherIdentification) {
		this.otherIdentification = otherIdentification;
	}

	@Column(name = "OTHER_IDENTIFICATION_NUM", length = 20)
	public String getOtherIdentificationNum() {
		return this.otherIdentificationNum;
	}

	public void setOtherIdentificationNum(String otherIdentificationNum) {
		this.otherIdentificationNum = otherIdentificationNum;
	}

}
