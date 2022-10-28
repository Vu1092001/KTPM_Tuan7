package com.example.CAU2.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class Book implements Serializable {
	@Id
	private String subId;
	private String name;
	private String credit;
	public String getSubId() {
		return subId;
	}
	public void setSubId(String subId) {
		this.subId = subId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public Book(String subId, String name, String credit) {
		super();
		this.subId = subId;
		this.name = name;
		this.credit = credit;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [subId=" + subId + ", name=" + name + ", credit=" + credit + "]";
	}
	
}
