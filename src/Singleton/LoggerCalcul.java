package Singleton;

import java.util.Observable;
import java.util.Observer;

/**
 * Classe cr�ant le Singleton
 * @author DDaFox
 */
public class LoggerCalcul implements Observer {
	
	private static LoggerCalcul INSTANCE;
	private String log;
	
	/** 
	 * Constructeur priv�
	 */
	private LoggerCalcul(){
		log = new String();
	}
	/** 
	 * 
	 * Point d'acc�s pour l'instance unique du singleton 
	 */
    public static synchronized LoggerCalcul getInstance(){
    	if(INSTANCE==null){
    		INSTANCE = new LoggerCalcul();
    	}
        return INSTANCE;
    }
	/**
	 * M�thode permetant d'ajouter le log
	 * @param log
	 */
    public void ajouterLog(String log){
    	this.log = "[INFO]" + log;
    }
    /**
     * M�thode retournant les logs
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
