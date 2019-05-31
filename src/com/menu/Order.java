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
			 switch(nbMenu) {
			   case 1:
				   String nom_1 = "poulet";
				   System.out.println("Vous avez choisi le menu: " + nom_1 +" . Excellent choix.");
				   i++;
			       break;
			   case 2:
				   String nom_2 = "boeuf";
				   System.out.println("Vous avez choisi le menu: " + nom_2 +" . Excellent choix.");
				   i++;
			       break;
			   case 3:
				   String nom_3 = "végétarien";
				   System.out.println("Vous avez choisi le menu: " + nom_3 +" . Excellent choix.");
				   i++;
				   break;
			   default:
				   System.out.println("Vous n'avez pas choisie parmis les menues proposés.");
			}
			   
               
    	     }}
    
     public void displaySelectedSide(int nbSide, boolean allSidesEnable) {
    	
    	  
    	 int i = 0; 
    while(i == 0) {
    if(allSidesEnable) {
    	 switch(nbSide) {
		   case 1:
			   String nom_1 = "légumes_fraies";
			   System.out.println("Vous avez choisi le menu: " + nom_1 +" . Excellent choix.");
			   i++;
		       break;
		   case 2:
			   String nom_2 = "des frites";
			   System.out.println("Vous avez choisi le menu: " + nom_2 +" . Excellent choix.");
			   i++;
		       break;
		   case 3:
			   String nom_3 = "ou du riz";
			   System.out.println("Vous avez choisi le menu: " + nom_3 +" . Excellent choix.");
			   i++;
			   break;
		   default:
			   System.out.println("Vous n'avez pas choisies parmi les accompagnments disponibles ");
		}}else {
			 switch (nbSide) {
	            case 1:
	                System.out.println("Vous avez choisi comme accompagnement : riz");
	                break;
	            case 2:
	                System.out.println("Vous avez choisi comme accompagnement : pas de riz");
	                break;
	            default:
	                System.out.println("Vous n'avez pas choisi d'accompagnement parmi les choix proposés");
	                break;
	        }
		}
    } }
}
