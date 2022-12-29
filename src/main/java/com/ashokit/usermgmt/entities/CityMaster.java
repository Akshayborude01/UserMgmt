package com.ashokit.usermgmt.entities;

public class CityMaster {

	private int cityId;
	private String cityName;
	private int sid;

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public CityMaster(int cityId, String cityName, int sid) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.sid = sid;
	}

	public CityMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CityMaster [cityId=" + cityId + ", cityName=" + cityName + ", sid=" + sid + "]";
	}

}
