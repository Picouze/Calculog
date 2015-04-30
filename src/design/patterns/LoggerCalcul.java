package design.patterns;

import java.util.Observable;

/**
 * Classe créant le Singleton
 * @author DDaFox
 */
public class LoggerCalcul extends Observable {
	
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
    public void setLog(String log){
    	this.log = "[INFO]" + log;
    	setChanged();
    	notifyObservers(this.log);
    }
    /**
     * Méthode retournant les logs
     * @return log
     */
    public String getLog(){
            return log;
    }
}
