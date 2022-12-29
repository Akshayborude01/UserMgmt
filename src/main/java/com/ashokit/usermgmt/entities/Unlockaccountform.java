package com.ashokit.usermgmt.entities;

public class Unlockaccountform {

	String emalId;
	String tempPwd;
	String NewPwd;
	String confirmPwd;

	public String getEmalId() {
		return emalId;
	}

	public void setEmalId(String emalId) {
		this.emalId = emalId;
	}

	public String getTempPwd() {
		return tempPwd;
	}

	public void setTempPwd(String tempPwd) {
		this.tempPwd = tempPwd;
	}

	public String getNewPwd() {
		return NewPwd;
	}

	public void setNewPwd(String newPwd) {
		NewPwd = newPwd;
	}

	public String getConfirmPwd() {
		return confirmPwd;
	}

	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}

	public Unlockaccountform(String emalId, String tempPwd, String newPwd, String confirmPwd) {
		super();
		this.emalId = emalId;
		this.tempPwd = tempPwd;
		NewPwd = newPwd;
		this.confirmPwd = confirmPwd;
	}

	@Override
	public String toString() {
		return "Unlockaccountform [emalId=" + emalId + ", tempPwd=" + tempPwd + ", NewPwd=" + NewPwd + ", confirmPwd="
				+ confirmPwd + "]";
	}

	public Unlockaccountform() {
		super();
		// TODO Auto-generated constructor stub
	}

}
