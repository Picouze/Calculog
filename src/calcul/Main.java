package calcul;

import java.util.*;
/**
 * Classe principal
 * @author Thomas
 *
 */
public class Main {	

	public static void main(String[] args) throws Exception {
		String nb1=null;
		String nb2=null;
		Calculator calc = new Calculator();
		// On saisit l'opération
		String operation = calc.saisieOperation(); 
		//System.out.println(operation);
		// On détecte l'opérande (+, - , * ou /)
		String type = calc.detecterOperande(operation);
		//System.out.println(type);
		// On récupère les chiffres
		List<String> nbList = new ArrayList<String>();
		nbList = calc.decomposerOperation(operation, type);
		if(nbList != null  && !nbList.isEmpty()){
			nb1 = nbList.get(0);
			nb2 = nbList.get(1);
		}
		//On fait le calcul
		calc.calculer(nb1,nb2,type);
	}
}