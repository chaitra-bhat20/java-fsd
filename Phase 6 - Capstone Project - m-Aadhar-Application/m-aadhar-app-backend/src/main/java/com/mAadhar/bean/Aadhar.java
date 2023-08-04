package com.mAadhar.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aadhar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String cname;
	private String dob;
	private String address;
	private String emailid;
	private String number;
	private String gender;
	private String status;
	private String requestType;
	
	public Aadhar() {
		super();
	}

	public Aadhar(int cid, String cname, String dob, String address, String emailid, String number, String gender,
			String status) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.dob = dob;
		this.address = address;
		this.emailid = emailid;
		this.number = number;
		this.gender = gender;
		this.status = status;
	}
	
	
	public Aadhar(int cid, String cname, String dob, String address, String emailid, String number, String gender,
			String status, String requestType) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.dob = dob;
		this.address = address;
		this.emailid = emailid;
		this.number = number;
		this.gender = gender;
		this.status = status;
		this.requestType = requestType;
	}

	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getNumber() {
		return (String) number;
	}
	public void setNumber(String number) {
		this.number = (String) number;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	@Override
	public String toString() {
		return "Aadhar [cid=" + cid + ", cname=" + cname + ", dob=" + dob + ", address=" + address + ", emailid="
				+ emailid + ", number=" + number + ", gender=" + gender + ", status=" + status + ", requestType="
				+ requestType + "]";
	}

}
