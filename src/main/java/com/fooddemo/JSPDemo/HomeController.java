package com.fooddemo.JSPDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@Autowired
	FoodService foodService;

	@RequestMapping("/")
	public ModelAndView index() {

		return new ModelAndView("index", "Test", "Hello, World!");
	}

	@RequestMapping("/food")
	public ModelAndView listFood(@RequestParam(value = "category", required = false) String category) {
		ModelAndView mv = new ModelAndView("list-food");

		if (category != null && !category.isEmpty()) {
			mv.addObject("food", foodService.getFoodsInCategory(category));
			mv.addObject("category", category);

		} else {
			mv.addObject("food", foodService.getAllFoods());
		}

		return mv;

	}

	@RequestMapping("/form")
	// String methods used in the controller for a request methods are used to show
	// the view
	public String foodForm() {

		return "FoodForm";

	}

	@RequestMapping(value = "newfood", method = RequestMethod.POST)
	public ModelAndView newFood(Food newFood) {
		
		foodService.addToList(newFood);
		
		return new ModelAndView("redirect:/food");

	}

}
