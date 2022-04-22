package com.java.practice.bank;

public class Bank {

	protected String name;
	protected String accountType;
	protected String typeOfCard;
	protected String bankAddress;

	public boolean hasBranch() {
		return bankAddress.equals("PADRAUNA");
	}

	public boolean isSavingAccount() {
		return accountType == "Saving";
	}

	// Overload method
	public String getAccountType() {
		return this.accountType;
//		if (accountType == "Saving") {
//			return true;
//		} else if (accountType == "Current") {
//			return true;
//		}
//		return false;
	}

	// Overload method
	public boolean getAccountType(String accountType) {
		return this.accountType == accountType;
	}

	public boolean isCurrentAccount() {
		return accountType == "Current";
	}
}
