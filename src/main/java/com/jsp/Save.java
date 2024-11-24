package com.jsp;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
	public static void main(String[] args) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		 EntityManager em=emf.createEntityManager();
		 EntityTransaction et =  em.getTransaction();

		 //save code
		 
//		 Menu menu = new Menu();
//		 menu.setId(1);
//		 Menu menu1 = new Menu();
//		 menu1.setId(2);
//		 
//		 FoodProduct fp = new FoodProduct();
//		 fp.setId(1);
//		 fp.setName("fried rice");
//		 fp.setPrice("200");
//		 
//		 FoodProduct fp1 = new FoodProduct();
//		 fp1.setId(2);
//		 fp1.setName("chilli chicken");
//		 fp1.setPrice("500");
//		 
//		 FoodProduct fp2 = new FoodProduct();
//		 fp2.setId(3);
//		 fp2.setName("briyani");
//		 fp2.setPrice("300");
//		 
//	 
//		 menu.setFoodproducts(Arrays.asList(fp,fp1));
//		 
//		 menu1.setFoodproducts(Arrays.asList(fp1,fp2));
//		 
//		 fp.setMenus(Arrays.asList(menu));
//		 fp1.setMenus(Arrays.asList(menu,menu1));
//		 fp2.setMenus(Arrays.asList(menu1));
//		 et.begin();
//		 em.persist(menu);
//		 em.persist(menu1);
//		 em.persist(fp);
//		 em.persist(fp1);
//		 em.persist(fp2);
//		 et.commit();
//		 
		 
		 //remove code 
		 //to delete only menu
		 Menu menu1 = em.find(Menu.class, 2);
		 
		 et.begin();
		 menu1.getFoodproducts().clear(); //making menu food-product list as null
		 em.merge(menu1);
		 em.remove(menu1);
		 et.commit();
		 
		 
		 
		 //remove related food-product which is present in both the menu and menu1
		 
//		 et.begin();
//		 //step1: find the food-product which i want to delete
//		 FoodProduct fp1=em.find(FoodProduct.class, 3);
//		 
//		 //step2: find all the menus which are holding that particular food-product(fp1)
//		 List<Menu> listofmenu=fp1.getMenus();
//		 
//		 //step3: use for-each loop in order to remove the particular food-product(ex.fp1) from the list of menu
//		 for (Menu menu : listofmenu) {
//			menu.getFoodproducts().remove(fp1);
//			//update the menu to persist changes
//			em.merge(menu);
//		}
//		 
//		 //step4: now delete the particular food-prosuct from the db
//		 em.remove(fp1);
//		 
//		 et.commit();

	}
}
