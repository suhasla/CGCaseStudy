package com.suhas.certificate.model;

import org.springframework.data.annotation.Id;

public class Certificate {
@Id	
private String certificateid;
private String certificatename;
private String period;
private String reportmanager;
public Certificate() {
	
}
public Certificate(String certificatename, String period, String reportmanager) {
	
	this.certificatename = certificatename;
	this.period = period;
	this.reportmanager = reportmanager;
}
public String getCertificateid() {
	return certificateid;
}
public void setCertificateid(String certificateid) {
	this.certificateid = certificateid;
}
public String getCertificatename() {
	return certificatename;
}
public void setCertificatename(String certificatename) {
	this.certificatename = certificatename;
}
public String getPeriod() {
	return period;
}
public void setPeriod(String period) {
	this.period = period;
}
public String getReportmanager() {
	return reportmanager;
}
public void setReportmanager(String reportmanager) {
	this.reportmanager = reportmanager;
}


}
