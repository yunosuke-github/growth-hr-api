USE growth_hr;

CREATE TABLE ACCOUNT (
    ACCOUNT_ID INT(11) NOT NULL AUTO_INCREMENT,
    ACCOUNT_NAME VARCHAR(1024) NOT NULL,
    ACCOUNT_CODE VARCHAR(1024) NOT NULL,
    EMAIL VARCHAR(1024) NOT NULL,
    PASSWORD VARCHAR(1024) NOT NULL,
    DELETED tinyint(1) NOT NULL,
    CREATED_AT DATETIME NOT NULL,
    CREATED_BY VARCHAR(1024) NOT NULL,
    UPDATED_AT DATETIME NOT NULL,
    UPDATED_BY VARCHAR(1024) NOT NULL,
    PRIMARY KEY(ACCOUNT_ID)
);