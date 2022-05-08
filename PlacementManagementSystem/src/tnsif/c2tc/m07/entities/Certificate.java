package tnsif.c2tc.m07.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Certificate {
	@Id
	private long cid;
	private int year;
	private String clg;
	private College college;
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getClg() {
		return clg;
	}
	public void setClg(String clg) {
		this.clg = clg;
	}   
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "Certificate [cid=" + cid + ", year=" + year + ", clg=" + clg + ", college=" + college + "]";
	}
	
	
}