package com.ashokit.usermgmt.entities;

public class StateMaster {

	private int sid;
	private String sname;
	private int cid;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "StateMaster [sid=" + sid + ", sname=" + sname + ", cid=" + cid + "]";
	}

	public StateMaster(int sid, String sname, int cid) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.cid = cid;
	}

	public StateMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

}
