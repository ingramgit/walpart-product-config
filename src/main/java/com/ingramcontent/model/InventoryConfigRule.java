package com.ingramcontent.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class InventoryConfigRule implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Integer maxRetires;
	private java.lang.Integer thressholdForFilesInMinutes;
	private java.lang.Integer maxAccumulatedFiles;
	private java.lang.Integer maxTitlesInFile;
	private java.lang.Integer maxRecordsPerFetch;

	public InventoryConfigRule() {
	}

	public java.lang.Integer getMaxRetires() {
		return this.maxRetires;
	}

	public void setMaxRetires(java.lang.Integer maxRetires) {
		this.maxRetires = maxRetires;
	}

	public java.lang.Integer getThressholdForFilesInMinutes() {
		return this.thressholdForFilesInMinutes;
	}

	public void setThressholdForFilesInMinutes(
			java.lang.Integer thressholdForFilesInMinutes) {
		this.thressholdForFilesInMinutes = thressholdForFilesInMinutes;
	}

	public java.lang.Integer getMaxAccumulatedFiles() {
		return this.maxAccumulatedFiles;
	}

	public void setMaxAccumulatedFiles(java.lang.Integer maxAccumulatedFiles) {
		this.maxAccumulatedFiles = maxAccumulatedFiles;
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

	public InventoryConfigRule(java.lang.Integer maxRetires,
			java.lang.Integer thressholdForFilesInMinutes,
			java.lang.Integer maxAccumulatedFiles,
			java.lang.Integer maxTitlesInFile,
			java.lang.Integer maxRecordsPerFetch) {
		this.maxRetires = maxRetires;
		this.thressholdForFilesInMinutes = thressholdForFilesInMinutes;
		this.maxAccumulatedFiles = maxAccumulatedFiles;
		this.maxTitlesInFile = maxTitlesInFile;
		this.maxRecordsPerFetch = maxRecordsPerFetch;
	}

}