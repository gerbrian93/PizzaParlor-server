package com.gerhart.pizzaparlor.entity;

import jakarta.persistence.Id;

public class MenuItem {
	@Id
	private long id;
	private String itemName;
	private String itemType;
	private String price;
	
	
}
