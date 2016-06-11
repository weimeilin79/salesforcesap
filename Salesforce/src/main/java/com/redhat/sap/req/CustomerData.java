package com.redhat.sap.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class CustomerData {
	
	@XmlAttribute(name="CUSTNAME", required = true)
	private String custname = null;
	@XmlAttribute(name="FORM", required = true)
	private String form = null;
	@XmlAttribute(name="STREET", required = true)
	private String street = null;
	@XmlAttribute(name="POSTCODE", required = true)
	private String postcode = null;
	@XmlAttribute(name="CITY", required = true)
	private String city = null;
	@XmlAttribute(name="COUNTR", required = true)
	private String country = null;
	@XmlAttribute(name="PHONE", required = true)
	private String phone = null;
	@XmlAttribute(name="EMAIL", required = true)
	private String email = null;
	@XmlAttribute(name="CUSTTYPE", required = true)
	private String custype = "B";
	@XmlAttribute(name="DISCOUNT", required = true)
	private String discount = "6";
	@XmlAttribute(name="LANGU", required = true)
	private String lang = "EN";
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCustype() {
		return custype;
	}
	public void setCustype(String custype) {
		this.custype = custype;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	
	
	

}
