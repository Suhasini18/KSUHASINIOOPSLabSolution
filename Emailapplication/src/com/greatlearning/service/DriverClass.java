package com.greatlearning.service;

import java.util.Scanner;

import com.greatlearning.model.Employee;

public class DriverClass{ 
	public static void main(String[] args) {
		Employee employee = new Employee("SUHASINI","K");
		Scanner scan = new Scanner(System.in);
		String generatedEmail ;
		char[] generatedPassword;
		CredentialService cService = new CredentialService();
		
		int choice;
		System.out.println("please enter the Dept from the following");
		System.out.println("1. Technical Dept");
		System.out.println("2. Admin Dept");
		System.out.println("3. Human Resource Dept");
		System.out.println("4. Legal Dept");
		
		
		choice =  scan.nextInt();
		
		if (choice == 1) {
			generatedEmail =cService.generateEmailAddress(employee.getfirstName(),employee.getLastName(),"technical");
	        generatedPassword = cService.generatePassword();
	        cService.showCredentials(employee,generatedEmail, generatedPassword);
				}
		
		else if(choice == 2) {
			generatedEmail =cService.generateEmailAddress(employee.getfirstName(),employee.getLastName(),"admin");
			generatedPassword = cService.generatePassword();
			cService.showCredentials(employee,generatedEmail, generatedPassword);	
		}
		
		else if(choice == 3) {
			generatedEmail =cService.generateEmailAddress(employee.getfirstName(),employee.getLastName(),"Hr");
			generatedPassword = cService.generatePassword();
			cService.showCredentials(employee,generatedEmail, generatedPassword);
		}
		
		else if(choice == 4) {
			generatedEmail =cService.generateEmailAddress(employee.getfirstName(),employee.getLastName(),"legal");
		generatedPassword = cService.generatePassword();
		cService.showCredentials(employee,generatedEmail, generatedPassword);
	}
	    else {
		
		System.out.println("Invalid choice");
	}

}

}

