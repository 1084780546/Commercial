package com.chen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="t_car")
public class Car {
	
	@Id
	@GeneratedValue
	private Integer cid;
	@Column
	private Integer tid;
	@Column
	private Integer uid;
	@Column
	private Integer tnum;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getTnum() {
		return tnum;
	}
	public void setTnum(Integer tnum) {
		this.tnum = tnum;
	}
	public Car(Integer cid, Integer tid, Integer uid, Integer tnum) {
		super();
		this.cid = cid;
		this.tid = tid;
		this.uid = uid;
		this.tnum = tnum;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Car [cid=" + cid + ", tid=" + tid + ", uid=" + uid + ", tnum=" + tnum + "]";
	}

}
