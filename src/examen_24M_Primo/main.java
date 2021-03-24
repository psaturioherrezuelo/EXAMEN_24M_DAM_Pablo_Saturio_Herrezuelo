package examen_24M_Primo;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		int num;
		
		System.out.println("Buenos dias Ceinmark,\n"
				+ "soy Pablo Saturio Herrezuelo.\n"
				+ "\n"
				+ "Introduce un numero para averiguar si es primo o no:");

		num = ent.nextInt();
		
		primo(num);
		
	}
	
	public static void primo(int num) {
		
		boolean primo = true; 
	    
		for(int i = 2; i < num; i++) {
	        if (num % i == 0) {
	            primo = false;
	            break;
	        }
	    }
	    
	    if (primo == true) {
	    	System.out.println(num + " es primo");
	    } else {
	    	System.out.println(num + " no es primo");
	    }
	      
		
	}

}
