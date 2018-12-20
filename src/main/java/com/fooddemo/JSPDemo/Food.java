package com.fooddemo.JSPDemo;


//a simple class with getters and setters can be referred to as:
//1. A Java Bean
//2. a POJO
//3. a DTO  (Data transfer object -- based off of a DAO design pattern
public class Food {
	
	private String name;
	private String category;
	private String description;
	
	public Food() {
		
	}

	public Food(String name, String category, String description) {
		super();
		this.name = name;
		this.category = category;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", category=" + category + ", description=" + description + "]";
	}
	
	
	
	

}
