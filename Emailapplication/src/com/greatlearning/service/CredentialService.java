package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {
	
	private String generatedPassword;
	public char[] generatePassword() {
		String capitalLetters ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers ="0123456789";
		String specialCharacters = "!@#$%^&*()_+<>?~";
		String values = capitalLetters + smallLetters + numbers + specialCharacters ;
		Random random = new Random();
		char[] password = new char[8];
		for(int i=0;i<8;i++)
		{
			password[i] = values.charAt(random.nextInt(values.length()));
			
		}
		return password;
		
	}
	public String generateEmailAddress(String firstName, String lastName,String  Department) {
	 
		String generatedEmail = firstName + lastName + "@" + Department + ".abc.com" ;
		return generatedEmail;

}
	public void showCredentials(Employee employee, String email,char[] generatepassword) {
		
		System.out.println("HI" + employee.getfirstName() +"your generated credential are as follows");
		System.out.println("Email is" + email);
		System.out.println("Password is" + generatePassword());
	}

}
