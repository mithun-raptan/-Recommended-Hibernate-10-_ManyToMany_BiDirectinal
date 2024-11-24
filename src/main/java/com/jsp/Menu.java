package com.jsp;

import java.util.List;

import javax.annotation.processing.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Menu {
	
	@Id
	private int id;
	
	@ManyToMany 
//	@JoinColumn
	private List<FoodProduct> foodproducts;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<FoodProduct> getFoodproducts() {
		return foodproducts;
	}

	public void setFoodproducts(List<FoodProduct> foodproducts) {
		this.foodproducts = foodproducts;
	}

	
	
	
	

}
