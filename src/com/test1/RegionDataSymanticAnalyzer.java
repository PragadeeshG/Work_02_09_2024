package com.test1;

public class RegionDataSymanticAnalyzer {
	private String countryCode;
	private String regionCode;
	private String regionName;
	private String symanticAnalyzerId;
	private String isPrimary;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public RegionDataSymanticAnalyzer() {

	}

	public RegionDataSymanticAnalyzer(String countryCode, String regionCode, String regionName,
			String symanticAnalyzerId, String isPrimary, String creationDate, String modifiedDate, String entityState) {
		super();
		this.countryCode = countryCode;
		this.regionCode = regionCode;
		this.regionName = regionName;
		this.symanticAnalyzerId = symanticAnalyzerId;
		this.isPrimary = isPrimary;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getSymanticAnalyzerId() {
		return symanticAnalyzerId;
	}

	public void setSymanticAnalyzerId(String symanticAnalyzerId) {
		this.symanticAnalyzerId = symanticAnalyzerId;
	}

	public String getIsPrimary() {
		return isPrimary;
	}

	public void setIsPrimary(String isPrimary) {
		this.isPrimary = isPrimary;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
