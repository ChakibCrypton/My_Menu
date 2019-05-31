package com.menu;


public class Order {
    /**
     * Display all available menus in the restaurant.
     */
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
			   if (nbMenu == 1) {
				   String nom = "poulet";
				   System.out.println("Vous avez choisi le menu: " + nom +" . Excellent choix.");
			}
			   if (nbMenu == 2) {
				   String nom = "boeuf";
				   System.out.println("Vous avez choisi le menu: " + nom +" . Excellent choix.");
			}
			   if (nbMenu == 3) {
				   String nom = "végétarien";
				   System.out.println("Vous avez choisi le menu: " + nom +" . Excellent choix.");
			}
              
               i++;
    	    }else {
    	    	System.out.println("Le nombre que vous avez écris ne correspond pas à un menu, veuillez réessayer");
    	    }}
    }
}
