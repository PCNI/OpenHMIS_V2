--------------------------------------------------------
--  DDL for Table PATH_AGENCY
--------------------------------------------------------

  CREATE TABLE "PATH_AGENCY" 
   (	"AGENCY_KEY" NUMBER(*,0), 
	"AGENCY_NAME" VARCHAR2(100), 
	"AGENCY_DISPALY_NAME" VARCHAR2(100), 
	"AGENCY_SHORT" VARCHAR2(30), 
	"EMAIL" VARCHAR2(100), 
	"ADDRESS1" VARCHAR2(100), 
	"ADDRESS2" VARCHAR2(100), 
	"CITY" VARCHAR2(100), 
	"STATE_KEY" NUMBER(*,0), 
	"ZIP" VARCHAR2(20), 
	"PATH_AGENCY" CHAR(1), 
	"REFERRAL_EMAIL" VARCHAR2(100), 
	"AUTH_DURATION" NUMBER, 
	"AGENCY_INFORMATION" VARCHAR2(1000), 
	"REGION_KEY" NUMBER, 
	"ACTIVE" CHAR(1), 
	"PHONE" VARCHAR2(30), 
	"FAX" VARCHAR2(30), 
	"ERICA_AGENCY" CHAR(1), 
	"MED_ACCESS" CHAR(1), 
	"REFERRAL_ACCESS" CHAR(1), 
	"PROTECTED" CHAR(1) DEFAULT 'N', 
	"SHELTER" CHAR(1) DEFAULT 'N', 
	"COUNTY" VARCHAR2(25), 
	"SHELTER_TYPE_KEY" NUMBER, 
	"DESCRIPTION" VARCHAR2(4000), 
	"PRIVACY_LEVEL" NUMBER(1,0) DEFAULT 0, 
	"WEBSITE_URL" VARCHAR2(255), 
	"SHORT_INTAKE" CHAR(1) DEFAULT 'N', 
	"MAILING_ADDRESS1" VARCHAR2(100), 
	"MAILING_ADDRESS2" VARCHAR2(100), 
	"MAILING_CITY" VARCHAR2(100), 
	"MAILING_STATE_KEY" NUMBER(22,0), 
	"MAILING_ZIP" VARCHAR2(20), 
	"HOURS" VARCHAR2(100), 
	"ELIGIBILITY" VARCHAR2(100), 
	"FEES" VARCHAR2(100), 
	"INTAKE_PROCESS" VARCHAR2(100), 
	"SERVICE_AREA" VARCHAR2(100), 
	"HANDICAP_ACCESS" CHAR(1) DEFAULT 'N', 
	"DOCTOR_APPOINTMENT_ACCESS" CHAR(1) DEFAULT 'N', 
	"SHORT_DISCHARGE" CHAR(1) DEFAULT 'N', 
	"AMOUNT_USER_DEVICE" NUMBER DEFAULT 1, 
	"XML_IMPORT_ACCESS" CHAR(1) DEFAULT 'N', 
	"UPLOAD_MAX_SIZE" NUMBER(*,0) DEFAULT 524150574, 
	"DOCUMENT_MAX_SIZE" NUMBER(*,0) DEFAULT 1048576, 
	"DIRECT_SERVICE" CHAR(1), 
	"TIME_ZONE_ADJUSTMENT" NUMBER(*,0), 
	"AGENCY_LEGAL_NAME" VARCHAR2(100), 
	"EXEC_DIRECTOR_FIRST_NAME" VARCHAR2(100), 
	"EXEC_DIRECTOR_LAST_NAME" VARCHAR2(100), 
	"EXEC_DIRECTOR_PHONE" VARCHAR2(30), 
	"EXEC_DIRECTOR_EMAIL" VARCHAR2(100), 
	"UPDATE_TIMESTAMP" TIMESTAMP (6), 
	"MIGRATION_FLAG" CHAR(2)
   ) ;
