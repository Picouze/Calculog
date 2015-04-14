package calcul;

import java.util.Scanner;

public class Main {
	
	// coucou

	private int multiplier(int nb1, int nb2){
		int result = nb1*nb2;
		return result;
	}
	
	private int additioner(int nb1, int nb2){
		int result = nb1+nb2;
		return result;
	}
	
	private int soustracter(int nb1, int nb2){
		int result = nb2 - nb1;
		return result;
	}
	
	private int diviser(int nb1, int nb2){
		int result = nb2/nb1;
		return result;
	}
	
	private String detecterOperande(String operation){
		String type;
		type = "/";
		return type;
	}
	
	private static String saisieOperation(){ 
		Scanner scan = new Scanner(System.in);
		return scan.toString();
	}
	
	public static void main(String[] args) {
		String operation = saisieOperation();
		System.out.println(operation);
	}

}
