package com.cg.babycare.bean;

public class BabySittingService 
{
	String babySitterId;
    String babyName;
    String babyAge;
    String babyGender;
    String fatherName;
    String motherName;
    String Address;
    String contact;
	public String getBabySitterId() {
		return babySitterId;
	}
	public void setBabySitterId(String babySitterId) {
		this.babySitterId = babySitterId;
	}
	public String getBabyName() {
		return babyName;
	}
	public void setBabyName(String babyName) {
		this.babyName = babyName;
	}
	public String getBabyAge() {
		return babyAge;
	}
	public void setBabyAge(String babyAge) {
		this.babyAge = babyAge;
	}
	public String getBabyGender() {
		return babyGender;
	}
	public void setBabyGender(String babyGender) {
		this.babyGender = babyGender;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "BabySittingService [babySitterId=" + babySitterId + ", babyName=" + babyName + ", babyAge=" + babyAge
				+ ", babyGender=" + babyGender + ", fatherName=" + fatherName + ", motherName=" + motherName
				+ ", Address=" + Address + ", contact=" + contact + "]";
	}
	
    
	}
