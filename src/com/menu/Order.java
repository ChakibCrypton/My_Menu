package com.menu;

import java.util.Scanner;

public class Order {
    /**
     * Display all available menus in the restaurant.
     * 
     */
	Scanner sc = new Scanner(System.in);
	public void runMenu() {
		
		    this.displayAvailableMenu();
		    int nbMenu;
		    do {
		        nbMenu = sc.nextInt();
		        this.displaySelectedMenu(nbMenu);
		        switch (nbMenu) {
		            case 1:
		                displayAvailableSide(true);
		                int nbSide;
		                do {
		                    nbSide = sc.nextInt();
		                    displaySelectedSide(nbSide, true);
		                } while (nbSide < 1 || nbSide > 3);
		                displayAvailableDrink();
		                int nbDrink;
		                do {
		                    nbDrink = sc.nextInt();
		                    displaySelectedDrink(nbDrink);
		                } while (nbDrink < 1 || nbDrink > 3);
		                break;
		            case 2:
		                displayAvailableSide(true);
		                do {
		                    nbSide = sc.nextInt();
		                    displaySelectedSide(nbSide, true);
		                } while (nbSide < 1 || nbSide > 3);
		                break;
		            case 3:
		                displayAvailableSide(false);
		                do {
		                    nbSide = sc.nextInt();
		                    displaySelectedSide(nbSide, false);
		                } while (nbSide < 1 || nbSide > 2);
		                displayAvailableDrink();
		                do {
		                    nbDrink = sc.nextInt();
		                    displaySelectedDrink(nbDrink);
		                } while (nbDrink < 1 || nbDrink > 3);
		                break;
		        }
		    } while (nbMenu < 1 || nbMenu > 3);
		}
	
	
	public void runMenus() {
		System.out.println("Combien de menu voulez-vous ?");
	    int MenuQuantity = sc.nextInt();
	    int counter = 0;
	    while(MenuQuantity > counter) {
	    	this.runMenu();
	    	 counter = counter + 1;
	    }
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
    
    public void displayAvailableSide (boolean x) {
    	if(x) {
    	System.out.println("Quels accomapagnements voulez-vous: légumes_fraies, des frites ou du riz ?");
    }else {
    	System.out.println("Voulez-vous du riz ou pas de riz ?");
    }
    	}
    
    public void displayAvailableDrink() {
    	System.out.println("");
    }
    
    public void displaySelectedSide(int nbSide, boolean allSidesEnable) {
    
    if(allSidesEnable) {
    	 switch(nbSide) {
		   case 1:
			   String nom_1 = "légumes_fraies";
			   System.out.println("Vous avez choisi le menu: " + nom_1 +" . Excellent choix.");
		       break;
		   case 2:
			   String nom_2 = "des frites";
			   System.out.println("Vous avez choisi le menu: " + nom_2 +" . Excellent choix.");
		       break;
		   case 3:
			   String nom_3 = "ou du riz";
			   System.out.println("Vous avez choisi le menu: " + nom_3 +" . Excellent choix.");
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
    } 
     
     
     public void displaySelectedDrink(int nbDrink) {
    	   
    	 switch (nbDrink) {
         case 1:
             System.out.println("Vous avez choisi comme boisson : eau plate\n");
             break;
         case 2:
             System.out.println("Vous avez choisi comme boisson : eau gazeuze\n");
             break;
         case 3:
             System.out.println("Vous avez choisi comme boisson : soda");
             break;
         default:
             System.out.println("Vous n'avez pas choisi de boisson parmi les choix proposés\n");
             break;
     }
     }
     
}
