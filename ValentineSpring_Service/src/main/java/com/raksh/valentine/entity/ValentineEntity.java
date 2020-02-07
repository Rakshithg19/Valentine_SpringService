package com.raksh.valentine.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "valentine")
public class ValentineEntity implements Serializable {
	@Id
	@GenericGenerator(name= "rakshith", strategy="increment")
	@GeneratedValue(generator = "rakshith")
	@Column(name = "id")
	private int vid;
	@Column(name = "status")
	private String status;
	@Column(name = "gift")
	private String gift;
	@Column(name = "amountspent")
	private int AmountSpent;
	@Column(name = "name")
	private String name;
	
	public ValentineEntity() {
	System.out.println("created entity"+this.getClass().getName());
	}
	public ValentineEntity(int vid, String status, String gift, int amountSpent, String name) {
		super();
		this.vid = vid;
		this.status = status;
		this.gift = gift;
		AmountSpent = amountSpent;
		this.name = name;
	}
	
}
