package calcul;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

	/**
	 * Multplieure lol
	 * @author Picotez
	 * @param nb1
	 * @param nb2
	 * @return the result
	 */
	public int calculer(int nb1, int nb2, String type){
		int result = -1;
		if(type=="+"){
			result = nb1+nb2;
		}
		if(type=="-"){
			result = nb1-nb2;
		}
		if(type=="*"){
			result = nb1*nb2;
		}
		if(type=="/"){
			result = nb1/nb2;
		}
		return result;
	}
	
	public String detecterOperande(String operation){
		
		String type = "not found";
		
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
		List<String> nblist = new ArrayList<String>();
		String[] parts = operation.split("\\"+type);
		nblist.add(parts[0]);
		nblist.add(parts[1]);
		return nblist;
	}
	
	public String saisieOperation(){ 
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		return a;
	}

}
