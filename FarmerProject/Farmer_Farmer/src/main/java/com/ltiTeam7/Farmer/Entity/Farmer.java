package com.ltiTeam7.Farmer.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Farmer1")
public class Farmer {

	 @Id
	 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="tran_seq")
	 @SequenceGenerator(name="tran_seq",initialValue = 1001, allocationSize=1 )
	 @Column(name="Farmer_ID")
	 private long farmerId;
	
	@Column(name = "bankAccountNumber")
	private String bankAccountNumber;

	

	@Column(name = "NAME")
	private String Name;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "PHONE_NUM")
	private long phoneNum;
	
	@Column(name = "address")
	private String address;
	

	@Column(name = "IFSC")
	private String IFSC;
	
	@Column(name = "pinCode")
	private String pinCode;

	public Farmer(long farmerId, String bankAccountNumber, String name, String email, String password, long phoneNum,
			String address, String iFSC, String pinCode) {
		super();
		this.farmerId = farmerId;
		this.bankAccountNumber = bankAccountNumber;
		this.Name = name;
		this.email = email;
		this.password = password;
		this.phoneNum = phoneNum;
		this.address = address;
		this.IFSC = iFSC;
		this.pinCode = pinCode;
	}

	public Farmer() {
		super();
	}

	public long getFarmerId() {
		return farmerId;
	}

	public void setFarmerId(long farmerId) {
		this.farmerId = farmerId;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIFSC() {
		return IFSC;
	}

	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Farmer [farmerId=" + farmerId + ", bankAccountNumber=" + bankAccountNumber + ", Name=" + Name
				+ ", email=" + email + ", password=" + password + ", phoneNum=" + phoneNum + ", address=" + address
				+ ", IFSC=" + IFSC + ", pinCode=" + pinCode + "]";
	}
	
	
	
	
}

	