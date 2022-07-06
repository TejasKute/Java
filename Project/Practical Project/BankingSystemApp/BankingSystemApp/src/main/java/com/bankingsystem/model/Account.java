package com.bankingsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "account_details")
//uniqueConstraints = { @UniqueConstraint(columnNames = { "email" }) })

//@Table(name = "account_details")
public class Account {
	@Id
	@GenericGenerator(name = "anudip_seq", strategy = "com.bankingsystem.model.AccountNoGenerator")
	@GeneratedValue(generator = "anudip_seq")
	// @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 15)
	private int accno;

	@Column(length = 30)
	// @NonNull will be taught in spring session
	// @Size(min = 2,message = "holdername should have atleast 2 characters")
	private String holderName;

	// @NonNull
	// @Size(message = "account balance can't be null")
	private long accbalance;

	// @Email
	// @Size(min = 2,message = "email can't be null")
	@Column(name = "email", unique = true)
	private String email;

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public long getAccbalance() {
		return accbalance;
	}

	public void setAccbalance(long accbalance) {
		this.accbalance = accbalance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", holderName=" + holderName + ", accbalance=" + accbalance + ", email="
				+ email + "]";
	}

	
	
}

