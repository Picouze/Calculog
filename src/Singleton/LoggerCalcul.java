package Singleton;
/**
 * @author DDaFox
 * Classe créant le Singleton
 */
public class LoggerCalcul {
	
	private static LoggerCalcul INSTANCE;
	private String log;
	
	/** 
	 * @author DDaFox
	 * Constructeur privé
	 */
	private LoggerCalcul(){
		log = new String();
	}
	/** 
	 * @author DDaFox
	 * Point d'accès pour l'instance unique du singleton 
	 */
    public static synchronized LoggerCalcul getInstance(){
    	if(INSTANCE==null){
    		INSTANCE = new LoggerCalcul();
    	}
        return INSTANCE;
    }
	/**
	 * @author DDaFox
	 * Méthode permetant d'ajouter le log
	 * @param log
	 */
    public void ajouterLog(String log){
        // On ajoute également la date du message.
    	this.log = "[INFO]" + log;
    }
    /**
     * @author DDaFox
     * Méthode retournant les logs
     * @return log
     */
    public String afficherLog(){
            return log;
    }
}
