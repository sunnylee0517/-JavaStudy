package com.deitel.jhtp7.ch14;

import java.io.Serializable;

public class AccountRecordSerializable implements Serializable {
	private int account;
	private String firstName;
	private String lastName;
	private double balance;
	
	public AccountRecordSerializable(){
		this(0, "", "", 0.0);
	}
	
	public AccountRecordSerializable(int account, String firstName, String lastName, double balance){
		setAccount(account);
		setFirstName(firstName);
		setLastName(lastName);
		setBalance(balance);
	}
	
	public void setAccount(int account){
		this.account = account;
	}
	
	public int getAccount(){
		return account;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public double getBalance(){
		return balance;
	}
}
