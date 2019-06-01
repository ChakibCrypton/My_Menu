package com.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

	public class Order {
	String orderSummary = "";
    /**
     * Display all available menus in the restaurant.
     * 
     */
	Scanner sc = new Scanner(System.in);
	
	public void runMenu() {
	    int nbMenu = askMenu();
	    switch (nbMenu) {
	        case 1:
	            askSide(true);
	            askDrink();
	            break;
	        case 2:
	            askSide(true);
	            break;
	        case 3:
	            askSide(false);
	            askDrink();
	            break;
	    }
	}
	

	 public void runMenus() {
		    System.out.println("Combien souhaitez vous commander de menu ?");
		    int menuQuantity = -1;
		    boolean responseIsGood;
		    do {
		        try {
		            menuQuantity = sc.nextInt();
		            responseIsGood = true;
		        } catch (InputMismatchException e) {
		            sc.next();
		            System.out.println("Vous devez saisir un nombre, correspondant au nombre de menus souhaités");
		            responseIsGood = false;
		        }
		    } while (!responseIsGood);
		    orderSummary = "Résumé de votre commande :%n";
		    for (int i = 0; i < menuQuantity; i++) {
		        orderSummary += "Menu " + (i + 1) + ":%n";
		        runMenu();
		    }
		    System.out.println("");
		    System.out.println(String.format(orderSummary));
		}
	
 
	 public int askSomething(String category, String[] responses) {
	        System.out.println("Choix " + category);
	        for (int i = 1; i <= responses.length; i++)
	            System.out.println(i + " - " + responses[i - 1]);
	        System.out.println("Que souhaitez-vous comme " + category + "?");
	        int nbResponse = 0;
	        boolean responseIsGood;
	        do {
	            try {
	                nbResponse = sc.nextInt();
	                responseIsGood = (nbResponse >= 1 && nbResponse <= responses.length);
	            } catch (InputMismatchException e) {
	                sc.next();
	                responseIsGood = false;
	            }
	            if (responseIsGood) {
	                String choice = "Vous avez choisi comme " + category + " : " + responses[nbResponse - 1];
	                orderSummary += choice + "%n";
	                System.out.println(choice);
	            } else {
	                boolean isVowel = "aeiouy".contains(Character.toString(category.charAt(0)));
	                if (isVowel)
	                    System.out.println("Vous n'avez pas choisi d'" + category + " parmi les choix proposés");
	                else
	                    System.out.println("Vous n'avez pas choisi de " + category + " parmi les choix proposés");
	            }
	        } while (!responseIsGood);
	        return nbResponse;
	}
	
	public int askMenu() {
		String[] menus = {"poulet", "boeuf", "végétarien"};
	    int nbMenu = this.askSomething("menus", menus);
	    return nbMenu;
	}
	
	public void askSide(boolean allSidesEnable) {
	    if (allSidesEnable) {
	        String[] responsesAllSide = {"légumes frais", "frites", "riz"};
	            askSomething("accompagnement", responsesAllSide);
	           
	    } else {
	        String[] responsesOnlyRice = {"riz", "pas de riz"};
	        askSomething("accompagnement", responsesOnlyRice);
	    }
	}
	public void askDrink() {
		String[] drinks = {"eau plate", "eau gazeuze", "soda"};
		this.askSomething("boissons", drinks);
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
