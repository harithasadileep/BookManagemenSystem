package com.bms.model;

import java.util.Date;

public class Member {

	private Integer memberId;
	private Date memmberdate;
	private String memberType;
	private String address;
	private String memberName;
	private Date expDate;

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public Date getMemmberdate() {
		return memmberdate;
	}

	public void setMemmberdate(Date memmberdate) {
		this.memmberdate = memmberdate;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

}
