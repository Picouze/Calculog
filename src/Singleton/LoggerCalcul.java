package Singleton;
/**
 * @author DDaFox
 * Classe cr�ant le Singleton
 */
public class LoggerCalcul {
	
	private static LoggerCalcul INSTANCE;
	private String log;
	
	/** 
	 * @author DDaFox
	 * Constructeur priv�
	 */
	private LoggerCalcul(){
		log = new String();
	}
	/** 
	 * @author DDaFox
	 * Point d'acc�s pour l'instance unique du singleton 
	 */
    public static synchronized LoggerCalcul getInstance(){
    	if(INSTANCE==null){
    		INSTANCE = new LoggerCalcul();
    	}
        return INSTANCE;
    }
	/**
	 * @author DDaFox
	 * M�thode permetant d'ajouter le log
	 * @param log
	 */
    public void ajouterLog(String log){
        // On ajoute �galement la date du message.
    	this.log = "[INFO]" + log;
    }
    /**
     * @author DDaFox
     * M�thode retournant les logs
     * @return log
     */
    public String afficherLog(){
            return log;
    }
}
