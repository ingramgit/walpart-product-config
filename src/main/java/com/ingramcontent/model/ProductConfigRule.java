package com.ingramcontent.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ProductConfigRule implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Integer maxRetires;
	private java.lang.Integer maxHourlyAccumulatedFiles;
	private java.lang.Integer dailyUploadLimit;
	private java.lang.Integer maxTitlesInFile;
	private java.lang.Integer maxRecordsPerFetch;

	public ProductConfigRule() {
	}

	public java.lang.Integer getMaxRetires() {
		return this.maxRetires;
	}

	public void setMaxRetires(java.lang.Integer maxRetires) {
		this.maxRetires = maxRetires;
	}

	public java.lang.Integer getMaxHourlyAccumulatedFiles() {
		return this.maxHourlyAccumulatedFiles;
	}

	public void setMaxHourlyAccumulatedFiles(
			java.lang.Integer maxHourlyAccumulatedFiles) {
		this.maxHourlyAccumulatedFiles = maxHourlyAccumulatedFiles;
	}

	public java.lang.Integer getDailyUploadLimit() {
		return this.dailyUploadLimit;
	}

	public void setDailyUploadLimit(java.lang.Integer dailyUploadLimit) {
		this.dailyUploadLimit = dailyUploadLimit;
	}

	public java.lang.Integer getMaxTitlesInFile() {
		return this.maxTitlesInFile;
	}

	public void setMaxTitlesInFile(java.lang.Integer maxTitlesInFile) {
		this.maxTitlesInFile = maxTitlesInFile;
	}

	public java.lang.Integer getMaxRecordsPerFetch() {
		return this.maxRecordsPerFetch;
	}

	public void setMaxRecordsPerFetch(java.lang.Integer maxRecordsPerFetch) {
		this.maxRecordsPerFetch = maxRecordsPerFetch;
	}

	public ProductConfigRule(java.lang.Integer maxRetires,
			java.lang.Integer maxHourlyAccumulatedFiles,
			java.lang.Integer dailyUploadLimit,
			java.lang.Integer maxTitlesInFile,
			java.lang.Integer maxRecordsPerFetch) {
		this.maxRetires = maxRetires;
		this.maxHourlyAccumulatedFiles = maxHourlyAccumulatedFiles;
		this.dailyUploadLimit = dailyUploadLimit;
		this.maxTitlesInFile = maxTitlesInFile;
		this.maxRecordsPerFetch = maxRecordsPerFetch;
	}

}