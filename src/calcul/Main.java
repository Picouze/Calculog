package calcul;

import java.util.*;
/**
 * Classe principal
 * @author Thomas
 *
 */
public class Main {	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		// On saisit l'opération
		String operation = calc.saisieOperation(); 
		//System.out.println(operation);
		// On détecte l'opérande (+, - , * ou /)
		String type = calc.detecterOperande(operation);
		//System.out.println(type);
		// On récupère les chiffres
		List<String> nblist = new ArrayList<String>();
		nblist = calc.decomposerOperation(operation, type);
		int nb1 = Integer.parseInt(nblist.get(0));
		int nb2 = Integer.parseInt(nblist.get(1));
		//On fait le calcul
		int resultat = calc.calculer(nb1,nb2,type);
		System.out.println(operation+"="+resultat);
	}
}
