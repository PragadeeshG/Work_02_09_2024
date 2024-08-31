package com.test1;

public class DataSymanticAnalyzer {
	private long symanticAnalyzerId;
	private String SymanticAnalyzerName;
	private String symanticAnalyzerType;
	private String symanticAnalyzerBehaviour;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DataSymanticAnalyzer() {

	}

	public DataSymanticAnalyzer(long symanticAnalyzerId, String symanticAnalyzerName, String symanticAnalyzerType,
			String symanticAnalyzerBehaviour, String creationDate, String modifiedDate, String entityState) {
		super();
		this.symanticAnalyzerId = symanticAnalyzerId;
		SymanticAnalyzerName = symanticAnalyzerName;
		this.symanticAnalyzerType = symanticAnalyzerType;
		this.symanticAnalyzerBehaviour = symanticAnalyzerBehaviour;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getSymanticAnalyzerId() {
		return symanticAnalyzerId;
	}

	public void setSymanticAnalyzerId(long symanticAnalyzerId) {
		this.symanticAnalyzerId = symanticAnalyzerId;
	}

	public String getSymanticAnalyzerName() {
		return SymanticAnalyzerName;
	}

	public void setSymanticAnalyzerName(String symanticAnalyzerName) {
		SymanticAnalyzerName = symanticAnalyzerName;
	}

	public String getSymanticAnalyzerType() {
		return symanticAnalyzerType;
	}

	public void setSymanticAnalyzerType(String symanticAnalyzerType) {
		this.symanticAnalyzerType = symanticAnalyzerType;
	}

	public String getSymanticAnalyzerBehaviour() {
		return symanticAnalyzerBehaviour;
	}

	public void setSymanticAnalyzerBehaviour(String symanticAnalyzerBehaviour) {
		this.symanticAnalyzerBehaviour = symanticAnalyzerBehaviour;
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
