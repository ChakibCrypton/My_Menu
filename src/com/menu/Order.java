package com.menu;

import java.util.Scanner;

public class Order {
    /**
     * Display all available menus in the restaurant.
     * 
     */
	
	public void runMenu() {
		this.displayAvailableMenu();
		 Scanner sc = new Scanner(System.in);
		 int nb = sc.nextInt();
		 this.displaySelectedMenu(nb);
	}
    public void displayAvailableMenu() {
            System.out.println("Choix du menu: \n 1- poulet \n 2- boeuf \n 3- végétarien \n Que souhaitez vous comme menu ?");
    }
    /**
     * Display a selected menu.
     * @param nbMenu The selected menu.
     */
    public void displaySelectedMenu(int nbMenu) {
     int i = 0;
     while(i == 0){
		if(nbMenu >= 1 && nbMenu <= 3) {
			 switch(nbMenu) {
			   case 1:
				   String nom_1 = "poulet";
				   System.out.println("Vous avez choisi le menu: " + nom_1 +" . Excellent choix.");
			
			   case 2:
				   String nom_2 = "boeuf";
				   System.out.println("Vous avez choisi le menu: " + nom_2 +" . Excellent choix.");
			
			   case 3:
				   String nom_3 = "végétarien";
				   System.out.println("Vous avez choisi le menu: " + nom_3 +" . Excellent choix.");
			}
			   
               i++;
    	    } else {
    	    	System.out.println("Le nombre que vous avez écris ne correspond pas à un menu, veuillez réessayer");
    	    }}
    }
}
