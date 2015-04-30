package calcul;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import design.patterns.LoggerCalcul;

public class Calculator {
	/**
	 * Calcul le premier nombre avec le second selon son type
	 * @author Picouze
	 * @param nb1
	 * @param nb2
	 * @return the result
	 * @throws Exception 
	 */
	public int calculer(String nb1, String nb2, String type) throws Exception{
		int result;
		if(nb1 != null && nb2 != null){
			int nombre1 = Integer.parseInt(nb1);
			int nombre2 = Integer.parseInt(nb2);
			switch (type){
			case "+" :
				result = nombre1+nombre2;
				break;
			case "-" :
				result = nombre1-nombre2;
				break;
			case "*" :
				result = nombre1*nombre2;
				break;
			case "/" :
				if(nombre2 != 0){
					result = nombre1/nombre2;
					break;
				}else{
					LoggerCalcul.getInstance().setLog("Division par zéro");
					throw new ArithmeticException("Division par zéro");
				}
			default :
				LoggerCalcul.getInstance().setLog("Type non reconnu");
				throw new Exception();
			}
			LoggerCalcul.getInstance().setLog(String.valueOf(result));
			return result;
		}else{
			LoggerCalcul.getInstance().setLog("La syntaxe est incorecte");
			throw new Exception();
		}
	}
	
	public String detecterOperande(String operation){
		
		String type = null;
		if(operation.contains("+")){
			type = "+";
		}
		if(operation.contains("-")){
			type = "-";
		}
		if(operation.contains("*")){
			type = "*";
		}
		if(operation.contains("/")){
			type = "/";
		}
		return type;
	}
	
	public List<String> decomposerOperation(String operation, String type){
		if(type != null){
			List<String> nblist = new ArrayList<String>();
			String[] parts = operation.split("\\"+type);
			if(!parts[0].isEmpty() && !parts[1].isEmpty()){
				nblist.add(parts[0]);
				nblist.add(parts[1]);
			return nblist;
			}
		}
		return null;
	}
	
	public String saisieOperation(){ 
		Scanner scanner = new Scanner(System.in);
		String operation = scanner.next();
		scanner.close();
		return operation;
	}

}
