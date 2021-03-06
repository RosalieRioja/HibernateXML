package com.app;

import com.util.*;
import com.service.*;

public class Menu {

	private Functions function;
	private final String ACTION_ADD = "add";
	private final String ACTION_UPDATE = "update";
	private final String ACTION_DELETE = "delete";

	public Menu() {
		function = new Functions();

		System.out.println("\nMINI REGISTRATION SYSTEM\n");

		this.startMenu();
	}

	private void startMenu() {
		int iAction = 0;

		while(iAction != 8) {
			System.out.println("\nActions (Enter the number of the desired action) :");
			System.out.println("(1) Register Person");
			System.out.println("(2) Update Person record");
			System.out.println("(3) Delete Person record");
			System.out.println("(4) Print list of Person record\n");
			System.out.println("(5) Add Contact to Person");
			System.out.println("(6) Update Contact of Person");
			System.out.println("(7) Delete Contact of Person\n");
			System.out.println("(8) Exit\n");

			iAction = Validation.enterInteger("Action no.: ");

			switch(iAction) {

				case 1 :
					System.out.println("\nRegister Person");
					function.addPerson();
					break;
				case 2 :
					System.out.println("\nUpdate Person record");
					function.updatePerson();
					break;
				case 3 :
					System.out.println("\nDelete Person record");
					function.deletePerson();
					break;
				case 4 :
					System.out.println("\nList of Person record");	//sort
					function.listPersons();
					break;
				case 5 :
					System.out.println("\nAdd Contact to Person");
					function.contactFunction(ACTION_ADD);
					break;
				case 6 :
					System.out.println("\nUpdate Contact of Person");
					function.contactFunction(ACTION_UPDATE);
					break;
				case 7 :
					System.out.println("\nDelete Contact of Person");
					function.contactFunction(ACTION_DELETE);
					break;
				case 8 :
					System.out.println("\nExit\n");
					System.exit(0);
					break;
				default : 
					System.out.println("There is no action for that number.");
					break;
			}
		}

	}
}