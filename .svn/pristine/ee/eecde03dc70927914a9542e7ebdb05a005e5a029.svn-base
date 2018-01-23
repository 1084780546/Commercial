package com.chen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="t_orderlist")
public class OrderList {
	
	@Id
	@GeneratedValue
	private Integer lid;
	@Column
	private String oid;
	@Column
	private String tname;
	@Column
	private double amount;//总计
	@Column
	private double price;
	@Column
	private Integer quantity;//数量
	
	public Integer getLid() {
		return lid;
	}
	public void setLid(Integer lid) {
		this.lid = lid;
	}
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public OrderList(Integer lid, String oid, String tname, double amount, double price, Integer quantity) {
		super();
		this.lid = lid;
		this.oid = oid;
		this.tname = tname;
		this.amount = amount;
		this.price = price;
		this.quantity = quantity;
	}
	public OrderList() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OrderList [lid=" + lid + ", oid=" + oid + ", tname=" + tname + ", amount=" + amount + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
	
}
