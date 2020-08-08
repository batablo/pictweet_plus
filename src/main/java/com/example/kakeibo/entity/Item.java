package com.example.kakeibo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Item")
@Data
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="expsense_id")
	private int expenseId;
	
	@Column(name="category_id")
	private int categoryId;
	
	private String name;
	
	private int price;
	
	private String memo;

}
