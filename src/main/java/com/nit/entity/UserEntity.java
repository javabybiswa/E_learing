package com.nit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user_info")

public class UserEntity {
	
	@Id
	@Column(name="user_id")
	private Integer userid;
	
	@Column(name="user_name")
	private String name;
	
	@Column(name="user_location")
	private String location;
	
	@Column(name="user_mobile")
	private Long mobile;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "UserEntity [userid=" + userid + ", name=" + name + ", location=" + location + ", mobile=" + mobile
				+ "]";
	}

	public UserEntity(Integer userid, String name, String location, Long mobile) {
		super();
		this.userid = userid;
		this.name = name;
		this.location = location;
		this.mobile = mobile;
	}

	public UserEntity() {
			}
	
	
	

}
