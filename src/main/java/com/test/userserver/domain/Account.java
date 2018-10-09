package com.test.userserver.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor @AllArgsConstructor
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(length = 20)
	private long seq;
	
	@Column(length = 20)
	private String accountName;
	
	@Column(length = 20)
	private String acccountPass;
	
	public Account(String accountName, String acccountPass) {
		this.accountName = accountName;
		this.acccountPass = acccountPass;
	}
}