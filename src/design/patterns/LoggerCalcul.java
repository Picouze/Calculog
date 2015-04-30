package design.patterns;

import java.util.Observable;

/**
 * Classe cr�ant le Singleton
 * @author DDaFox
 */
public class LoggerCalcul extends Observable {
	
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
    public void setLog(String log){
    	this.log = "[INFO]" + log;
    	setChanged();
    	notifyObservers(this.log);
    }
    /**
     * M�thode retournant les logs
     * @return log
     */
    public String getLog(){
            return log;
    }
}
