package org.lessons.java.security;
import java.util.Scanner;
public class PasswordGenerator {

	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo nome");
		
		String nome = input.nextLine();
		
		System.out.println("Inserisci il tuo cognome");
		
		String cognome = input.nextLine();
		
		System.out.println("Inserisci il tuo colore preferito");
		
		String colore = input.nextLine();
		
		System.out.println("Inserisci quando sei nato:");
		
		System.out.println("Giorno:");
		
		int giorno = input.nextInt();
		
		System.out.println("Mese:");
		
		int mese = input.nextInt();
		
		System.out.println("Anno:");
		
		int anno = input.nextInt();
		
		int nasce = giorno + mese + anno;
		
		System.out.println("La tua nuova password sarà:");
		
		System.out.println(nome + cognome + colore + nasce);	
	}
}
