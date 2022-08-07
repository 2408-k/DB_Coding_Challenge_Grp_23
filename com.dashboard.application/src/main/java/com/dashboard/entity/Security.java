package com.dashboard.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Security {
	@Id
	@Column(name="Id")
	private Integer Id;
	
	@Column(name="isin")
	private int isin;
	
	@Column(name="cusip")
	private int cusip;
	
	@Column(name="issuer")
	private String issuer;
	
	@Column(name="maturity_date")
	private String maturity_date;
	
	@Column(name="coupon")
	private float coupon;
	
	@Column(name="type_")
	private String type_;
	
	@Column(name="face_value")
	private float face_value;
	
	@Column(name="status_")
	private String status_;
	
	public Integer getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public int getIsin() {
		return isin;
	}

	public void setIsin(int isin) {
		this.isin = isin;
	}

	public int getCusip() {
		return cusip;
	}

	public void setCusip(int cusip) {
		this.cusip = cusip;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public String getMaturity_date() {
		return maturity_date;
	}

	public void setMaturity_date(String maturity_date) {
		this.maturity_date = maturity_date;
	}

	public float getCoupon() {
		return coupon;
	}

	public void setCoupon(float coupon) {
		this.coupon = coupon;
	}

	public String getType_() {
		return type_;
	}

	public void setType_(String type_) {
		this.type_ = type_;
	}

	public float getFace_value() {
		return face_value;
	}

	public void setFace_value(float face_value) {
		this.face_value = face_value;
	}

	public String getStatus_() {
		return status_;
	}

	public void setStatus_(String status_) {
		this.status_ = status_;
	}


	
}
