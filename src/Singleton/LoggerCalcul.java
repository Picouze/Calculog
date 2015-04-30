package Singleton;

import java.util.Observable;
import java.util.Observer;

/**
 * Classe créant le Singleton
 * @author DDaFox
 */
public class LoggerCalcul implements Observer {
	
	private static LoggerCalcul INSTANCE;
	private String log;
	
	/** 
	 * Constructeur privé
	 */
	private LoggerCalcul(){
		log = new String();
	}
	/** 
	 * 
	 * Point d'accès pour l'instance unique du singleton 
	 */
    public static synchronized LoggerCalcul getInstance(){
    	if(INSTANCE==null){
    		INSTANCE = new LoggerCalcul();
    	}
        return INSTANCE;
    }
	/**
	 * Méthode permetant d'ajouter le log
	 * @param log
	 */
    public void ajouterLog(String log){
    	this.log = "[INFO]" + log;
    }
    /**
     * Méthode retournant les logs
     * @return log
     */
    public String afficherLog(){
            return log;
    }
	@Override
	public void update(Observable o, Object arg) {
		System.out.println(afficherLog());
	}
}
