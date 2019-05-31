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
               System.out.println("Vous avez choisi le menu: " + nbMenu +" . Excellent choix.");
    }
}
