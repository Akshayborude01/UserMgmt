package com.ashokit.usermgmt.entities;

public class CountryMaster {

	private int cid;
	private String cname;
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
	@Override
	public String toString() {
		return "CountryMaster [cid=" + cid + ", cname=" + cname + "]";
	}
	public CountryMaster(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public CountryMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
