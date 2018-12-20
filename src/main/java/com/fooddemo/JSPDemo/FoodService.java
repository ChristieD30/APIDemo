package com.fooddemo.JSPDemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component    //this annotation makes this a Singleton Spring bean
//created and managed by Spring
public class FoodService {
	
 private List<Food> list = new ArrayList<>();
	
	public FoodService() {
		list.add(new Food("Apples", "Fruit", "Sweet and crunchy."));
		list.add(new Food("Carrots", "Vegetable", "Orange root vegtable."));
		list.add(new Food("Peas", "Vegetable", "Small, round, and green."));
		list.add(new Food("Cake", "Prepared", "Fluffy baked good with icing."));
		list.add(new Food("Lemon", "Fruit", "Sour citrus."));
		list.add(new Food("Sandwich", "Prepared", "Versatile staple."));
		list.add(new Food("Blueberry", "Fruit", "Small, round, and blue."));
			
	}
	
	public List<Food> getAllFoods(){
		
		return list;	
		
	}
	
	public List<Food> getFoodsInCategory(String category){
	  
		List<Food> search = new ArrayList<>();
		

			for (Food food : list) {
				if (food.getCategory().equalsIgnoreCase(category)) {
				search.add(food);	
				}
			}
		
		return search;
		
		
	}
	
	
	public void addToList(Food food){
		
			list.add (food);
		
		
	}
}
