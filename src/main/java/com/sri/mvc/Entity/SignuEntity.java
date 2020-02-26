package com.sri.mvc.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="signup")
public class SignuEntity implements Serializable {
	@Id
	@GenericGenerator (name="sri",strategy = "increment")
	@GeneratedValue(generator = "sri")
	@Column(name="id")
	private int id;
	@Column(name="username")
	private String username;
	@Column(name="email")
	private String email;
	@Column(name="mobnum")
	private long mobnum;
	@Column(name="pwd")
	private String pwd;
	@Column(name="conpwd")
	private String conpwd;
	public SignuEntity() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobnum() {
		return mobnum;
	}
	public void setMobnum(long mobnum) {
		this.mobnum = mobnum;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getConpwd() {
		return conpwd;
	}
	public void setConpwd(String conpwd) {
		this.conpwd = conpwd;
	}
	@Override
	public String toString() {
		return "SignuEntity [id=" + id + ", username=" + username + ", email=" + email + ", mobnum=" + mobnum + ", pwd="
				+ pwd + ", conpwd=" + conpwd + "]";
	}
	public SignuEntity(int id, String username, String email, long mobnum, String pwd, String conpwd) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.mobnum = mobnum;
		this.pwd = pwd;
		this.conpwd = conpwd;
	}
	
}
