package com.example.smallwebapp;

import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_reg")

public class UserRegistration {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private String Name;
	private String EmailID;
	private String Password;
	private byte Gender;
	private String[] Hobby;
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public byte getGender() {
		return Gender;
	}
	public void setGender(byte gender) {
		Gender = gender;
	}
	public String[] getHobby() {
		return Hobby;
	}
	public void setHobby(String[] hobby) {
		Hobby = hobby;
	}
	

	@Override
	public String toString() {
		return "UserRegistration [Name=" + Name + ", EmailID=" + EmailID + ", Password=" + Password + ", Gender="
				+ Gender + ", Hobby=" + Arrays.toString(Hobby) + "]";
	}
	
}
